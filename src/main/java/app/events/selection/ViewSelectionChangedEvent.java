/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.events.selection;

import app.model.SObjectRef;
import app.view.View;
import java.util.Set;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 *
 * @author maksim.khramov
 */


@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
public class ViewSelectionChangedEvent {
    @NonNull private View view;
    @NonNull private Set<SObjectRef> selection;
    
    
}
