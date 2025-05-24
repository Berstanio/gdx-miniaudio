package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_log;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_vtable;

public final class ma_resource_manager_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(196).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_config.ma_resource_manager_configPointer asPointer() {
        return new ma_resource_manager_config.ma_resource_manager_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_config.ma_resource_manager_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer(), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public ma_log.ma_logPointer pLog() {
        return new ma_log.ma_logPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false);
    }

    public void pLog(ma_log.ma_logPointer pLog) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pLog.getPointer());
    }

    public ma_format decodedFormat() {
        return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 40 : 20));
    }

    public void decodedFormat(ma_format decodedFormat) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 40 : 20, decodedFormat.getIndex());
    }

    public long decodedChannels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 44 : 24);
    }

    public void decodedChannels(long decodedChannels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 44 : 24, decodedChannels);
    }

    public long decodedSampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 48 : 28);
    }

    public void decodedSampleRate(long decodedSampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 48 : 28, decodedSampleRate);
    }

    public long jobThreadCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 52 : 32);
    }

    public void jobThreadCount(long jobThreadCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 52 : 32, jobThreadCount);
    }

    public long jobThreadStackSize() {
        return getBufPtr().getNativeULong(CHandler.IS_64_BIT ? 56 : 36);
    }

    public void jobThreadStackSize(long jobThreadStackSize) {
        getBufPtr().setNativeULong(CHandler.IS_64_BIT ? 56 : 36, jobThreadStackSize);
    }

    public long jobQueueCapacity() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 60 : 40);
    }

    public void jobQueueCapacity(long jobQueueCapacity) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 60 : 40, jobQueueCapacity);
    }

    public long flags() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 44);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 64 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 44, flags);
    }

    public VoidPointer pVFS() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 72 : 48), false);
    }

    public void pVFS(VoidPointer pVFS) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 72 : 48, pVFS.getPointer());
    }

    public PointerPointer<ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer> ppCustomDecodingBackendVTables() {
        return new PointerPointer<>(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 80 : 52), false, ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer::new);
    }

    public void ppCustomDecodingBackendVTables(PointerPointer<ma_decoding_backend_vtable.ma_decoding_backend_vtablePointer> ppCustomDecodingBackendVTables) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 80 : 52, ppCustomDecodingBackendVTables.getPointer());
    }

    public long customDecodingBackendCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 88 : 56);
    }

    public void customDecodingBackendCount(long customDecodingBackendCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 88 : 56, customDecodingBackendCount);
    }

    public VoidPointer pCustomDecodingBackendUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 96 : 60), false);
    }

    public void pCustomDecodingBackendUserData(VoidPointer pCustomDecodingBackendUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 96 : 60, pCustomDecodingBackendUserData.getPointer());
    }

    public static final class ma_resource_manager_configPointer extends StackElementPointer<ma_resource_manager_config> {

        public ma_resource_manager_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_configPointer() {
            this(1, true);
        }

        public ma_resource_manager_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_config(ptr, freeOnGC);
        }
    }
}
