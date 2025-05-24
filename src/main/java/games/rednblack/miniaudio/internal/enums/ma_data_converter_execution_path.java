package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_data_converter_execution_path implements CEnum {

    ma_data_converter_execution_path_passthrough(0),
    ma_data_converter_execution_path_format_only(1),
    ma_data_converter_execution_path_channels_only(2),
    ma_data_converter_execution_path_resample_only(3),
    ma_data_converter_execution_path_resample_first(4),
    ma_data_converter_execution_path_channels_first(5);

    private static final int __size = 4;

    private final int index;

    ma_data_converter_execution_path(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_data_converter_execution_path getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_data_converter_execution_path_passthrough;
            case 1:
                return ma_data_converter_execution_path_format_only;
            case 2:
                return ma_data_converter_execution_path_channels_only;
            case 3:
                return ma_data_converter_execution_path_resample_only;
            case 4:
                return ma_data_converter_execution_path_resample_first;
            case 5:
                return ma_data_converter_execution_path_channels_first;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_data_converter_execution_pathPointer extends EnumPointer<ma_data_converter_execution_path> {

        public ma_data_converter_execution_pathPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_data_converter_execution_pathPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_data_converter_execution_pathPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_data_converter_execution_pathPointer() {
            this(1, true);
        }

        public ma_data_converter_execution_pathPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_data_converter_execution_path getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_data_converter_execution_path value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
