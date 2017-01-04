package uk.co.conclipsegames.greaterdruidry;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by James Swire on 03/01/2017.
 */
public class utils{
        private static boolean debug = false;
        public static void log(Level logLevel, Object object) { FMLLog.log(GreaterDruidry.modId, logLevel, String.valueOf(object)); }

        public static void error(Object object) { log(Level.ERROR, object); }

        public static void info(Object object) { log(Level.INFO, object); }

        public static void warn(Object object) { log(Level.WARN, object); }

        public static void debug(Object object) { if (debug) { log(Level.DEBUG, object); } }
}
