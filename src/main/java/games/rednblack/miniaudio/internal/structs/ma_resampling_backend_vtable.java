package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_resampling_backend_vtable;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_resampling_backend_vtable_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.ULongPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UInt64Pointer;

public final class ma_resampling_backend_vtable extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(194).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resampling_backend_vtable(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resampling_backend_vtable(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resampling_backend_vtable() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer asPointer() {
        return new ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resampling_backend_vtable.ma_resampling_backend_vtablePointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_resampling_backend_vtable.onGetHeapSize> onGetHeapSize() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_resampling_backend_vtable_Internal.onGetHeapSize_Internal::onGetHeapSize_downcall);
    }

    public void onGetHeapSize(ClosureObject<ma_resampling_backend_vtable.onGetHeapSize> onGetHeapSize) {
        getBufPtr().setNativePointer(0, onGetHeapSize.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onInit> onInit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_resampling_backend_vtable_Internal.onInit_Internal::onInit_downcall);
    }

    public void onInit(ClosureObject<ma_resampling_backend_vtable.onInit> onInit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onInit.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onUninit> onUninit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_resampling_backend_vtable_Internal.onUninit_Internal::onUninit_downcall);
    }

    public void onUninit(ClosureObject<ma_resampling_backend_vtable.onUninit> onUninit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onUninit.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onProcess> onProcess() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_resampling_backend_vtable_Internal.onProcess_Internal::onProcess_downcall);
    }

    public void onProcess(ClosureObject<ma_resampling_backend_vtable.onProcess> onProcess) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onProcess.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onSetRate> onSetRate() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), ma_resampling_backend_vtable_Internal.onSetRate_Internal::onSetRate_downcall);
    }

    public void onSetRate(ClosureObject<ma_resampling_backend_vtable.onSetRate> onSetRate) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, onSetRate.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onGetInputLatency> onGetInputLatency() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), ma_resampling_backend_vtable_Internal.onGetInputLatency_Internal::onGetInputLatency_downcall);
    }

    public void onGetInputLatency(ClosureObject<ma_resampling_backend_vtable.onGetInputLatency> onGetInputLatency) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, onGetInputLatency.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onGetOutputLatency> onGetOutputLatency() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), ma_resampling_backend_vtable_Internal.onGetOutputLatency_Internal::onGetOutputLatency_downcall);
    }

    public void onGetOutputLatency(ClosureObject<ma_resampling_backend_vtable.onGetOutputLatency> onGetOutputLatency) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, onGetOutputLatency.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 28), ma_resampling_backend_vtable_Internal.onGetRequiredInputFrameCount_Internal::onGetRequiredInputFrameCount_downcall);
    }

    public void onGetRequiredInputFrameCount(ClosureObject<ma_resampling_backend_vtable.onGetRequiredInputFrameCount> onGetRequiredInputFrameCount) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 28, onGetRequiredInputFrameCount.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onGetExpectedOutputFrameCount> onGetExpectedOutputFrameCount() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 64 : 32), ma_resampling_backend_vtable_Internal.onGetExpectedOutputFrameCount_Internal::onGetExpectedOutputFrameCount_downcall);
    }

    public void onGetExpectedOutputFrameCount(ClosureObject<ma_resampling_backend_vtable.onGetExpectedOutputFrameCount> onGetExpectedOutputFrameCount) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 64 : 32, onGetExpectedOutputFrameCount.getPointer());
    }

    public ClosureObject<ma_resampling_backend_vtable.onReset> onReset() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 72 : 36), ma_resampling_backend_vtable_Internal.onReset_Internal::onReset_downcall);
    }

    public void onReset(ClosureObject<ma_resampling_backend_vtable.onReset> onReset) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 72 : 36, onReset.getPointer());
    }

    public static final class ma_resampling_backend_vtablePointer extends StackElementPointer<ma_resampling_backend_vtable> {

        public ma_resampling_backend_vtablePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resampling_backend_vtablePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resampling_backend_vtablePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resampling_backend_vtablePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resampling_backend_vtablePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resampling_backend_vtablePointer() {
            this(1, true);
        }

        public ma_resampling_backend_vtablePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resampling_backend_vtable createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resampling_backend_vtable(ptr, freeOnGC);
        }
    }

    public interface onGetHeapSize extends Closure, ma_resampling_backend_vtable_Internal.onGetHeapSize_Internal {

        ma_result onGetHeapSize_call(VoidPointer pUserData, ma_resampler_config.ma_resampler_configPointer pConfig, ULongPointer pHeapSizeInBytes);
    }

    public interface onInit extends Closure, ma_resampling_backend_vtable_Internal.onInit_Internal {

        ma_result onInit_call(VoidPointer pUserData, ma_resampler_config.ma_resampler_configPointer pConfig, VoidPointer pHeap, PointerPointer<VoidPointer> ppBackend);
    }

    public interface onUninit extends Closure, ma_resampling_backend_vtable_Internal.onUninit_Internal {

        void onUninit_call(VoidPointer pUserData, VoidPointer pBackend, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks);
    }

    public interface onProcess extends Closure, ma_resampling_backend_vtable_Internal.onProcess_Internal {

        ma_result onProcess_call(VoidPointer pUserData, VoidPointer pBackend, VoidPointer pFramesIn, UInt64Pointer pFrameCountIn, VoidPointer pFramesOut, UInt64Pointer pFrameCountOut);
    }

    public interface onSetRate extends Closure, ma_resampling_backend_vtable_Internal.onSetRate_Internal {

        ma_result onSetRate_call(VoidPointer pUserData, VoidPointer pBackend, long sampleRateIn, long sampleRateOut);
    }

    public interface onGetInputLatency extends Closure, ma_resampling_backend_vtable_Internal.onGetInputLatency_Internal {

        long onGetInputLatency_call(VoidPointer pUserData, VoidPointer pBackend);
    }

    public interface onGetOutputLatency extends Closure, ma_resampling_backend_vtable_Internal.onGetOutputLatency_Internal {

        long onGetOutputLatency_call(VoidPointer pUserData, VoidPointer pBackend);
    }

    public interface onGetRequiredInputFrameCount extends Closure, ma_resampling_backend_vtable_Internal.onGetRequiredInputFrameCount_Internal {

        ma_result onGetRequiredInputFrameCount_call(VoidPointer pUserData, VoidPointer pBackend, long outputFrameCount, UInt64Pointer pInputFrameCount);
    }

    public interface onGetExpectedOutputFrameCount extends Closure, ma_resampling_backend_vtable_Internal.onGetExpectedOutputFrameCount_Internal {

        ma_result onGetExpectedOutputFrameCount_call(VoidPointer pUserData, VoidPointer pBackend, long inputFrameCount, UInt64Pointer pOutputFrameCount);
    }

    public interface onReset extends Closure, ma_resampling_backend_vtable_Internal.onReset_Internal {

        ma_result onReset_call(VoidPointer pUserData, VoidPointer pBackend);
    }
}
