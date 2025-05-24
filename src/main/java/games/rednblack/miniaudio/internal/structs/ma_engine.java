package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_graph;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.structs.ma_log;
import games.rednblack.miniaudio.internal.structs.ma_spatializer_listener;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_sound_inlined;
import games.rednblack.miniaudio.internal.enums.ma_mono_expansion_mode;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;

public final class ma_engine extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(124).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_engine(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_engine(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_engine() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_engine.ma_enginePointer asPointer() {
        return new ma_engine.ma_enginePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_engine.ma_enginePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_graph nodeGraph() {
        return new ma_node_graph(getPointer(), false);
    }

    public void nodeGraph(ma_node_graph toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536, this);
    }

    public ma_node_graph getNodeGraph() {
        return new ma_node_graph(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536), true);
    }

    public void getNodeGraph(ma_node_graph toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536);
    }

    public void setNodeGraph(ma_node_graph toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536);
    }

    public ma_resource_manager.ma_resource_managerPointer pResourceManager() {
        return new ma_resource_manager.ma_resource_managerPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536), false);
    }

    public void pResourceManager(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 532 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 752 : 536, pResourceManager.getPointer());
    }

    public ma_device.ma_devicePointer pDevice() {
        return new ma_device.ma_devicePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 536 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 540), false);
    }

    public void pDevice(ma_device.ma_devicePointer pDevice) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 536 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 540, pDevice.getPointer());
    }

    public ma_log.ma_logPointer pLog() {
        return new ma_log.ma_logPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 540 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 768 : 544), false);
    }

    public void pLog(ma_log.ma_logPointer pLog) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 540 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 768 : 544, pLog.getPointer());
    }

    public long sampleRate() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 544 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 548 : 776);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 544 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 548 : 776, sampleRate);
    }

    public long listenerCount() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 548 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 552 : 780);
    }

    public void listenerCount(long listenerCount) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 548 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 552 : 780, listenerCount);
    }

    public ma_spatializer_listener.ma_spatializer_listenerPointer listeners() {
        return new ma_spatializer_listener.ma_spatializer_listenerPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 552 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 784 : 556), false, 4);
    }

    public void listeners(ma_spatializer_listener.ma_spatializer_listenerPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 552 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 784 : 556), CHandler.IS_64_BIT ? 448 : 400, this);
    }

    public ma_spatializer_listener.ma_spatializer_listenerPointer getListeners() {
        return new ma_spatializer_listener.ma_spatializer_listenerPointer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 552 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 784 : 556, CHandler.IS_64_BIT ? 448 : 400), false, 4);
    }

    public void getListeners(ma_spatializer_listener.ma_spatializer_listenerPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 552 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 784 : 556, CHandler.IS_64_BIT ? 448 : 400);
    }

    public void setListeners(ma_spatializer_listener.ma_spatializer_listenerPointer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 552 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 784 : 556, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 448 : 400);
    }

    public ma_allocation_callbacks allocationCallbacks() {
        return new ma_allocation_callbacks(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 952 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1232 : 956), false);
    }

    public void allocationCallbacks(ma_allocation_callbacks toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 952 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1232 : 956), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_allocation_callbacks getAllocationCallbacks() {
        return new ma_allocation_callbacks(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 952 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1232 : 956, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getAllocationCallbacks(ma_allocation_callbacks toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 952 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1232 : 956, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setAllocationCallbacks(ma_allocation_callbacks toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 952 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1232 : 956, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public char ownsResourceManager() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 968 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1264 : 972);
    }

    public void ownsResourceManager(char ownsResourceManager) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 968 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1264 : 972, ownsResourceManager);
    }

    public char ownsDevice() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 969 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1265 : 973);
    }

    public void ownsDevice(char ownsDevice) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 969 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1265 : 973, ownsDevice);
    }

    public long inlinedSoundLock() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 972 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 976 : 1268);
    }

    public void inlinedSoundLock(long inlinedSoundLock) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 972 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 976 : 1268, inlinedSoundLock);
    }

    public ma_sound_inlined.ma_sound_inlinedPointer pInlinedSoundHead() {
        return new ma_sound_inlined.ma_sound_inlinedPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 976 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 980 : 1272), false);
    }

    public void pInlinedSoundHead(ma_sound_inlined.ma_sound_inlinedPointer pInlinedSoundHead) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 976 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 980 : 1272, pInlinedSoundHead.getPointer());
    }

    public long inlinedSoundCount() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 980 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1280 : 984);
    }

    public void inlinedSoundCount(long inlinedSoundCount) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 980 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1280 : 984, inlinedSoundCount);
    }

    public long gainSmoothTimeInFrames() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 984 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1284 : 988);
    }

    public void gainSmoothTimeInFrames(long gainSmoothTimeInFrames) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 984 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1284 : 988, gainSmoothTimeInFrames);
    }

    public long defaultVolumeSmoothTimeInPCMFrames() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 988 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 992 : 1288);
    }

    public void defaultVolumeSmoothTimeInPCMFrames(long defaultVolumeSmoothTimeInPCMFrames) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 988 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 992 : 1288, defaultVolumeSmoothTimeInPCMFrames);
    }

    public ma_mono_expansion_mode monoExpansionMode() {
        return ma_mono_expansion_mode.getByIndex((int) getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 992 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 996 : 1292));
    }

    public void monoExpansionMode(ma_mono_expansion_mode monoExpansionMode) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 992 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 996 : 1292, monoExpansionMode.getIndex());
    }

    public ClosureObject<GdxMiniaudio.ma_engine_process_proc> onProcess() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 996 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1296 : 1000), GdxMiniaudio_Internal.ma_engine_process_proc_Internal::ma_engine_process_proc_downcall);
    }

    public void onProcess(ClosureObject<GdxMiniaudio.ma_engine_process_proc> onProcess) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 996 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1296 : 1000, onProcess.getPointer());
    }

    public VoidPointer pProcessUserData() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1000 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1304 : 1004), false);
    }

    public void pProcessUserData(VoidPointer pProcessUserData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 1000 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 1304 : 1004, pProcessUserData.getPointer());
    }

    public static final class ma_enginePointer extends StackElementPointer<ma_engine> {

        public ma_enginePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_enginePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_enginePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_enginePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_enginePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_enginePointer() {
            this(1, true);
        }

        public ma_enginePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_engine createStackElement(long ptr, boolean freeOnGC) {
            return new ma_engine(ptr, freeOnGC);
        }
    }
}
