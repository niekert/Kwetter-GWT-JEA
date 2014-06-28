@ECHO OFF
ECHO ********************************
ECHO *   hosted mode debug script   *
ECHO ********************************
ECHO * expects mvn.bat in your PATH *
ECHO * which resides in:            *
ECHO * NETBEANS_DIR\java\maven\bin  *
ECHO * where NETBEANS_DIR is your   *
ECHO * netbeans install folder      *
ECHO ********************************
ECHO * expects JAVA_HOME to point   *
ECHO * to your JDK                  *
ECHO ********************************
ECHO * connect debugger to port 8000*
ECHO * once the script pauses       *
ECHO ********************************
mvn gwt:debug -Dgwt.extraJvmArgs="-Xmx2048M -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled"