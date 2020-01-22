package plugins;

import reflection.IPlugin;

public class Plugin1 implements IPlugin {

    @Override
    public void fazQualQuerCoisa() {
        System.out.println("Sou o plugin 1!");
    }
    
}