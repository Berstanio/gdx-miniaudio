package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.enums.ma_resource_manager_data_supply_type;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_supply.backend;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_supply.backend.encoded;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_supply.backend.decoded;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_supply.backend.decodedPaged;
import games.rednblack.miniaudio.internal.enums.ma_format;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_data;

public final class ma_resource_manager_data_supply extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(202).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_resource_manager_data_supply(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_resource_manager_data_supply(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_resource_manager_data_supply() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_resource_manager_data_supply.ma_resource_manager_data_supplyPointer asPointer() {
        return new ma_resource_manager_data_supply.ma_resource_manager_data_supplyPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_resource_manager_data_supply.ma_resource_manager_data_supplyPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_resource_manager_data_supply_type type() {
        return ma_resource_manager_data_supply_type.getByIndex((int) getBufPtr().getUInt(0));
    }

    public void type(ma_resource_manager_data_supply_type type) {
        getBufPtr().setUInt(0, type.getIndex());
    }

    public backend backend() {
        return new backend(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8), false);
    }

    public void backend(backend toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8), CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56, this);
    }

    public backend getBackend() {
        return new backend(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56), true);
    }

    public void getBackend(backend toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56);
    }

    public void setBackend(backend toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56);
    }

    public static final class ma_resource_manager_data_supplyPointer extends StackElementPointer<ma_resource_manager_data_supply> {

        public ma_resource_manager_data_supplyPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resource_manager_data_supplyPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resource_manager_data_supplyPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resource_manager_data_supplyPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_resource_manager_data_supplyPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_resource_manager_data_supplyPointer() {
            this(1, true);
        }

        public ma_resource_manager_data_supplyPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_resource_manager_data_supply createStackElement(long ptr, boolean freeOnGC) {
            return new ma_resource_manager_data_supply(ptr, freeOnGC);
        }
    }

    public final static class backend extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(36).getFfiType();
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

        public encoded encoded() {
            return new encoded(getPointer(), false);
        }

        public void encoded(encoded toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
        }

        public encoded getEncoded() {
            return new encoded(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
        }

        public void getEncoded(encoded toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public void setEncoded(encoded toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public decoded decoded() {
            return new decoded(getPointer(), false);
        }

        public void decoded(decoded toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 40, this);
        }

        public decoded getDecoded() {
            return new decoded(getBufPtr().duplicate(0, CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 40), true);
        }

        public void getDecoded(decoded toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 40);
        }

        public void setDecoded(decoded toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 32 : 40);
        }

        public decodedPaged decodedPaged() {
            return new decodedPaged(getPointer(), false);
        }

        public void decodedPaged(decodedPaged toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56, this);
        }

        public decodedPaged getDecodedPaged() {
            return new decodedPaged(getBufPtr().duplicate(0, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56), true);
        }

        public void getDecodedPaged(decodedPaged toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56);
        }

        public void setDecodedPaged(decodedPaged toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 40 : 56);
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

        public final static class encoded extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(57).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public encoded(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public encoded(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public encoded() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public encoded.encodedPointer asPointer() {
                return new encoded.encodedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(encoded.encodedPointer ptr) {
                ptr.setPointer(this);
            }

            public VoidPointer pData() {
                return new VoidPointer(getBufPtr().getNativePointer(0), false);
            }

            public void pData(VoidPointer pData) {
                getBufPtr().setNativePointer(0, pData.getPointer());
            }

            public long sizeInBytes() {
                return getBufPtr().getNativeULong(CHandler.IS_64_BIT ? 8 : 4);
            }

            public void sizeInBytes(long sizeInBytes) {
                getBufPtr().setNativeULong(CHandler.IS_64_BIT ? 8 : 4, sizeInBytes);
            }

            public static final class encodedPointer extends StackElementPointer<encoded> {

                public encodedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public encodedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public encodedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public encodedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public encodedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public encodedPointer() {
                    this(1, true);
                }

                public encodedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected encoded createStackElement(long ptr, boolean freeOnGC) {
                    return new encoded(ptr, freeOnGC);
                }
            }
        }

        public final static class decoded extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(53).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public decoded(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public decoded(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public decoded() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public decoded.decodedPointer asPointer() {
                return new decoded.decodedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(decoded.decodedPointer ptr) {
                ptr.setPointer(this);
            }

            public VoidPointer pData() {
                return new VoidPointer(getBufPtr().getNativePointer(0), false);
            }

            public void pData(VoidPointer pData) {
                getBufPtr().setNativePointer(0, pData.getPointer());
            }

            public long totalFrameCount() {
                return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8);
            }

            public void totalFrameCount(long totalFrameCount) {
                getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, totalFrameCount);
            }

            public long decodedFrameCount() {
                return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
            }

            public void decodedFrameCount(long decodedFrameCount) {
                getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, decodedFrameCount);
            }

            public ma_format format() {
                return ma_format.getByIndex((int) getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24));
            }

            public void format(ma_format format) {
                getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, format.getIndex());
            }

            public long channels() {
                return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 28);
            }

            public void channels(long channels) {
                getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 24 : 28, channels);
            }

            public long sampleRate() {
                return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
            }

            public void sampleRate(long sampleRate) {
                getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, sampleRate);
            }

            public static final class decodedPointer extends StackElementPointer<decoded> {

                public decodedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public decodedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public decodedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public decodedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public decodedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public decodedPointer() {
                    this(1, true);
                }

                public decodedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected decoded createStackElement(long ptr, boolean freeOnGC) {
                    return new decoded(ptr, freeOnGC);
                }
            }
        }

        public final static class decodedPaged extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(54).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public decodedPaged(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public decodedPaged(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public decodedPaged() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public decodedPaged.decodedPagedPointer asPointer() {
                return new decodedPaged.decodedPagedPointer(getPointer(), false, 1, this);
            }

            public void asPointer(decodedPaged.decodedPagedPointer ptr) {
                ptr.setPointer(this);
            }

            public ma_paged_audio_buffer_data data() {
                return new ma_paged_audio_buffer_data(getPointer(), false);
            }

            public void data(ma_paged_audio_buffer_data toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40, this);
            }

            public ma_paged_audio_buffer_data getData() {
                return new ma_paged_audio_buffer_data(getBufPtr().duplicate(0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40), true);
            }

            public void getData(ma_paged_audio_buffer_data toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40);
            }

            public void setData(ma_paged_audio_buffer_data toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40);
            }

            public long decodedFrameCount() {
                return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40);
            }

            public void decodedFrameCount(long decodedFrameCount) {
                getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 40, decodedFrameCount);
            }

            public long sampleRate() {
                return getBufPtr().getUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 48);
            }

            public void sampleRate(long sampleRate) {
                getBufPtr().setUInt(CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 48, sampleRate);
            }

            public static final class decodedPagedPointer extends StackElementPointer<decodedPaged> {

                public decodedPagedPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public decodedPagedPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public decodedPagedPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public decodedPagedPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public decodedPagedPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public decodedPagedPointer() {
                    this(1, true);
                }

                public decodedPagedPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected decodedPaged createStackElement(long ptr, boolean freeOnGC) {
                    return new decodedPaged(ptr, freeOnGC);
                }
            }
        }
    }
}
