package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_resource_manager_data_supply_type implements CEnum {

    ma_resource_manager_data_supply_type_unknown(0), ma_resource_manager_data_supply_type_encoded(1), ma_resource_manager_data_supply_type_decoded(2), ma_resource_manager_data_supply_type_decoded_paged(3);

    private static final int __size = 4;

    private final int index;

    ma_resource_manager_data_supply_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_resource_manager_data_supply_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_resource_manager_data_supply_type_unknown;
            case 1:
                return ma_resource_manager_data_supply_type_encoded;
            case 2:
                return ma_resource_manager_data_supply_type_decoded;
            case 3:
                return ma_resource_manager_data_supply_type_decoded_paged;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_resource_manager_data_supply_typePointer extends EnumPointer<ma_resource_manager_data_supply_type> {

        public ma_resource_manager_data_supply_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_supply_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_supply_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_supply_typePointer() {
            this(1, true);
        }

        public ma_resource_manager_data_supply_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_resource_manager_data_supply_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_resource_manager_data_supply_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
