package com.runesuite.client.plugins

import org.kxtra.slf4j.loggerfactory.getLogger
import java.nio.file.Path
import javax.annotation.OverridingMethodsMustInvokeSuper

abstract class Plugin<T : PluginSettings> {

    val logger = getLogger(javaClass)

    open val settingsWriter: ObjectReadWriter<T> = ObjectReadWriter.Yaml()

    abstract val defaultSettings: T

    lateinit var settings: T
        private set

    lateinit var directory: Path
        private set

    internal fun setSettings(settings: T) {
        this.settings = settings
    }

    internal fun setDirectory(directory: Path) {
        this.directory = directory
    }

    @OverridingMethodsMustInvokeSuper
    open fun create() {
        logger.info("create")
    }

    @OverridingMethodsMustInvokeSuper
    open fun start() {
        logger.info("start")
    }

    @OverridingMethodsMustInvokeSuper
    open fun stop() {
        logger.info("stop")
    }

    @OverridingMethodsMustInvokeSuper
    open fun destroy() {
        logger.info("destroy")
    }
}