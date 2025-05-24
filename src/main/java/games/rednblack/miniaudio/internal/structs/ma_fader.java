package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_fader_config;

public final class ma_fader extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(129).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_fader(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_fader(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_fader() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_fader.ma_faderPointer asPointer() {
        return new ma_fader.ma_faderPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_fader.ma_faderPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_fader_config config() {
        return new ma_fader_config(getPointer(), false);
    }

    public void config(ma_fader_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), 12, this);
    }

    public ma_fader_config getConfig() {
        return new ma_fader_config(getBufPtr().duplicate(0, 12), true);
    }

    public void getConfig(ma_fader_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 12);
    }

    public void setConfig(ma_fader_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 12);
    }

    public float volumeBeg() {
        return getBufPtr().getFloat(12);
    }

    public void volumeBeg(float volumeBeg) {
        getBufPtr().setFloat(12, volumeBeg);
    }

    public float volumeEnd() {
        return getBufPtr().getFloat(16);
    }

    public void volumeEnd(float volumeEnd) {
        getBufPtr().setFloat(16, volumeEnd);
    }

    public long lengthInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24);
    }

    public void lengthInFrames(long lengthInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, lengthInFrames);
    }

    public long cursorInFrames() {
        return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public void cursorInFrames(long cursorInFrames) {
        getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, cursorInFrames);
    }

    public static final class ma_faderPointer extends StackElementPointer<ma_fader> {

        public ma_faderPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_faderPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_faderPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_faderPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_faderPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_faderPointer() {
            this(1, true);
        }

        public ma_faderPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_fader createStackElement(long ptr, boolean freeOnGC) {
            return new ma_fader(ptr, freeOnGC);
        }
    }
}
