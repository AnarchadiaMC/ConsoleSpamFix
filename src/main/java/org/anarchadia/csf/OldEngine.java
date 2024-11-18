package org.anarchadia.csf;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LifeCycle;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.message.Message;

import java.util.concurrent.TimeUnit;

public class OldEngine
        implements EngineInterface {
    private CSF csf;
    private int msgHidden = 0;

    public OldEngine(CSF csf) {
        this.csf = csf;
    }

    @Override
    public int getHiddenMessagesCount() {
        return this.msgHidden;
    }

    @Override
    public void addHiddenMsg() {
        ++this.msgHidden;
    }

    @Override
    public void hideConsoleMessages() {
        ((Logger)((Object)LogManager.getRootLogger())).addFilter(new Filter(){

            public Filter.Result filter(LogEvent event) {
                if (!OldEngine.this.csf.getConfigHandler().getStringList("Messages-To-Hide-Filter").isEmpty()) {
                    for (String s : OldEngine.this.csf.getConfigHandler().getStringList("Messages-To-Hide-Filter")) {
                        if (!event.getMessage().toString().contains(s)) continue;
                        OldEngine oldEngine = OldEngine.this;
                        oldEngine.msgHidden = oldEngine.msgHidden + 1;
                        return Filter.Result.DENY;
                    }
                }
                return null;
            }

            @Override
            public Filter.Result filter(Logger arg0, Level arg1, Marker arg2, String arg3, Object ... arg4) {
                return null;
            }

            @Override
            public Filter.Result filter(Logger arg0, Level arg1, Marker arg2, Object arg3, Throwable arg4) {
                return null;
            }

            @Override
            public Filter.Result filter(Logger arg0, Level arg1, Marker arg2, Message arg3, Throwable arg4) {
                return null;
            }

            @Override
            public Filter.Result getOnMatch() {
                return null;
            }

            @Override
            public Filter.Result getOnMismatch() {
                return null;
            }

            @Override
            public void stop() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.stop()\n");
            }

            @Override
            public boolean isStarted() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.isStarted()\n");
            }

            @Override
            public void initialize() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.initialize()\n");
            }

            @Override
            public boolean isStopped() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.isStopped()\n");
            }

            @Override
            public boolean stop(long timeout, TimeUnit timeUnit) {
                return false;
            }

            @Override
            public void start() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.start()\n");
            }

            @Override
            public LifeCycle.State getState() {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method LifeCycle.getState()\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object, Object, Object, Object, Object)\n");
            }

            @Override
            public Filter.Result filter(Logger logger, Level level, Marker marker, String string, Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
                throw new Error("Unresolved compilation problem: \n\tThe type new Filter(){} must implement the inherited abstract method Filter.filter(Logger, Level, Marker, String, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object)\n");
            }
        });
    }
}