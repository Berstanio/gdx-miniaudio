package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_result;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_supply;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_buffer_node;

public final class ma_resource_manager_data_buffer_node extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(198).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_buffer_node(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_buffer_node(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_buffer_node() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer asPointer() {
        return new ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer ptr) {
        ptr.setPointer(this);
    }

    public long hashedName32() {
        return getBufPtr().getUInt(0);
    }

    public void hashedName32(long hashedName32) {
        getBufPtr().setUInt(0, hashedName32);
    }

    public long refCount() {
        return getBufPtr().getUInt(4);
    }

    public void refCount(long refCount) {
        getBufPtr().setUInt(4, refCount);
    }

    public ma_result result() {
        return ma_result.getByIndex((int) getBufPtr().getInt(8));
    }

    public void result(ma_result result) {
        getBufPtr().setInt(8, result.getIndex());
    }

    public long executionCounter() {
        return getBufPtr().getUInt(12);
    }

    public void executionCounter(long executionCounter) {
        getBufPtr().setUInt(12, executionCounter);
    }

    public long executionPointer() {
        return getBufPtr().getUInt(16);
    }

    public void executionPointer(long executionPointer) {
        getBufPtr().setUInt(16, executionPointer);
    }

    public long isDataOwnedByResourceManager() {
        return getBufPtr().getUInt(20);
    }

    public void isDataOwnedByResourceManager(long isDataOwnedByResourceManager) {
        getBufPtr().setUInt(20, isDataOwnedByResourceManager);
    }

    public ma_resource_manager_data_supply data() {
        return new ma_resource_manager_data_supply(getPointer() + (24), false);
    }

    public void data(ma_resource_manager_data_supply toSetPtr) {
        toSetPtr.setPointer(getPointer() + (24), CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 64, this);
    }

    public ma_resource_manager_data_supply getData() {
        return new ma_resource_manager_data_supply(getBufPtr().duplicate(24, CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 64), true);
    }

    public void getData(ma_resource_manager_data_supply toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 24, CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 64);
    }

    public void setData(ma_resource_manager_data_supply toCopyFrom) {
        getBufPtr().copyFrom(24, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 44 : 64);
    }

    public ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pParent() {
        return new ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer(getBufPtr().getNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 68 : 88), false);
    }

    public void pParent(ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pParent) {
        getBufPtr().setNativePointer(CHandler.IS_COMPILED_ANDROID_X86 ? 68 : 88, pParent.getPointer());
    }

    public ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pChildLo() {
        return new ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 92), false);
    }

    public void pChildLo(ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pChildLo) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 72 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 96 : 92, pChildLo.getPointer());
    }

    public ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pChildHi() {
        return new ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 104), false);
    }

    public void pChildHi(ma_resource_manager_data_buffer_node.ma_resource_manager_data_buffer_nodePointer pChildHi) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 76 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 96 : 104, pChildHi.getPointer());
    }

    public static final class ma_resource_manager_data_buffer_nodePointer extends StackElementPointer<ma_resource_manager_data_buffer_node> {

        public ma_resource_manager_data_buffer_nodePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_buffer_nodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_buffer_nodePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_buffer_nodePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_buffer_nodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_buffer_nodePointer() {
            this(1, true);
        }

        public ma_resource_manager_data_buffer_nodePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_buffer_node createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_buffer_node(ptr, freeOnGC);
        }
    }
}
