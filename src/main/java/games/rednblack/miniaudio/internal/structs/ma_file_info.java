package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_file_info extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(132).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_file_info(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_file_info(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_file_info() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_file_info.ma_file_infoPointer asPointer() {
        return new ma_file_info.ma_file_infoPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_file_info.ma_file_infoPointer ptr) {
        ptr.setPointer(this);
    }

    public long sizeInBytes() {
        return getBufPtr().getLong(0);
    }

    public void sizeInBytes(long sizeInBytes) {
        getBufPtr().setLong(0, sizeInBytes);
    }

    public static final class ma_file_infoPointer extends StackElementPointer<ma_file_info> {

        public ma_file_infoPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_file_infoPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_file_infoPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_file_infoPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_file_infoPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_file_infoPointer() {
            this(1, true);
        }

        public ma_file_infoPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_file_info createStackElement(long ptr, boolean freeOnGC) {
            return new ma_file_info(ptr, freeOnGC);
        }
    }
}
