package org.kde.kdeconnect.Plugins.SystemVolumePlugin;

public class CacheSink {

    private Sink sink;
    private SystemVolumePlugin plugin;

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    public SystemVolumePlugin getPlugin() {
        return plugin;
    }

    public void setPlugin(SystemVolumePlugin plugin) {
        this.plugin = plugin;
    }

    public boolean isNotNull() {
        return this.sink != null && this.plugin != null;
    }
}
