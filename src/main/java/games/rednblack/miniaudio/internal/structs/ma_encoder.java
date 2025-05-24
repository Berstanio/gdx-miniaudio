package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_encoder_config;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_encoder.data;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_encoder.data.vfs;

public final class ma_encoder extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(122).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_encoder(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_encoder(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_encoder() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_encoder.ma_encoderPointer asPointer() {
        return new ma_encoder.ma_encoderPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_encoder.ma_encoderPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_encoder_config config() {
        return new ma_encoder_config(getPointer(), false);
    }

    public void config(ma_encoder_config toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_encoder_config getConfig() {
        return new ma_encoder_config(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getConfig(ma_encoder_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setConfig(ma_encoder_config toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public ClosureObject<GdxMiniaudio.ma_encoder_write_proc> onWrite() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 32), GdxMiniaudio_Internal.ma_encoder_write_proc_Internal::ma_encoder_write_proc_downcall);
    }

    public void onWrite(ClosureObject<GdxMiniaudio.ma_encoder_write_proc> onWrite) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 32, onWrite.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_encoder_seek_proc> onSeek() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 36), GdxMiniaudio_Internal.ma_encoder_seek_proc_Internal::ma_encoder_seek_proc_downcall);
    }

    public void onSeek(ClosureObject<GdxMiniaudio.ma_encoder_seek_proc> onSeek) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 36, onSeek.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_encoder_init_proc> onInit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 64 : 40), GdxMiniaudio_Internal.ma_encoder_init_proc_Internal::ma_encoder_init_proc_downcall);
    }

    public void onInit(ClosureObject<GdxMiniaudio.ma_encoder_init_proc> onInit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 64 : 40, onInit.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_encoder_uninit_proc> onUninit() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 72 : 44), GdxMiniaudio_Internal.ma_encoder_uninit_proc_Internal::ma_encoder_uninit_proc_downcall);
    }

    public void onUninit(ClosureObject<GdxMiniaudio.ma_encoder_uninit_proc> onUninit) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 72 : 44, onUninit.getPointer());
    }

    public ClosureObject<GdxMiniaudio.ma_encoder_write_pcm_frames_proc> onWritePCMFrames() {
        return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 80 : 48), GdxMiniaudio_Internal.ma_encoder_write_pcm_frames_proc_Internal::ma_encoder_write_pcm_frames_proc_downcall);
    }

    public void onWritePCMFrames(ClosureObject<GdxMiniaudio.ma_encoder_write_pcm_frames_proc> onWritePCMFrames) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 80 : 48, onWritePCMFrames.getPointer());
    }

    public VoidPointer pUserData() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 88 : 52), false);
    }

    public void pUserData(VoidPointer pUserData) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 88 : 52, pUserData.getPointer());
    }

    public VoidPointer pInternalEncoder() {
        return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 96 : 56), false);
    }

    public void pInternalEncoder(VoidPointer pInternalEncoder) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 96 : 56, pInternalEncoder.getPointer());
    }

    public data data() {
        return new data(getPointer() + (CHandler.IS_64_BIT ? 104 : 60), false);
    }

    public void data(data toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 104 : 60), CHandler.IS_64_BIT ? 16 : 8, this);
    }

    public data getData() {
        return new data(getBufPtr().duplicate(CHandler.IS_64_BIT ? 104 : 60, CHandler.IS_64_BIT ? 16 : 8), true);
    }

    public void getData(data toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 104 : 60, CHandler.IS_64_BIT ? 16 : 8);
    }

    public void setData(data toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 104 : 60, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
    }

    public static final class ma_encoderPointer extends StackElementPointer<ma_encoder> {

        public ma_encoderPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_encoderPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_encoderPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_encoderPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_encoderPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_encoderPointer() {
            this(1, true);
        }

        public ma_encoderPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_encoder createStackElement(long ptr, boolean freeOnGC) {
            return new ma_encoder(ptr, freeOnGC);
        }
    }

    public final static class data extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(52).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public data(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public data(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public data() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public data.dataPointer asPointer() {
            return new data.dataPointer(getPointer(), false, 1, this);
        }

        public void asPointer(data.dataPointer ptr) {
            ptr.setPointer(this);
        }

        public vfs vfs() {
            return new vfs(getPointer(), false);
        }

        public void vfs(vfs toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
        }

        public vfs getVfs() {
            return new vfs(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
        }

        public void getVfs(vfs toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public void setVfs(vfs toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public static final class dataPointer extends StackElementPointer<data> {

            public dataPointer(VoidPointer pointer) {
                super(pointer);
            }

            public dataPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public dataPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public dataPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public dataPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public dataPointer() {
                this(1, true);
            }

            public dataPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected data createStackElement(long ptr, boolean freeOnGC) {
                return new data(ptr, freeOnGC);
            }
        }

        public final static class vfs extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(248).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public vfs(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public vfs(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public vfs() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public vfs.vfsPointer asPointer() {
                return new vfs.vfsPointer(getPointer(), false, 1, this);
            }

            public void asPointer(vfs.vfsPointer ptr) {
                ptr.setPointer(this);
            }

            public VoidPointer pVFS() {
                return new VoidPointer(getBufPtr().getNativePointer(0), false);
            }

            public void pVFS(VoidPointer pVFS) {
                getBufPtr().setNativePointer(0, pVFS.getPointer());
            }

            public VoidPointer file() {
                return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
            }

            public void file(VoidPointer file) {
                getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, file.getPointer());
            }

            public static final class vfsPointer extends StackElementPointer<vfs> {

                public vfsPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public vfsPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public vfsPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public vfsPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public vfsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public vfsPointer() {
                    this(1, true);
                }

                public vfsPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected vfs createStackElement(long ptr, boolean freeOnGC) {
                    return new vfs(ptr, freeOnGC);
                }
            }
        }
    }
}
