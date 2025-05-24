package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_vfs_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;

public final class ma_default_vfs extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(108).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_default_vfs(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_default_vfs(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_default_vfs() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_default_vfs.ma_default_vfsPointer asPointer() {
        return new ma_default_vfs.ma_default_vfsPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_default_vfs.ma_default_vfsPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_vfs_callbacks cb() {
        return new ma_vfs_callbacks(getPointer(), false);
    }

    public void cb(ma_vfs_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 64 : 32, this);
    }

    public ma_vfs_callbacks getCb() {
        return new ma_vfs_callbacks(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 64 : 32), true);
    }

    public void getCb(ma_vfs_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 32);
    }

    public void setCb(ma_vfs_callbacks toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 64 : 32);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (CHandler.IS_64_BIT ? 64 : 32), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 64 : 32), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(CHandler.IS_64_BIT ? 64 : 32, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 64 : 32, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 64 : 32, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public static final class ma_default_vfsPointer extends StackElementPointer<ma_default_vfs> {

        public ma_default_vfsPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_default_vfsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_default_vfsPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_default_vfsPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_default_vfsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_default_vfsPointer() {
            this(1, true);
        }

        public ma_default_vfsPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_default_vfs createStackElement(long ptr, boolean freeOnGC) {
            return new ma_default_vfs(ptr, freeOnGC);
        }
    }
}
