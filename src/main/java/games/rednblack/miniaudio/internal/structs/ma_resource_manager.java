package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_resource_manager extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(195).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager.ma_resource_managerPointer asPointer() {
        return new ma_resource_manager.ma_resource_managerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager.ma_resource_managerPointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_resource_managerPointer extends StackElementPointer<ma_resource_manager> {

        public ma_resource_managerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_managerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_managerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_managerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_managerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_managerPointer() {
            this(1, true);
        }

        public ma_resource_managerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager(ptr, freeOnGC);
        }
    }
}
