package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_result implements CEnum {

    MA_FAILED_TO_STOP_BACKEND_DEVICE(-403),
    MA_FAILED_TO_START_BACKEND_DEVICE(-402),
    MA_FAILED_TO_OPEN_BACKEND_DEVICE(-401),
    MA_FAILED_TO_INIT_BACKEND(-400),
    MA_DEVICE_NOT_STOPPED(-303),
    MA_DEVICE_NOT_STARTED(-302),
    MA_DEVICE_ALREADY_INITIALIZED(-301),
    MA_DEVICE_NOT_INITIALIZED(-300),
    MA_BACKEND_NOT_ENABLED(-208),
    MA_LOOP(-207),
    MA_INVALID_DEVICE_CONFIG(-206),
    MA_API_NOT_FOUND(-205),
    MA_NO_DEVICE(-204),
    MA_NO_BACKEND(-203),
    MA_SHARE_MODE_NOT_SUPPORTED(-202),
    MA_DEVICE_TYPE_NOT_SUPPORTED(-201),
    MA_FORMAT_NOT_SUPPORTED(-200),
    MA_CRC_MISMATCH(-100),
    MA_MEMORY_ALREADY_MAPPED(-52),
    MA_CANCELLED(-51),
    MA_IN_PROGRESS(-50),
    MA_NO_HOST(-49),
    MA_CONNECTION_REFUSED(-48),
    MA_NOT_CONNECTED(-47),
    MA_ALREADY_CONNECTED(-46),
    MA_CONNECTION_RESET(-45),
    MA_SOCKET_NOT_SUPPORTED(-44),
    MA_ADDRESS_FAMILY_NOT_SUPPORTED(-43),
    MA_PROTOCOL_FAMILY_NOT_SUPPORTED(-42),
    MA_PROTOCOL_NOT_SUPPORTED(-41),
    MA_PROTOCOL_UNAVAILABLE(-40),
    MA_BAD_PROTOCOL(-39),
    MA_NO_ADDRESS(-38),
    MA_NOT_SOCKET(-37),
    MA_NOT_UNIQUE(-36),
    MA_NO_NETWORK(-35),
    MA_TIMEOUT(-34),
    MA_INVALID_DATA(-33),
    MA_NO_DATA_AVAILABLE(-32),
    MA_BAD_MESSAGE(-31),
    MA_NO_MESSAGE(-30),
    MA_NOT_IMPLEMENTED(-29),
    MA_TOO_MANY_LINKS(-28),
    MA_DEADLOCK(-27),
    MA_BAD_PIPE(-26),
    MA_BAD_SEEK(-25),
    MA_BAD_ADDRESS(-24),
    MA_ALREADY_IN_USE(-23),
    MA_UNAVAILABLE(-22),
    MA_INTERRUPT(-21),
    MA_IO_ERROR(-20),
    MA_BUSY(-19),
    MA_NO_SPACE(-18),
    MA_AT_END(-17),
    MA_DIRECTORY_NOT_EMPTY(-16),
    MA_IS_DIRECTORY(-15),
    MA_NOT_DIRECTORY(-14),
    MA_NAME_TOO_LONG(-13),
    MA_PATH_TOO_LONG(-12),
    MA_TOO_BIG(-11),
    MA_INVALID_FILE(-10),
    MA_TOO_MANY_OPEN_FILES(-9),
    MA_ALREADY_EXISTS(-8),
    MA_DOES_NOT_EXIST(-7),
    MA_ACCESS_DENIED(-6),
    MA_OUT_OF_RANGE(-5),
    MA_OUT_OF_MEMORY(-4),
    MA_INVALID_OPERATION(-3),
    MA_INVALID_ARGS(-2),
    MA_ERROR(-1),
    MA_SUCCESS(0);

    private static final int __size = 4;

    private final int index;

    ma_result(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_result getByIndex(int index) {
        switch(index) {
            case 0:
                return MA_SUCCESS;
            case -1:
                return MA_ERROR;
            case -2:
                return MA_INVALID_ARGS;
            case -3:
                return MA_INVALID_OPERATION;
            case -4:
                return MA_OUT_OF_MEMORY;
            case -5:
                return MA_OUT_OF_RANGE;
            case -6:
                return MA_ACCESS_DENIED;
            case -7:
                return MA_DOES_NOT_EXIST;
            case -8:
                return MA_ALREADY_EXISTS;
            case -9:
                return MA_TOO_MANY_OPEN_FILES;
            case -10:
                return MA_INVALID_FILE;
            case -11:
                return MA_TOO_BIG;
            case -12:
                return MA_PATH_TOO_LONG;
            case -13:
                return MA_NAME_TOO_LONG;
            case -14:
                return MA_NOT_DIRECTORY;
            case -15:
                return MA_IS_DIRECTORY;
            case -16:
                return MA_DIRECTORY_NOT_EMPTY;
            case -400:
                return MA_FAILED_TO_INIT_BACKEND;
            case -17:
                return MA_AT_END;
            case -401:
                return MA_FAILED_TO_OPEN_BACKEND_DEVICE;
            case -18:
                return MA_NO_SPACE;
            case -402:
                return MA_FAILED_TO_START_BACKEND_DEVICE;
            case -19:
                return MA_BUSY;
            case -403:
                return MA_FAILED_TO_STOP_BACKEND_DEVICE;
            case -20:
                return MA_IO_ERROR;
            case -21:
                return MA_INTERRUPT;
            case -22:
                return MA_UNAVAILABLE;
            case -23:
                return MA_ALREADY_IN_USE;
            case -24:
                return MA_BAD_ADDRESS;
            case -25:
                return MA_BAD_SEEK;
            case -26:
                return MA_BAD_PIPE;
            case -27:
                return MA_DEADLOCK;
            case -28:
                return MA_TOO_MANY_LINKS;
            case -29:
                return MA_NOT_IMPLEMENTED;
            case -30:
                return MA_NO_MESSAGE;
            case -31:
                return MA_BAD_MESSAGE;
            case -32:
                return MA_NO_DATA_AVAILABLE;
            case -33:
                return MA_INVALID_DATA;
            case -34:
                return MA_TIMEOUT;
            case -35:
                return MA_NO_NETWORK;
            case -36:
                return MA_NOT_UNIQUE;
            case -37:
                return MA_NOT_SOCKET;
            case -38:
                return MA_NO_ADDRESS;
            case -39:
                return MA_BAD_PROTOCOL;
            case -40:
                return MA_PROTOCOL_UNAVAILABLE;
            case -41:
                return MA_PROTOCOL_NOT_SUPPORTED;
            case -42:
                return MA_PROTOCOL_FAMILY_NOT_SUPPORTED;
            case -43:
                return MA_ADDRESS_FAMILY_NOT_SUPPORTED;
            case -44:
                return MA_SOCKET_NOT_SUPPORTED;
            case -300:
                return MA_DEVICE_NOT_INITIALIZED;
            case -45:
                return MA_CONNECTION_RESET;
            case -301:
                return MA_DEVICE_ALREADY_INITIALIZED;
            case -46:
                return MA_ALREADY_CONNECTED;
            case -302:
                return MA_DEVICE_NOT_STARTED;
            case -47:
                return MA_NOT_CONNECTED;
            case -303:
                return MA_DEVICE_NOT_STOPPED;
            case -48:
                return MA_CONNECTION_REFUSED;
            case -49:
                return MA_NO_HOST;
            case -50:
                return MA_IN_PROGRESS;
            case -51:
                return MA_CANCELLED;
            case -52:
                return MA_MEMORY_ALREADY_MAPPED;
            case -200:
                return MA_FORMAT_NOT_SUPPORTED;
            case -201:
                return MA_DEVICE_TYPE_NOT_SUPPORTED;
            case -202:
                return MA_SHARE_MODE_NOT_SUPPORTED;
            case -203:
                return MA_NO_BACKEND;
            case -204:
                return MA_NO_DEVICE;
            case -205:
                return MA_API_NOT_FOUND;
            case -206:
                return MA_INVALID_DEVICE_CONFIG;
            case -207:
                return MA_LOOP;
            case -208:
                return MA_BACKEND_NOT_ENABLED;
            case -100:
                return MA_CRC_MISMATCH;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_resultPointer extends EnumPointer<ma_result> {

        public ma_resultPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resultPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resultPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resultPointer() {
            this(1, true);
        }

        public ma_resultPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_result getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getInt(index * __size));
        }

        public void setEnumValue(ma_result value, int index) {
            getBufPtr().setInt(index * __size, value.getIndex());
        }
    }
}
