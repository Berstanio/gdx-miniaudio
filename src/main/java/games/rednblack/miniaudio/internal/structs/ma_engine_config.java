package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager;
import games.rednblack.miniaudio.internal.structs.ma_context;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_log;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.enums.ma_mono_expansion_mode;

public final class ma_engine_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(125).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_engine_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_engine_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_engine_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_engine_config.ma_engine_configPointer asPointer() {
        return new ma_engine_config.ma_engine_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_engine_config.ma_engine_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_resource_manager.ma_resource_managerPointer pResourceManager() {
        return new ma_resource_manager.ma_resource_managerPointer(getBufPtr().getNativePointer(0), false);
    }

    public void pResourceManager(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        getBufPtr().setNativePointer(0, pResourceManager.getPointer());
    }

    public ma_context.ma_contextPointer pContext() {
        return new ma_context.ma_contextPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pContext(ma_context.ma_contextPointer pContext) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pContext.getPointer());
    }

    public ma_device.ma_devicePointer pDevice() {
        return new ma_device.ma_devicePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
    }

    public void pDevice(ma_device.ma_devicePointer pDevice) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDevice.getPointer());
    }

    public ma_device_id.ma_device_idPointer pPlaybackDeviceID() {
        return new ma_device_id.ma_device_idPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
    }

    public void pPlaybackDeviceID(ma_device_id.ma_device_idPointer pPlaybackDeviceID) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pPlaybackDeviceID.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_device_data_proc> dataCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), GdxMiniaudio_Internal.ma_device_data_proc_Internal::ma_device_data_proc_downcall);
    }

    public void dataCallback(ClosureObject<GdxMiniaudio.ma_device_data_proc> dataCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, dataCallback.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_device_notification_proc> notificationCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), GdxMiniaudio_Internal.ma_device_notification_proc_Internal::ma_device_notification_proc_downcall);
    }

    public void notificationCallback(ClosureObject<GdxMiniaudio.ma_device_notification_proc> notificationCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, notificationCallback.getPointer());
    }

    public ma_log.ma_logPointer pLog() {
        return new ma_log.ma_logPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), false);
    }

    public void pLog(ma_log.ma_logPointer pLog) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, pLog.getPointer());
    }

    public long listenerCount() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 56 : 28);
    }

    public void listenerCount(long listenerCount) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 56 : 28, listenerCount);
    }

    public long channels() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 60 : 32);
    }

    public void channels(long channels) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 60 : 32, channels);
    }

    public long sampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 64 : 36);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 64 : 36, sampleRate);
    }

    public long periodSizeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 68 : 40);
    }

    public void periodSizeInFrames(long periodSizeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 68 : 40, periodSizeInFrames);
    }

    public long periodSizeInMilliseconds() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 72 : 44);
    }

    public void periodSizeInMilliseconds(long periodSizeInMilliseconds) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 72 : 44, periodSizeInMilliseconds);
    }

    public long gainSmoothTimeInFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 76 : 48);
    }

    public void gainSmoothTimeInFrames(long gainSmoothTimeInFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 76 : 48, gainSmoothTimeInFrames);
    }

    public long gainSmoothTimeInMilliseconds() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 80 : 52);
    }

    public void gainSmoothTimeInMilliseconds(long gainSmoothTimeInMilliseconds) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 80 : 52, gainSmoothTimeInMilliseconds);
    }

    public long defaultVolumeSmoothTimeInPCMFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 84 : 56);
    }

    public void defaultVolumeSmoothTimeInPCMFrames(long defaultVolumeSmoothTimeInPCMFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 84 : 56, defaultVolumeSmoothTimeInPCMFrames);
    }

    public long preMixStackSizeInBytes() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 88 : 60);
    }

    public void preMixStackSizeInBytes(long preMixStackSizeInBytes) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 88 : 60, preMixStackSizeInBytes);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + (CHandler.IS_64_BIT ? 96 : 64), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 96 : 64), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate(CHandler.IS_64_BIT ? 96 : 64, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 96 : 64, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 96 : 64, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public long noAutoStart() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 128 : 80);
    }

    public void noAutoStart(long noAutoStart) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 128 : 80, noAutoStart);
    }

    public long noDevice() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 132 : 84);
    }

    public void noDevice(long noDevice) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 132 : 84, noDevice);
    }

    public ma_mono_expansion_mode monoExpansionMode() {
        return ma_mono_expansion_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 136 : 88));
    }

    public void monoExpansionMode(ma_mono_expansion_mode monoExpansionMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 136 : 88, monoExpansionMode.getIndex());
    }

    public VoidPointer pResourceManagerVFS() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 144 : 92), false);
    }

    public void pResourceManagerVFS(VoidPointer pResourceManagerVFS) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 144 : 92, pResourceManagerVFS.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_engine_process_proc> onProcess() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 152 : 96), GdxMiniaudio_Internal.ma_engine_process_proc_Internal::ma_engine_process_proc_downcall);
    }

    public void onProcess(ClosureObject<GdxMiniaudio.ma_engine_process_proc> onProcess) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 152 : 96, onProcess.getPointer());
    }

    public VoidPointer pProcessUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 160 : 100), false);
    }

    public void pProcessUserData(VoidPointer pProcessUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 160 : 100, pProcessUserData.getPointer());
    }

    public static final class ma_engine_configPointer extends StackElementPointer<ma_engine_config> {

        public ma_engine_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_engine_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_engine_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_engine_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_engine_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_engine_configPointer() {
            this(1, true);
        }

        public ma_engine_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_engine_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_engine_config(ptr, freeOnGC);
        }
    }
}
