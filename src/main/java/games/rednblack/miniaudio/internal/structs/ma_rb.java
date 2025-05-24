package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;

/**
 * ********************************************************************************************************************************************************
 * Ring Buffer
 * *********************************************************************************************************************************************************
 */
public final class ma_rb extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(191).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_rb(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_rb(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_rb() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_rb.ma_rbPointer asPointer() {
        return new ma_rb.ma_rbPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_rb.ma_rbPointer ptr) {
        ptr.setPointer(this);
    }

    public VoidPointer pBuffer() {
        return new VoidPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pBuffer(VoidPointer pBuffer) {
        getBufPtr().setNativePointer(0, pBuffer.getPointer());
    }

    public long subbufferSizeInBytes() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4);
    }

    public void subbufferSizeInBytes(long subbufferSizeInBytes) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, subbufferSizeInBytes);
    }

    public long subbufferCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
    }

    public void subbufferCount(long subbufferCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, subbufferCount);
    }

    public long subbufferStrideInBytes() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12);
    }

    public void subbufferStrideInBytes(long subbufferStrideInBytes) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, subbufferStrideInBytes);
    }

    public long encodedReadOffset() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 16);
    }

    public void encodedReadOffset(long encodedReadOffset) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 16, encodedReadOffset);
    }

    public long encodedWriteOffset() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 20);
    }

    public void encodedWriteOffset(long encodedWriteOffset) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 20, encodedWriteOffset);
    }

    public char ownsBuffer() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 28 : 24);
    }

    public void ownsBuffer(char ownsBuffer) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 28 : 24, ownsBuffer);
    }

    public char clearOnWriteAcquire() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 29 : 25);
    }

    public void clearOnWriteAcquire(char clearOnWriteAcquire) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 29 : 25, clearOnWriteAcquire);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (CHandler.IS_64_BIT ? 32 : 28), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 32 : 28), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(CHandler.IS_64_BIT ? 32 : 28, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 32 : 28, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 32 : 28, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public static final class ma_rbPointer extends StackElementPointer<ma_rb> {

        public ma_rbPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_rbPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_rbPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_rbPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_rbPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_rbPointer() {
            this(1, true);
        }

        public ma_rbPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_rb createStackElement(long ptr, boolean freeOnGC) {
            return new ma_rb(ptr, freeOnGC);
        }
    }
}
