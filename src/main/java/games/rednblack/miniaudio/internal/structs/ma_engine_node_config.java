package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_engine;
import games.rednblack.miniaudio.internal.enums.ma_engine_node_type;
import games.rednblack.miniaudio.internal.enums.ma_mono_expansion_mode;

public final class ma_engine_node_config extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(127).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_engine_node_config(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_engine_node_config(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_engine_node_config() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_engine_node_config.ma_engine_node_configPointer asPointer() {
        return new ma_engine_node_config.ma_engine_node_configPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_engine_node_config.ma_engine_node_configPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_engine.ma_enginePointer pEngine() {
        return new ma_engine.ma_enginePointer(getBufPtr().getNativePointer(0), false);
    }

    public void pEngine(ma_engine.ma_enginePointer pEngine) {
        getBufPtr().setNativePointer(0, pEngine.getPointer());
    }

    public ma_engine_node_type type() {
        return ma_engine_node_type.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4));
    }

    public void type(ma_engine_node_type type) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, type.getIndex());
    }

    public long channelsIn() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 12 : 8);
    }

    public void channelsIn(long channelsIn) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 12 : 8, channelsIn);
    }

    public long channelsOut() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 16 : 12);
    }

    public void channelsOut(long channelsOut) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 16 : 12, channelsOut);
    }

    public long sampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 20 : 16);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 20 : 16, sampleRate);
    }

    public long volumeSmoothTimeInPCMFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 24 : 20);
    }

    public void volumeSmoothTimeInPCMFrames(long volumeSmoothTimeInPCMFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 24 : 20, volumeSmoothTimeInPCMFrames);
    }

    public ma_mono_expansion_mode monoExpansionMode() {
        return ma_mono_expansion_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 28 : 24));
    }

    public void monoExpansionMode(ma_mono_expansion_mode monoExpansionMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 28 : 24, monoExpansionMode.getIndex());
    }

    public char isPitchDisabled() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 32 : 28);
    }

    public void isPitchDisabled(char isPitchDisabled) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 32 : 28, isPitchDisabled);
    }

    public char isSpatializationDisabled() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 33 : 29);
    }

    public void isSpatializationDisabled(char isSpatializationDisabled) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 33 : 29, isSpatializationDisabled);
    }

    public char pinnedListenerIndex() {
        return getBufPtr().getUByte(CHandler.IS_64_BIT ? 34 : 30);
    }

    public void pinnedListenerIndex(char pinnedListenerIndex) {
        getBufPtr().setUByte(CHandler.IS_64_BIT ? 34 : 30, pinnedListenerIndex);
    }

    public static final class ma_engine_node_configPointer extends StackElementPointer<ma_engine_node_config> {

        public ma_engine_node_configPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_engine_node_configPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_engine_node_configPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_engine_node_configPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_engine_node_configPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_engine_node_configPointer() {
            this(1, true);
        }

        public ma_engine_node_configPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_engine_node_config createStackElement(long ptr, boolean freeOnGC) {
            return new ma_engine_node_config(ptr, freeOnGC);
        }
    }
}
