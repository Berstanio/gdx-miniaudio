package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_pipeline_notifications;

public final class ma_resource_manager_data_source_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(200).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_source_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_source_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_source_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer asPointer() {
        return new ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer ptr) {
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

    public ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications() {
        return new ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
    }

    public void pNotifications(ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pNotifications.getPointer());
    }

    public long initialSeekPointInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 12 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 16 : 24);
    }

    public void initialSeekPointInPCMFrames(long initialSeekPointInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 12 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 16 : 24, initialSeekPointInPCMFrames);
    }

    public long rangeBegInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 24);
    }

    public void rangeBegInPCMFrames(long rangeBegInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 24, rangeBegInPCMFrames);
    }

    public long rangeEndInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40);
    }

    public void rangeEndInPCMFrames(long rangeEndInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 32 : 40, rangeEndInPCMFrames);
    }

    public long loopPointBegInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 40);
    }

    public void loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 40, loopPointBegInPCMFrames);
    }

    public long loopPointEndInPCMFrames() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 48 : 56);
    }

    public void loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 48 : 56, loopPointEndInPCMFrames);
    }

    public long flags() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56);
    }

    public void flags(long flags) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 56, flags);
    }

    public long isLooping() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 60);
    }

    public void isLooping(long isLooping) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 68 : 60, isLooping);
    }

    public static final class ma_resource_manager_data_source_configPointer extends StackElementPointer<ma_resource_manager_data_source_config> {

        public ma_resource_manager_data_source_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_source_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_source_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_source_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_source_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_source_configPointer() {
            this(1, true);
        }

        public ma_resource_manager_data_source_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_source_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_source_config(ptr, freeOnGC);
        }
    }
}
