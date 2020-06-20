package io.agora.openvcall.model;

public class CurrentUserSettings {
    public int mEncryptionModeIndex;

    public String mEncryptionKey;

    public String mChannelName;

    public CurrentUserSettings() {
        reset();
    }

    public void reset() {
    }

    public static final int MAX_PEER_COUNT = 4;
    public static final String ACTION_KEY_CHANNEL_NAME = "ecHANEL";
    public static final String ACTION_KEY_ENCRYPTION_KEY = "xdL_encr_key_";
    public static final String ACTION_KEY_ENCRYPTION_MODE = "tOK_edsx_Mode";

    public static class AppError {
        public static final int NO_CONNECTION_ERROR = 3;
    }

}
