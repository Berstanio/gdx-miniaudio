package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.structs.ma_backend_callbacks;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal.ma_backend_callbacks_Internal;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import games.rednblack.miniaudio.internal.structs.ma_context;
import games.rednblack.miniaudio.internal.structs.ma_context_config;
import games.rednblack.miniaudio.internal.enums.ma_result;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.enums.ma_device_type;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import games.rednblack.miniaudio.internal.structs.ma_device_info;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.structs.ma_device_config;
import games.rednblack.miniaudio.internal.structs.ma_device_descriptor;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;

public final class ma_backend_callbacks extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(81).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_backend_callbacks(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_backend_callbacks(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_backend_callbacks() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_backend_callbacks.ma_backend_callbacksPointer asPointer() {
        return new ma_backend_callbacks.ma_backend_callbacksPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_backend_callbacks.ma_backend_callbacksPointer ptr) {
        ptr.setPointer(this);
    }

    public ClosureObject<ma_backend_callbacks.onContextInit> onContextInit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(0), ma_backend_callbacks_Internal.onContextInit_Internal::onContextInit_downcall);
    }

    public void onContextInit(ClosureObject<ma_backend_callbacks.onContextInit> onContextInit) {
        getBufPtr().setNativePointer(0, onContextInit.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onContextUninit> onContextUninit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), ma_backend_callbacks_Internal.onContextUninit_Internal::onContextUninit_downcall);
    }

    public void onContextUninit(ClosureObject<ma_backend_callbacks.onContextUninit> onContextUninit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, onContextUninit.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onContextEnumerateDevices> onContextEnumerateDevices() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), ma_backend_callbacks_Internal.onContextEnumerateDevices_Internal::onContextEnumerateDevices_downcall);
    }

    public void onContextEnumerateDevices(ClosureObject<ma_backend_callbacks.onContextEnumerateDevices> onContextEnumerateDevices) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, onContextEnumerateDevices.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onContextGetDeviceInfo> onContextGetDeviceInfo() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), ma_backend_callbacks_Internal.onContextGetDeviceInfo_Internal::onContextGetDeviceInfo_downcall);
    }

    public void onContextGetDeviceInfo(ClosureObject<ma_backend_callbacks.onContextGetDeviceInfo> onContextGetDeviceInfo) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, onContextGetDeviceInfo.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceInit> onDeviceInit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), ma_backend_callbacks_Internal.onDeviceInit_Internal::onDeviceInit_downcall);
    }

    public void onDeviceInit(ClosureObject<ma_backend_callbacks.onDeviceInit> onDeviceInit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, onDeviceInit.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceUninit> onDeviceUninit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), ma_backend_callbacks_Internal.onDeviceUninit_Internal::onDeviceUninit_downcall);
    }

    public void onDeviceUninit(ClosureObject<ma_backend_callbacks.onDeviceUninit> onDeviceUninit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, onDeviceUninit.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceStart> onDeviceStart() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), ma_backend_callbacks_Internal.onDeviceStart_Internal::onDeviceStart_downcall);
    }

    public void onDeviceStart(ClosureObject<ma_backend_callbacks.onDeviceStart> onDeviceStart) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, onDeviceStart.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceStop> onDeviceStop() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 28), ma_backend_callbacks_Internal.onDeviceStop_Internal::onDeviceStop_downcall);
    }

    public void onDeviceStop(ClosureObject<ma_backend_callbacks.onDeviceStop> onDeviceStop) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 28, onDeviceStop.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceRead> onDeviceRead() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 64 : 32), ma_backend_callbacks_Internal.onDeviceRead_Internal::onDeviceRead_downcall);
    }

    public void onDeviceRead(ClosureObject<ma_backend_callbacks.onDeviceRead> onDeviceRead) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 64 : 32, onDeviceRead.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceWrite> onDeviceWrite() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 72 : 36), ma_backend_callbacks_Internal.onDeviceWrite_Internal::onDeviceWrite_downcall);
    }

    public void onDeviceWrite(ClosureObject<ma_backend_callbacks.onDeviceWrite> onDeviceWrite) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 72 : 36, onDeviceWrite.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceDataLoop> onDeviceDataLoop() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 80 : 40), ma_backend_callbacks_Internal.onDeviceDataLoop_Internal::onDeviceDataLoop_downcall);
    }

    public void onDeviceDataLoop(ClosureObject<ma_backend_callbacks.onDeviceDataLoop> onDeviceDataLoop) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 80 : 40, onDeviceDataLoop.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceDataLoopWakeup> onDeviceDataLoopWakeup() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 88 : 44), ma_backend_callbacks_Internal.onDeviceDataLoopWakeup_Internal::onDeviceDataLoopWakeup_downcall);
    }

    public void onDeviceDataLoopWakeup(ClosureObject<ma_backend_callbacks.onDeviceDataLoopWakeup> onDeviceDataLoopWakeup) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 88 : 44, onDeviceDataLoopWakeup.getPointer());
    }

    public ClosureObject<ma_backend_callbacks.onDeviceGetInfo> onDeviceGetInfo() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 96 : 48), ma_backend_callbacks_Internal.onDeviceGetInfo_Internal::onDeviceGetInfo_downcall);
    }

    public void onDeviceGetInfo(ClosureObject<ma_backend_callbacks.onDeviceGetInfo> onDeviceGetInfo) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 96 : 48, onDeviceGetInfo.getPointer());
    }

    public static final class ma_backend_callbacksPointer extends StackElementPointer<ma_backend_callbacks> {

        public ma_backend_callbacksPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_backend_callbacksPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_backend_callbacksPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_backend_callbacksPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_backend_callbacksPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_backend_callbacksPointer() {
            this(1, true);
        }

        public ma_backend_callbacksPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_backend_callbacks createStackElement(long ptr, boolean freeOnGC) {
            return new ma_backend_callbacks(ptr, freeOnGC);
        }
    }

    public interface onContextInit extends Closure, ma_backend_callbacks_Internal.onContextInit_Internal {

        ma_result onContextInit_call(ma_context.ma_contextPointer pContext, ma_context_config.ma_context_configPointer pConfig, ma_backend_callbacks.ma_backend_callbacksPointer pCallbacks);
    }

    public interface onContextUninit extends Closure, ma_backend_callbacks_Internal.onContextUninit_Internal {

        ma_result onContextUninit_call(ma_context.ma_contextPointer pContext);
    }

    public interface onContextEnumerateDevices extends Closure, ma_backend_callbacks_Internal.onContextEnumerateDevices_Internal {

        ma_result onContextEnumerateDevices_call(ma_context.ma_contextPointer pContext, ClosureObject<GdxMiniaudio.ma_enum_devices_callback_proc> callback, VoidPointer pUserData);
    }

    public interface onContextGetDeviceInfo extends Closure, ma_backend_callbacks_Internal.onContextGetDeviceInfo_Internal {

        ma_result onContextGetDeviceInfo_call(ma_context.ma_contextPointer pContext, ma_device_type deviceType, ma_device_id.ma_device_idPointer pDeviceID, ma_device_info.ma_device_infoPointer pDeviceInfo);
    }

    public interface onDeviceInit extends Closure, ma_backend_callbacks_Internal.onDeviceInit_Internal {

        ma_result onDeviceInit_call(ma_device.ma_devicePointer pDevice, ma_device_config.ma_device_configPointer pConfig, ma_device_descriptor.ma_device_descriptorPointer pDescriptorPlayback, ma_device_descriptor.ma_device_descriptorPointer pDescriptorCapture);
    }

    public interface onDeviceUninit extends Closure, ma_backend_callbacks_Internal.onDeviceUninit_Internal {

        ma_result onDeviceUninit_call(ma_device.ma_devicePointer pDevice);
    }

    public interface onDeviceStart extends Closure, ma_backend_callbacks_Internal.onDeviceStart_Internal {

        ma_result onDeviceStart_call(ma_device.ma_devicePointer pDevice);
    }

    public interface onDeviceStop extends Closure, ma_backend_callbacks_Internal.onDeviceStop_Internal {

        ma_result onDeviceStop_call(ma_device.ma_devicePointer pDevice);
    }

    public interface onDeviceRead extends Closure, ma_backend_callbacks_Internal.onDeviceRead_Internal {

        ma_result onDeviceRead_call(ma_device.ma_devicePointer pDevice, VoidPointer pFrames, long frameCount, UIntPointer pFramesRead);
    }

    public interface onDeviceWrite extends Closure, ma_backend_callbacks_Internal.onDeviceWrite_Internal {

        ma_result onDeviceWrite_call(ma_device.ma_devicePointer pDevice, VoidPointer pFrames, long frameCount, UIntPointer pFramesWritten);
    }

    public interface onDeviceDataLoop extends Closure, ma_backend_callbacks_Internal.onDeviceDataLoop_Internal {

        ma_result onDeviceDataLoop_call(ma_device.ma_devicePointer pDevice);
    }

    public interface onDeviceDataLoopWakeup extends Closure, ma_backend_callbacks_Internal.onDeviceDataLoopWakeup_Internal {

        ma_result onDeviceDataLoopWakeup_call(ma_device.ma_devicePointer pDevice);
    }

    public interface onDeviceGetInfo extends Closure, ma_backend_callbacks_Internal.onDeviceGetInfo_Internal {

        ma_result onDeviceGetInfo_call(ma_device.ma_devicePointer pDevice, ma_device_type type, ma_device_info.ma_device_infoPointer pDeviceInfo);
    }
}
