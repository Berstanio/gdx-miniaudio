package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_source.backend;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_buffer;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_stream;

public final class ma_resource_manager_data_source extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(199).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_source(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_source(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_source() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer asPointer() {
        return new ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer ptr) {
        ptr.setPointer(this);
    }

    public backend backend() {
        return new backend(getPointer(), false);
    }

    public void backend(backend toSetPtr) {
        toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560, this);
    }

    public backend getBackend() {
        return new backend(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560), true);
    }

    public void getBackend(backend toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560);
    }

    public void setBackend(backend toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560);
    }

    public long flags() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560);
    }

    public void flags(long flags) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560, flags);
    }

    public long executionCounter() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 512 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 724 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 732 : 564);
    }

    public void executionCounter(long executionCounter) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 512 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 724 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 732 : 564, executionCounter);
    }

    public long executionPointer() {
        return getBufPtr().getUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 736 : (CHandler.IS_COMPILED_ANDROID_X86) ? 516 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 728 : 568);
    }

    public void executionPointer(long executionPointer) {
        getBufPtr().setUInt(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 736 : (CHandler.IS_COMPILED_ANDROID_X86) ? 516 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 728 : 568, executionPointer);
    }

    public static final class ma_resource_manager_data_sourcePointer extends StackElementPointer<ma_resource_manager_data_source> {

        public ma_resource_manager_data_sourcePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_sourcePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_sourcePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_sourcePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_sourcePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_sourcePointer() {
            this(1, true);
        }

        public ma_resource_manager_data_sourcePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_source createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_source(ptr, freeOnGC);
        }
    }

    public final static class backend extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(37).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public backend(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public backend(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public backend() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public backend.backendPointer asPointer() {
            return new backend.backendPointer(getPointer(), false, 1, this);
        }

        public void asPointer(backend.backendPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_resource_manager_data_buffer buffer() {
            return new ma_resource_manager_data_buffer(getPointer(), false);
        }

        public void buffer(ma_resource_manager_data_buffer toSetPtr) {
            toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520, this);
        }

        public ma_resource_manager_data_buffer getBuffer() {
            return new ma_resource_manager_data_buffer(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520), true);
        }

        public void getBuffer(ma_resource_manager_data_buffer toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520);
        }

        public void setBuffer(ma_resource_manager_data_buffer toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 672 : (CHandler.IS_COMPILED_ANDROID_X86) ? 472 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 680 : 520);
        }

        public ma_resource_manager_data_stream stream() {
            return new ma_resource_manager_data_stream(getPointer(), false);
        }

        public void stream(ma_resource_manager_data_stream toSetPtr) {
            toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560, this);
        }

        public ma_resource_manager_data_stream getStream() {
            return new ma_resource_manager_data_stream(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560), true);
        }

        public void getStream(ma_resource_manager_data_stream toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560);
        }

        public void setStream(ma_resource_manager_data_stream toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 720 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 728 : (CHandler.IS_COMPILED_ANDROID_X86) ? 508 : 560);
        }

        public static final class backendPointer extends StackElementPointer<backend> {

            public backendPointer(VoidPointer pointer) {
                super(pointer);
            }

            public backendPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public backendPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public backendPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public backendPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public backendPointer() {
                this(1, true);
            }

            public backendPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected backend createStackElement(long ptr, boolean freeOnGC) {
                return new backend(ptr, freeOnGC);
            }
        }
    }
}
