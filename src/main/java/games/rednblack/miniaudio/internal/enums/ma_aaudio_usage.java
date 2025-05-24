package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_aaudio_usage implements CEnum {

    ma_aaudio_usage_default(0),
    ma_aaudio_usage_media(1),
    ma_aaudio_usage_voice_communication(2),
    ma_aaudio_usage_voice_communication_signalling(3),
    ma_aaudio_usage_alarm(4),
    ma_aaudio_usage_notification(5),
    ma_aaudio_usage_notification_ringtone(6),
    ma_aaudio_usage_notification_event(7),
    ma_aaudio_usage_assistance_accessibility(8),
    ma_aaudio_usage_assistance_navigation_guidance(9),
    ma_aaudio_usage_assistance_sonification(10),
    ma_aaudio_usage_game(11),
    ma_aaudio_usage_assitant(12),
    ma_aaudio_usage_emergency(13),
    ma_aaudio_usage_safety(14),
    ma_aaudio_usage_vehicle_status(15),
    ma_aaudio_usage_announcement(16);

    private static final int __size = 4;

    private final int index;

    ma_aaudio_usage(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_aaudio_usage getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_aaudio_usage_default;
            case 1:
                return ma_aaudio_usage_media;
            case 2:
                return ma_aaudio_usage_voice_communication;
            case 3:
                return ma_aaudio_usage_voice_communication_signalling;
            case 4:
                return ma_aaudio_usage_alarm;
            case 5:
                return ma_aaudio_usage_notification;
            case 6:
                return ma_aaudio_usage_notification_ringtone;
            case 7:
                return ma_aaudio_usage_notification_event;
            case 8:
                return ma_aaudio_usage_assistance_accessibility;
            case 9:
                return ma_aaudio_usage_assistance_navigation_guidance;
            case 10:
                return ma_aaudio_usage_assistance_sonification;
            case 11:
                return ma_aaudio_usage_game;
            case 12:
                return ma_aaudio_usage_assitant;
            case 13:
                return ma_aaudio_usage_emergency;
            case 14:
                return ma_aaudio_usage_safety;
            case 15:
                return ma_aaudio_usage_vehicle_status;
            case 16:
                return ma_aaudio_usage_announcement;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_aaudio_usagePointer extends EnumPointer<ma_aaudio_usage> {

        public ma_aaudio_usagePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_aaudio_usagePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_aaudio_usagePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_aaudio_usagePointer() {
            this(1, true);
        }

        public ma_aaudio_usagePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_aaudio_usage getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_aaudio_usage value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
