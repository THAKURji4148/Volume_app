package com.thakurgdev.soniclock

import android.util.Log
import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin
import org.godotengine.godot.plugin.CppSignatures

class SystemAudioLocker(godot: Godot) : GodotPlugin(godot) {

    override fun getPluginName(): String {
        return "SystemAudioLocker"
    }

    init {
        Log.d("SystemAudioLocker", "Sonic Lock Kotlin Plugin Initialized successfully!")
    }
}
