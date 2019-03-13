/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author maksim.khramov
 */
public class Scene extends FileModel {
    
    private final List<Material> materials = new ArrayList<>();
    private final Map<SObjectRef, SObject> scene = new HashMap<>();
    
    public Stream<Material> getMaterials() {
        return materials.stream();
    }
}
