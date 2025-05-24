package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_engine_node;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_source;

public final class ma_sound extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(209).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_sound(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_sound(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_sound() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_sound.ma_soundPointer asPointer() {
        return new ma_sound.ma_soundPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_sound.ma_soundPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_engine_node engineNode() {
        return new ma_engine_node(getPointer(), false);
    }

    public void engineNode(ma_engine_node toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696, this);
    }

    public ma_engine_node getEngineNode() {
        return new ma_engine_node(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696), true);
    }

    public void getEngineNode(ma_engine_node toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696);
    }

    public void setEngineNode(ma_engine_node toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696);
    }

    public VoidPointer pDataSource() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696), false);
    }

    public void pDataSource(VoidPointer pDataSource) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 680 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 896 : 696, pDataSource.getPointer());
    }

    public long seekTarget() {
        return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 684 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 704 : 904);
    }

    public void seekTarget(long seekTarget) {
        getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 684 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 704 : 904, seekTarget);
    }

    public long atEnd() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 692 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 912 : 712);
    }

    public void atEnd(long atEnd) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 692 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 912 : 712, atEnd);
    }

    public ClosureObject<GdxMiniaudio.ma_sound_end_proc> endCallback() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 696 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 920 : 716), GdxMiniaudio_Internal.ma_sound_end_proc_Internal::ma_sound_end_proc_downcall);
    }

    public void endCallback(ClosureObject<GdxMiniaudio.ma_sound_end_proc> endCallback) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 696 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 920 : 716, endCallback.getPointer());
    }

    public VoidPointer pEndCallbackUserData() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 700 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 928 : 720), false);
    }

    public void pEndCallbackUserData(VoidPointer pEndCallbackUserData) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 700 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 928 : 720, pEndCallbackUserData.getPointer());
    }

    public char ownsDataSource() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 704 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 724 : 936);
    }

    public void ownsDataSource(char ownsDataSource) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 704 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 724 : 936, ownsDataSource);
    }

    public ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pResourceManagerDataSource() {
        return new ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 708 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 944 : 728), false);
    }

    public void pResourceManagerDataSource(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pResourceManagerDataSource) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 708 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 944 : 728, pResourceManagerDataSource.getPointer());
    }

    public static final class ma_soundPointer extends StackElementPointer<ma_sound> {

        public ma_soundPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_soundPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_soundPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_soundPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_soundPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_soundPointer() {
            this(1, true);
        }

        public ma_soundPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_sound createStackElement(long ptr, boolean freeOnGC) {
            return new ma_sound(ptr, freeOnGC);
        }
    }
}
