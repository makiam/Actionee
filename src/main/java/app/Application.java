package app;

import app.actions.NewModelAction;
import app.actions.NewViewAction;
import app.events.ModelAddEvent;
import app.events.ViewChangedEvent;
import app.model.Model;
import app.view.View;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import lombok.Getter;
import lombok.extern.java.Log;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

@Log
public final class Application {

    private final EventBus bus = EventBus.getDefault();
    
    private Application() {
        init();
    }
    
    private void init() {
        bus.register(this);
    }
    
    private static Application instance = null;
    
    private final Map<Model, LinkedList<View>> modelViewsMap = new HashMap<>();

    @Getter
    private View activeView = null;

    
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Application.getInstance().run(args);
    }
    
    public static Application getInstance() {
        if(null == instance) {
            instance = new Application();
        }
        return instance;
    }
    
    public void run(String... args) {
        new NewModelAction().actionPerformed(null);
        
        modelViewsMap.keySet().forEach((Model model) -> {
            new NewViewAction(model).actionPerformed(null);
        });
    }
    
    @Subscribe
    public void onModelAddEvent(ModelAddEvent event) {
        logger.log(Level.FINE, "Model Added: {0}", event.getModel());
        modelViewsMap.put(event.getModel(), new LinkedList<>());
    }
    
    @Subscribe
    public void onViewActivated(ViewChangedEvent event) {
        logger.log(Level.FINE, "Recieved ViewChanged Event. View: {0}", event.getView());
        activeView = event.getView();
    }

    public final void bind(Model model, View view) {
        LinkedList<View> views = modelViewsMap.getOrDefault(view, new LinkedList<>());
        views.add(view);
    }
    
    
    
}

