package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.structs.ma_device_info.nativeDataFormats;
import games.rednblack.miniaudio.internal.enums.ma_format;

public final class ma_device_info extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(117).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_device_info(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_device_info(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_device_info() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_device_info.ma_device_infoPointer asPointer() {
        return new ma_device_info.ma_device_infoPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_device_info.ma_device_infoPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_device_id id() {
        return new ma_device_id(getPointer(), false);
    }

    public void id(ma_device_id toSetPtr) {
        toSetPtr.setPointer(getPointer(), 256, this);
    }

    public ma_device_id getId() {
        return new ma_device_id(getBufPtr().duplicate(0, 256), true);
    }

    public void getId(ma_device_id toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 256);
    }

    public void setId(ma_device_id toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 256);
    }

    public BytePointer name() {
        return new BytePointer(getPointer() + (256), false, 256);
    }

    public void name(BytePointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (256), 256, this);
    }

    public BytePointer getName() {
        return new BytePointer(getBufPtr().duplicate(256, 256), false, 256);
    }

    public void getName(BytePointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 256, 256);
    }

    public void setName(BytePointer toCopyFrom) {
        getBufPtr().copyFrom(256, toCopyFrom.getBufPtr(), 0, 256);
    }

    public long isDefault() {
        return getBufPtr().getUInt(512);
    }

    public void isDefault(long isDefault) {
        getBufPtr().setUInt(512, isDefault);
    }

    public long nativeDataFormatCount() {
        return getBufPtr().getUInt(516);
    }

    public void nativeDataFormatCount(long nativeDataFormatCount) {
        getBufPtr().setUInt(516, nativeDataFormatCount);
    }

    public nativeDataFormats.nativeDataFormatsPointer nativeDataFormats() {
        return new nativeDataFormats.nativeDataFormatsPointer(getPointer() + (520), false, 64);
    }

    public void nativeDataFormats(nativeDataFormats.nativeDataFormatsPointer toSetPtr) {
        toSetPtr.setPointer(getPointer() + (520), 1024, this);
    }

    public nativeDataFormats.nativeDataFormatsPointer getNativeDataFormats() {
        return new nativeDataFormats.nativeDataFormatsPointer(getBufPtr().duplicate(520, 1024), false, 64);
    }

    public void getNativeDataFormats(nativeDataFormats.nativeDataFormatsPointer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 520, 1024);
    }

    public void setNativeDataFormats(nativeDataFormats.nativeDataFormatsPointer toCopyFrom) {
        getBufPtr().copyFrom(520, toCopyFrom.getBufPtr(), 0, 1024);
    }

    public static final class ma_device_infoPointer extends StackElementPointer<ma_device_info> {

        public ma_device_infoPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_infoPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_infoPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_infoPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_device_infoPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_device_infoPointer() {
            this(1, true);
        }

        public ma_device_infoPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_device_info createStackElement(long ptr, boolean freeOnGC) {
            return new ma_device_info(ptr, freeOnGC);
        }
    }

    public final static class nativeDataFormats extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(225).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public nativeDataFormats(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public nativeDataFormats(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public nativeDataFormats() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public nativeDataFormats.nativeDataFormatsPointer asPointer() {
            return new nativeDataFormats.nativeDataFormatsPointer(getPointer(), false, 1, this);
        }

        public void asPointer(nativeDataFormats.nativeDataFormatsPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_format format() {
            return ma_format.getByIndex((int) getBufPtr().getUInt(0));
        }

        public void format(ma_format format) {
            getBufPtr().setUInt(0, format.getIndex());
        }

        public long channels() {
            return getBufPtr().getUInt(4);
        }

        public void channels(long channels) {
            getBufPtr().setUInt(4, channels);
        }

        public long sampleRate() {
            return getBufPtr().getUInt(8);
        }

        public void sampleRate(long sampleRate) {
            getBufPtr().setUInt(8, sampleRate);
        }

        public long flags() {
            return getBufPtr().getUInt(12);
        }

        public void flags(long flags) {
            getBufPtr().setUInt(12, flags);
        }

        public static final class nativeDataFormatsPointer extends StackElementPointer<nativeDataFormats> {

            public nativeDataFormatsPointer(VoidPointer pointer) {
                super(pointer);
            }

            public nativeDataFormatsPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public nativeDataFormatsPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public nativeDataFormatsPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public nativeDataFormatsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public nativeDataFormatsPointer() {
                this(1, true);
            }

            public nativeDataFormatsPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected nativeDataFormats createStackElement(long ptr, boolean freeOnGC) {
                return new nativeDataFormats(ptr, freeOnGC);
            }
        }
    }
}
