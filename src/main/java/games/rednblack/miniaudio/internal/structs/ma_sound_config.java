package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import games.rednblack.miniaudio.internal.enums.ma_mono_expansion_mode;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_pipeline_notifications;
import games.rednblack.miniaudio.internal.structs.ma_fence;

public final class ma_sound_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(210).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_sound_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_sound_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_sound_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_sound_config.ma_sound_configPointer asPointer() {
        return new ma_sound_config.ma_sound_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_sound_config.ma_sound_configPointer ptr) {
        ptr.setPointer(this);
    }

    public BytePointer pFilePath() {
        return new BytePointer(getBufPtr().getNativePointer(0), false);
    }

    public void pFilePath(BytePointer pFilePath) {
        getBufPtr().setNativePointer(0, pFilePath.getPointer());
    }

    public SIntPointer pFilePathW() {
        return new SIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
    }

    public void pFilePathW(SIntPointer pFilePathW) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePathW.getPointer());
    }

    public VoidPointer pDataSource() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
    }

    public void pDataSource(VoidPointer pDataSource) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDataSource.getPointer());
    }

    public VoidPointer pInitialAttachment() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
    }

    public void pInitialAttachment(VoidPointer pInitialAttachment) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pInitialAttachment.getPointer());
    }

    public long initialAttachmentInputBusIndex() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 16);
    }

    public void initialAttachmentInputBusIndex(long initialAttachmentInputBusIndex) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 16, initialAttachmentInputBusIndex);
    }

    public long channelsIn() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 36 : 20);
    }

    public void channelsIn(long channelsIn) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 36 : 20, channelsIn);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 40 : 24);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 40 : 24, channelsOut);
    }

    public ma_mono_expansion_mode monoExpansionMode() {
        return ma_mono_expansion_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 44 : 28));
    }

    public void monoExpansionMode(ma_mono_expansion_mode monoExpansionMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 44 : 28, monoExpansionMode.getIndex());
    }

    public long flags() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 48 : 32);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 48 : 32, flags);
    }

    public long volumeSmoothTimeInPCMFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 52 : 36);
    }

    public void volumeSmoothTimeInPCMFrames(long volumeSmoothTimeInPCMFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 52 : 36, volumeSmoothTimeInPCMFrames);
    }

    public long initialSeekPointInPCMFrames() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 56 : 40);
    }

    public void initialSeekPointInPCMFrames(long initialSeekPointInPCMFrames) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 56 : 40, initialSeekPointInPCMFrames);
    }

    public long rangeBegInPCMFrames() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 64 : 48);
    }

    public void rangeBegInPCMFrames(long rangeBegInPCMFrames) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 64 : 48, rangeBegInPCMFrames);
    }

    public long rangeEndInPCMFrames() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 72 : 56);
    }

    public void rangeEndInPCMFrames(long rangeEndInPCMFrames) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 72 : 56, rangeEndInPCMFrames);
    }

    public long loopPointBegInPCMFrames() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 80 : 64);
    }

    public void loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 80 : 64, loopPointBegInPCMFrames);
    }

    public long loopPointEndInPCMFrames() {
        return getBufPtr().getLong(CHandler.IS_64_BIT ? 88 : 72);
    }

    public void loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
        getBufPtr().setLong(CHandler.IS_64_BIT ? 88 : 72, loopPointEndInPCMFrames);
    }

    public ClosureObject<GdxMiniaudio.ma_sound_end_proc> endCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 96 : 80), GdxMiniaudio_Internal.ma_sound_end_proc_Internal::ma_sound_end_proc_downcall);
    }

    public void endCallback(ClosureObject<GdxMiniaudio.ma_sound_end_proc> endCallback) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 96 : 80, endCallback.getPointer());
    }

    public VoidPointer pEndCallbackUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 104 : 84), false);
    }

    public void pEndCallbackUserData(VoidPointer pEndCallbackUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 104 : 84, pEndCallbackUserData.getPointer());
    }

    public ma_resource_manager_pipeline_notifications initNotifications() {
        return new ma_resource_manager_pipeline_notifications(getPointer() + (CHandler.IS_64_BIT ? 112 : 88), false);
    }

    public void initNotifications(ma_resource_manager_pipeline_notifications toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 112 : 88), CHandler.IS_64_BIT ? 32 : 16, this);
    }

    public ma_resource_manager_pipeline_notifications getInitNotifications() {
        return new ma_resource_manager_pipeline_notifications(getBufPtr().duplicate(CHandler.IS_64_BIT ? 112 : 88, CHandler.IS_64_BIT ? 32 : 16), true);
    }

    public void getInitNotifications(ma_resource_manager_pipeline_notifications toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 112 : 88, CHandler.IS_64_BIT ? 32 : 16);
    }

    public void setInitNotifications(ma_resource_manager_pipeline_notifications toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 112 : 88, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
    }

    public ma_fence.ma_fencePointer pDoneFence() {
        return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 144 : 104), false);
    }

    public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 144 : 104, pDoneFence.getPointer());
    }

    public long isLooping() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 152 : 108);
    }

    public void isLooping(long isLooping) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 152 : 108, isLooping);
    }

    public static final class ma_sound_configPointer extends StackElementPointer<ma_sound_config> {

        public ma_sound_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_sound_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_sound_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_sound_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_sound_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_sound_configPointer() {
            this(1, true);
        }

        public ma_sound_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_sound_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_sound_config(ptr, freeOnGC);
        }
    }
}
