package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_job.toc;
import games.rednblack.miniaudio.internal.structs.ma_job.data;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_job.toc.breakup;
import games.rednblack.miniaudio.internal.structs.ma_job.data.custom;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager;
import games.rednblack.miniaudio.internal.structs.ma_job.data.device;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.loadDataBufferNode;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.freeDataBufferNode;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.pageDataBufferNode;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.loadDataBuffer;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.freeDataBuffer;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.loadDataStream;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.freeDataStream;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.pageDataStream;
import games.rednblack.miniaudio.internal.structs.ma_job.data.resourceManager.seekDataStream;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import games.rednblack.miniaudio.internal.structs.ma_fence;
import games.rednblack.miniaudio.internal.structs.ma_job.data.device.aaudio;
import games.rednblack.miniaudio.internal.structs.ma_job.data.device.aaudio.reroute;

public final class ma_job extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(146).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_job(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_job(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_job() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_job.ma_jobPointer asPointer() {
        return new ma_job.ma_jobPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_job.ma_jobPointer ptr) {
        ptr.setPointer(this);
    }

    public toc toc() {
        return new toc(getPointer(), false);
    }

    public void toc(toc toSetPtr) {
        toSetPtr.setPointer(getPointer(), 8, this);
    }

    public toc getToc() {
        return new toc(getBufPtr().duplicate(0, 8), true);
    }

    public void getToc(toc toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
    }

    public void setToc(toc toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
    }

    public long next() {
        return getBufPtr().getLong(8);
    }

    public void next(long next) {
        getBufPtr().setLong(8, next);
    }

    public long order() {
        return getBufPtr().getUInt(16);
    }

    public void order(long order) {
        getBufPtr().setUInt(16, order);
    }

    public data data() {
        return new data(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24), false);
    }

    public void data(data toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24), (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64, this);
    }

    public data getData() {
        return new data(getBufPtr().duplicate(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64), true);
    }

    public void getData(data toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
    }

    public void setData(data toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_COMPILED_ANDROID_X86 ? 20 : 24, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
    }

    public static final class ma_jobPointer extends StackElementPointer<ma_job> {

        public ma_jobPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_jobPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_jobPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_jobPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_jobPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_jobPointer() {
            this(1, true);
        }

        public ma_jobPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_job createStackElement(long ptr, boolean freeOnGC) {
            return new ma_job(ptr, freeOnGC);
        }
    }

    public final static class toc extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(246).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public toc(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public toc(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public toc() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public toc.tocPointer asPointer() {
            return new toc.tocPointer(getPointer(), false, 1, this);
        }

        public void asPointer(toc.tocPointer ptr) {
            ptr.setPointer(this);
        }

        public breakup breakup() {
            return new breakup(getPointer(), false);
        }

        public void breakup(breakup toSetPtr) {
            toSetPtr.setPointer(getPointer(), 8, this);
        }

        public breakup getBreakup() {
            return new breakup(getBufPtr().duplicate(0, 8), true);
        }

        public void getBreakup(breakup toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 8);
        }

        public void setBreakup(breakup toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 8);
        }

        public long allocation() {
            return getBufPtr().getLong(0);
        }

        public void allocation(long allocation) {
            getBufPtr().setLong(0, allocation);
        }

        public static final class tocPointer extends StackElementPointer<toc> {

            public tocPointer(VoidPointer pointer) {
                super(pointer);
            }

            public tocPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public tocPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public tocPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public tocPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public tocPointer() {
                this(1, true);
            }

            public tocPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected toc createStackElement(long ptr, boolean freeOnGC) {
                return new toc(ptr, freeOnGC);
            }
        }

        public final static class breakup extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(38).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public breakup(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public breakup(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public breakup() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public breakup.breakupPointer asPointer() {
                return new breakup.breakupPointer(getPointer(), false, 1, this);
            }

            public void asPointer(breakup.breakupPointer ptr) {
                ptr.setPointer(this);
            }

            public char code() {
                return getBufPtr().getChar(0);
            }

            public void code(char code) {
                getBufPtr().setChar(0, code);
            }

            public char slot() {
                return getBufPtr().getChar(2);
            }

            public void slot(char slot) {
                getBufPtr().setChar(2, slot);
            }

            public long refcount() {
                return getBufPtr().getUInt(4);
            }

            public void refcount(long refcount) {
                getBufPtr().setUInt(4, refcount);
            }

            public static final class breakupPointer extends StackElementPointer<breakup> {

                public breakupPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public breakupPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public breakupPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public breakupPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public breakupPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public breakupPointer() {
                    this(1, true);
                }

                public breakupPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected breakup createStackElement(long ptr, boolean freeOnGC) {
                    return new breakup(ptr, freeOnGC);
                }
            }
        }
    }

    public final static class data extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(49).getFfiType();
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

        public custom custom() {
            return new custom(getPointer(), false);
        }

        public void custom(custom toSetPtr) {
            toSetPtr.setPointer(getPointer(), ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12, this);
        }

        public custom getCustom() {
            return new custom(getBufPtr().duplicate(0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12), true);
        }

        public void getCustom(custom toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
        }

        public void setCustom(custom toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 24 : 12);
        }

        public resourceManager resourceManager() {
            return new resourceManager(getPointer(), false);
        }

        public void resourceManager(resourceManager toSetPtr) {
            toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64, this);
        }

        public resourceManager getResourceManager() {
            return new resourceManager(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64), true);
        }

        public void getResourceManager(resourceManager toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
        }

        public void setResourceManager(resourceManager toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
        }

        public device device() {
            return new device(getPointer(), false);
        }

        public void device(device toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
        }

        public device getDevice() {
            return new device(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
        }

        public void getDevice(device toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
        }

        public void setDevice(device toCopyFrom) {
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

        public final static class custom extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(47).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public custom(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public custom(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public custom() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public custom.customPointer asPointer() {
                return new custom.customPointer(getPointer(), false, 1, this);
            }

            public void asPointer(custom.customPointer ptr) {
                ptr.setPointer(this);
            }

            public ClosureObject<GdxMiniaudio.ma_job_proc> proc() {
                return CHandler.getClosureObject(getBufPtr().getNativePointer(0), GdxMiniaudio_Internal.ma_job_proc_Internal::ma_job_proc_downcall);
            }

            public void proc(ClosureObject<GdxMiniaudio.ma_job_proc> proc) {
                getBufPtr().setNativePointer(0, proc.getPointer());
            }

            public long data0() {
                return getBufPtr().getNativeULong(CHandler.IS_64_BIT ? 8 : 4);
            }

            public void data0(long data0) {
                getBufPtr().setNativeULong(CHandler.IS_64_BIT ? 8 : 4, data0);
            }

            public long data1() {
                return getBufPtr().getNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8);
            }

            public void data1(long data1) {
                getBufPtr().setNativeULong(((CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 16 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN)) ? 12 : 8, data1);
            }

            public static final class customPointer extends StackElementPointer<custom> {

                public customPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public customPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public customPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public customPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public customPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public customPointer() {
                    this(1, true);
                }

                public customPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected custom createStackElement(long ptr, boolean freeOnGC) {
                    return new custom(ptr, freeOnGC);
                }
            }
        }

        public final static class resourceManager extends Union {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(240).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public resourceManager(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public resourceManager(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public resourceManager() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public resourceManager.resourceManagerPointer asPointer() {
                return new resourceManager.resourceManagerPointer(getPointer(), false, 1, this);
            }

            public void asPointer(resourceManager.resourceManagerPointer ptr) {
                ptr.setPointer(this);
            }

            public loadDataBufferNode loadDataBufferNode() {
                return new loadDataBufferNode(getPointer(), false);
            }

            public void loadDataBufferNode(loadDataBufferNode toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 72 : 36, this);
            }

            public loadDataBufferNode getLoadDataBufferNode() {
                return new loadDataBufferNode(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 72 : 36), true);
            }

            public void getLoadDataBufferNode(loadDataBufferNode toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 72 : 36);
            }

            public void setLoadDataBufferNode(loadDataBufferNode toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 72 : 36);
            }

            public freeDataBufferNode freeDataBufferNode() {
                return new freeDataBufferNode(getPointer(), false);
            }

            public void freeDataBufferNode(freeDataBufferNode toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 32 : 16, this);
            }

            public freeDataBufferNode getFreeDataBufferNode() {
                return new freeDataBufferNode(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 32 : 16), true);
            }

            public void getFreeDataBufferNode(freeDataBufferNode toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
            }

            public void setFreeDataBufferNode(freeDataBufferNode toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 32 : 16);
            }

            public pageDataBufferNode pageDataBufferNode() {
                return new pageDataBufferNode(getPointer(), false);
            }

            public void pageDataBufferNode(pageDataBufferNode toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 40 : 20, this);
            }

            public pageDataBufferNode getPageDataBufferNode() {
                return new pageDataBufferNode(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 40 : 20), true);
            }

            public void getPageDataBufferNode(pageDataBufferNode toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 20);
            }

            public void setPageDataBufferNode(pageDataBufferNode toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 40 : 20);
            }

            public loadDataBuffer loadDataBuffer() {
                return new loadDataBuffer(getPointer(), false);
            }

            public void loadDataBuffer(loadDataBuffer toSetPtr) {
                toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64, this);
            }

            public loadDataBuffer getLoadDataBuffer() {
                return new loadDataBuffer(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64), true);
            }

            public void getLoadDataBuffer(loadDataBuffer toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
            }

            public void setLoadDataBuffer(loadDataBuffer toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 56 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 80 : 64);
            }

            public freeDataBuffer freeDataBuffer() {
                return new freeDataBuffer(getPointer(), false);
            }

            public void freeDataBuffer(freeDataBuffer toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 24 : 12, this);
            }

            public freeDataBuffer getFreeDataBuffer() {
                return new freeDataBuffer(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 24 : 12), true);
            }

            public void getFreeDataBuffer(freeDataBuffer toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
            }

            public void setFreeDataBuffer(freeDataBuffer toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
            }

            public loadDataStream loadDataStream() {
                return new loadDataStream(getPointer(), false);
            }

            public void loadDataStream(loadDataStream toSetPtr) {
                toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32, this);
            }

            public loadDataStream getLoadDataStream() {
                return new loadDataStream(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32), true);
            }

            public void getLoadDataStream(loadDataStream toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32);
            }

            public void setLoadDataStream(loadDataStream toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32);
            }

            public freeDataStream freeDataStream() {
                return new freeDataStream(getPointer(), false);
            }

            public void freeDataStream(freeDataStream toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 24 : 12, this);
            }

            public freeDataStream getFreeDataStream() {
                return new freeDataStream(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 24 : 12), true);
            }

            public void getFreeDataStream(freeDataStream toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
            }

            public void setFreeDataStream(freeDataStream toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
            }

            public pageDataStream pageDataStream() {
                return new pageDataStream(getPointer(), false);
            }

            public void pageDataStream(pageDataStream toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
            }

            public pageDataStream getPageDataStream() {
                return new pageDataStream(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
            }

            public void getPageDataStream(pageDataStream toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
            }

            public void setPageDataStream(pageDataStream toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
            }

            public seekDataStream seekDataStream() {
                return new seekDataStream(getPointer(), false);
            }

            public void seekDataStream(seekDataStream toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16, this);
            }

            public seekDataStream getSeekDataStream() {
                return new seekDataStream(getBufPtr().duplicate(0, CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16), true);
            }

            public void getSeekDataStream(seekDataStream toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
            }

            public void setSeekDataStream(seekDataStream toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 12 : 16);
            }

            public static final class resourceManagerPointer extends StackElementPointer<resourceManager> {

                public resourceManagerPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public resourceManagerPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public resourceManagerPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public resourceManagerPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public resourceManagerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public resourceManagerPointer() {
                    this(1, true);
                }

                public resourceManagerPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected resourceManager createStackElement(long ptr, boolean freeOnGC) {
                    return new resourceManager(ptr, freeOnGC);
                }
            }

            public final static class loadDataBufferNode extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(67).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public loadDataBufferNode(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public loadDataBufferNode(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public loadDataBufferNode() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public loadDataBufferNode.loadDataBufferNodePointer asPointer() {
                    return new loadDataBufferNode.loadDataBufferNodePointer(getPointer(), false, 1, this);
                }

                public void asPointer(loadDataBufferNode.loadDataBufferNodePointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pResourceManager() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pResourceManager(VoidPointer pResourceManager) {
                    getBufPtr().setNativePointer(0, pResourceManager.getPointer());
                }

                public VoidPointer pDataBufferNode() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pDataBufferNode(VoidPointer pDataBufferNode) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pDataBufferNode.getPointer());
                }

                public BytePointer pFilePath() {
                    return new BytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pFilePath(BytePointer pFilePath) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pFilePath.getPointer());
                }

                public SIntPointer pFilePathW() {
                    return new SIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
                }

                public void pFilePathW(SIntPointer pFilePathW) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pFilePathW.getPointer());
                }

                public long flags() {
                    return getBufPtr().getUInt(CHandler.IS_64_BIT ? 32 : 16);
                }

                public void flags(long flags) {
                    getBufPtr().setUInt(CHandler.IS_64_BIT ? 32 : 16, flags);
                }

                public VoidPointer pInitNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), false);
                }

                public void pInitNotification(VoidPointer pInitNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, pInitNotification.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pInitFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 28), false);
                }

                public void pInitFence(ma_fence.ma_fencePointer pInitFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 28, pInitFence.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 64 : 32), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 64 : 32, pDoneFence.getPointer());
                }

                public static final class loadDataBufferNodePointer extends StackElementPointer<loadDataBufferNode> {

                    public loadDataBufferNodePointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public loadDataBufferNodePointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public loadDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public loadDataBufferNodePointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public loadDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public loadDataBufferNodePointer() {
                        this(1, true);
                    }

                    public loadDataBufferNodePointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected loadDataBufferNode createStackElement(long ptr, boolean freeOnGC) {
                        return new loadDataBufferNode(ptr, freeOnGC);
                    }
                }
            }

            public final static class freeDataBufferNode extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(60).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public freeDataBufferNode(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public freeDataBufferNode(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public freeDataBufferNode() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public freeDataBufferNode.freeDataBufferNodePointer asPointer() {
                    return new freeDataBufferNode.freeDataBufferNodePointer(getPointer(), false, 1, this);
                }

                public void asPointer(freeDataBufferNode.freeDataBufferNodePointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pResourceManager() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pResourceManager(VoidPointer pResourceManager) {
                    getBufPtr().setNativePointer(0, pResourceManager.getPointer());
                }

                public VoidPointer pDataBufferNode() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pDataBufferNode(VoidPointer pDataBufferNode) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pDataBufferNode.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pDoneFence.getPointer());
                }

                public static final class freeDataBufferNodePointer extends StackElementPointer<freeDataBufferNode> {

                    public freeDataBufferNodePointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public freeDataBufferNodePointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public freeDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public freeDataBufferNodePointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public freeDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public freeDataBufferNodePointer() {
                        this(1, true);
                    }

                    public freeDataBufferNodePointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected freeDataBufferNode createStackElement(long ptr, boolean freeOnGC) {
                        return new freeDataBufferNode(ptr, freeOnGC);
                    }
                }
            }

            public final static class pageDataBufferNode extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(229).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public pageDataBufferNode(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public pageDataBufferNode(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public pageDataBufferNode() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public pageDataBufferNode.pageDataBufferNodePointer asPointer() {
                    return new pageDataBufferNode.pageDataBufferNodePointer(getPointer(), false, 1, this);
                }

                public void asPointer(pageDataBufferNode.pageDataBufferNodePointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pResourceManager() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pResourceManager(VoidPointer pResourceManager) {
                    getBufPtr().setNativePointer(0, pResourceManager.getPointer());
                }

                public VoidPointer pDataBufferNode() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pDataBufferNode(VoidPointer pDataBufferNode) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pDataBufferNode.getPointer());
                }

                public VoidPointer pDecoder() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pDecoder(VoidPointer pDecoder) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDecoder.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pDoneFence.getPointer());
                }

                public static final class pageDataBufferNodePointer extends StackElementPointer<pageDataBufferNode> {

                    public pageDataBufferNodePointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public pageDataBufferNodePointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public pageDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public pageDataBufferNodePointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public pageDataBufferNodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public pageDataBufferNodePointer() {
                        this(1, true);
                    }

                    public pageDataBufferNodePointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected pageDataBufferNode createStackElement(long ptr, boolean freeOnGC) {
                        return new pageDataBufferNode(ptr, freeOnGC);
                    }
                }
            }

            public final static class loadDataBuffer extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(66).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public loadDataBuffer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public loadDataBuffer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public loadDataBuffer() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public loadDataBuffer.loadDataBufferPointer asPointer() {
                    return new loadDataBuffer.loadDataBufferPointer(getPointer(), false, 1, this);
                }

                public void asPointer(loadDataBuffer.loadDataBufferPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataBuffer() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataBuffer(VoidPointer pDataBuffer) {
                    getBufPtr().setNativePointer(0, pDataBuffer.getPointer());
                }

                public VoidPointer pInitNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pInitNotification(VoidPointer pInitNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pInitNotification.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pInitFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
                }

                public void pInitFence(ma_fence.ma_fencePointer pInitFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, pInitFence.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, pDoneFence.getPointer());
                }

                public long rangeBegInPCMFrames() {
                    return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 24);
                }

                public void rangeBegInPCMFrames(long rangeBegInPCMFrames) {
                    getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 24, rangeBegInPCMFrames);
                }

                public long rangeEndInPCMFrames() {
                    return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32);
                }

                public void rangeEndInPCMFrames(long rangeEndInPCMFrames) {
                    getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 28 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 48 : 32, rangeEndInPCMFrames);
                }

                public long loopPointBegInPCMFrames() {
                    return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 56 : 40);
                }

                public void loopPointBegInPCMFrames(long loopPointBegInPCMFrames) {
                    getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 36 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 56 : 40, loopPointBegInPCMFrames);
                }

                public long loopPointEndInPCMFrames() {
                    return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 48);
                }

                public void loopPointEndInPCMFrames(long loopPointEndInPCMFrames) {
                    getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 44 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 64 : 48, loopPointEndInPCMFrames);
                }

                public long isLooping() {
                    return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
                }

                public void isLooping(long isLooping) {
                    getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, isLooping);
                }

                public static final class loadDataBufferPointer extends StackElementPointer<loadDataBuffer> {

                    public loadDataBufferPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public loadDataBufferPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public loadDataBufferPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public loadDataBufferPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public loadDataBufferPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public loadDataBufferPointer() {
                        this(1, true);
                    }

                    public loadDataBufferPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected loadDataBuffer createStackElement(long ptr, boolean freeOnGC) {
                        return new loadDataBuffer(ptr, freeOnGC);
                    }
                }
            }

            public final static class freeDataBuffer extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(59).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public freeDataBuffer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public freeDataBuffer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public freeDataBuffer() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public freeDataBuffer.freeDataBufferPointer asPointer() {
                    return new freeDataBuffer.freeDataBufferPointer(getPointer(), false, 1, this);
                }

                public void asPointer(freeDataBuffer.freeDataBufferPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataBuffer() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataBuffer(VoidPointer pDataBuffer) {
                    getBufPtr().setNativePointer(0, pDataBuffer.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDoneFence.getPointer());
                }

                public static final class freeDataBufferPointer extends StackElementPointer<freeDataBuffer> {

                    public freeDataBufferPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public freeDataBufferPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public freeDataBufferPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public freeDataBufferPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public freeDataBufferPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public freeDataBufferPointer() {
                        this(1, true);
                    }

                    public freeDataBufferPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected freeDataBuffer createStackElement(long ptr, boolean freeOnGC) {
                        return new freeDataBuffer(ptr, freeOnGC);
                    }
                }
            }

            public final static class loadDataStream extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(68).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public loadDataStream(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public loadDataStream(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public loadDataStream() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public loadDataStream.loadDataStreamPointer asPointer() {
                    return new loadDataStream.loadDataStreamPointer(getPointer(), false, 1, this);
                }

                public void asPointer(loadDataStream.loadDataStreamPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataStream() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataStream(VoidPointer pDataStream) {
                    getBufPtr().setNativePointer(0, pDataStream.getPointer());
                }

                public BytePointer pFilePath() {
                    return new BytePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pFilePath(BytePointer pFilePath) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pFilePath.getPointer());
                }

                public SIntPointer pFilePathW() {
                    return new SIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pFilePathW(SIntPointer pFilePathW) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pFilePathW.getPointer());
                }

                public long initialSeekPoint() {
                    return getBufPtr().getLong((CHandler.IS_COMPILED_ANDROID_X86) ? 12 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 16 : 24);
                }

                public void initialSeekPoint(long initialSeekPoint) {
                    getBufPtr().setLong((CHandler.IS_COMPILED_ANDROID_X86) ? 12 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 16 : 24, initialSeekPoint);
                }

                public VoidPointer pInitNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 24), false);
                }

                public void pInitNotification(VoidPointer pInitNotification) {
                    getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 20 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 32 : 24, pInitNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pInitFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 28), false);
                }

                public void pInitFence(ma_fence.ma_fencePointer pInitFence) {
                    getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 24 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 40 : 28, pInitFence.getPointer());
                }

                public static final class loadDataStreamPointer extends StackElementPointer<loadDataStream> {

                    public loadDataStreamPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public loadDataStreamPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public loadDataStreamPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public loadDataStreamPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public loadDataStreamPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public loadDataStreamPointer() {
                        this(1, true);
                    }

                    public loadDataStreamPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected loadDataStream createStackElement(long ptr, boolean freeOnGC) {
                        return new loadDataStream(ptr, freeOnGC);
                    }
                }
            }

            public final static class freeDataStream extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(61).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public freeDataStream(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public freeDataStream(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public freeDataStream() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public freeDataStream.freeDataStreamPointer asPointer() {
                    return new freeDataStream.freeDataStreamPointer(getPointer(), false, 1, this);
                }

                public void asPointer(freeDataStream.freeDataStreamPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataStream() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataStream(VoidPointer pDataStream) {
                    getBufPtr().setNativePointer(0, pDataStream.getPointer());
                }

                public VoidPointer pDoneNotification() {
                    return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
                }

                public void pDoneNotification(VoidPointer pDoneNotification) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, pDoneNotification.getPointer());
                }

                public ma_fence.ma_fencePointer pDoneFence() {
                    return new ma_fence.ma_fencePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
                }

                public void pDoneFence(ma_fence.ma_fencePointer pDoneFence) {
                    getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, pDoneFence.getPointer());
                }

                public static final class freeDataStreamPointer extends StackElementPointer<freeDataStream> {

                    public freeDataStreamPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public freeDataStreamPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public freeDataStreamPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public freeDataStreamPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public freeDataStreamPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public freeDataStreamPointer() {
                        this(1, true);
                    }

                    public freeDataStreamPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected freeDataStream createStackElement(long ptr, boolean freeOnGC) {
                        return new freeDataStream(ptr, freeOnGC);
                    }
                }
            }

            public final static class pageDataStream extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(230).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public pageDataStream(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public pageDataStream(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public pageDataStream() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public pageDataStream.pageDataStreamPointer asPointer() {
                    return new pageDataStream.pageDataStreamPointer(getPointer(), false, 1, this);
                }

                public void asPointer(pageDataStream.pageDataStreamPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataStream() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataStream(VoidPointer pDataStream) {
                    getBufPtr().setNativePointer(0, pDataStream.getPointer());
                }

                public long pageIndex() {
                    return getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4);
                }

                public void pageIndex(long pageIndex) {
                    getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, pageIndex);
                }

                public static final class pageDataStreamPointer extends StackElementPointer<pageDataStream> {

                    public pageDataStreamPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public pageDataStreamPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public pageDataStreamPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public pageDataStreamPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public pageDataStreamPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public pageDataStreamPointer() {
                        this(1, true);
                    }

                    public pageDataStreamPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected pageDataStream createStackElement(long ptr, boolean freeOnGC) {
                        return new pageDataStream(ptr, freeOnGC);
                    }
                }
            }

            public final static class seekDataStream extends Struct {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(241).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public seekDataStream(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public seekDataStream(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public seekDataStream() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public seekDataStream.seekDataStreamPointer asPointer() {
                    return new seekDataStream.seekDataStreamPointer(getPointer(), false, 1, this);
                }

                public void asPointer(seekDataStream.seekDataStreamPointer ptr) {
                    ptr.setPointer(this);
                }

                public VoidPointer pDataStream() {
                    return new VoidPointer(getBufPtr().getNativePointer(0), false);
                }

                public void pDataStream(VoidPointer pDataStream) {
                    getBufPtr().setNativePointer(0, pDataStream.getPointer());
                }

                public long frameIndex() {
                    return getBufPtr().getLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8);
                }

                public void frameIndex(long frameIndex) {
                    getBufPtr().setLong(CHandler.IS_COMPILED_ANDROID_X86 ? 4 : 8, frameIndex);
                }

                public static final class seekDataStreamPointer extends StackElementPointer<seekDataStream> {

                    public seekDataStreamPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public seekDataStreamPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public seekDataStreamPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public seekDataStreamPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public seekDataStreamPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public seekDataStreamPointer() {
                        this(1, true);
                    }

                    public seekDataStreamPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected seekDataStream createStackElement(long ptr, boolean freeOnGC) {
                        return new seekDataStream(ptr, freeOnGC);
                    }
                }
            }
        }

        public final static class device extends Union {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(55).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public device(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public device(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public device() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public device.devicePointer asPointer() {
                return new device.devicePointer(getPointer(), false, 1, this);
            }

            public void asPointer(device.devicePointer ptr) {
                ptr.setPointer(this);
            }

            public aaudio aaudio() {
                return new aaudio(getPointer(), false);
            }

            public void aaudio(aaudio toSetPtr) {
                toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
            }

            public aaudio getAaudio() {
                return new aaudio(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
            }

            public void getAaudio(aaudio toCopyTo) {
                toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
            }

            public void setAaudio(aaudio toCopyFrom) {
                getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
            }

            public static final class devicePointer extends StackElementPointer<device> {

                public devicePointer(VoidPointer pointer) {
                    super(pointer);
                }

                public devicePointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public devicePointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public devicePointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public devicePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public devicePointer() {
                    this(1, true);
                }

                public devicePointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected device createStackElement(long ptr, boolean freeOnGC) {
                    return new device(ptr, freeOnGC);
                }
            }

            public final static class aaudio extends Union {

                private final static int __size;

                private final static long __ffi_type;

                static {
                    __ffi_type = FFITypes.getCTypeInfo(32).getFfiType();
                    __size = CHandler.getSizeFromFFIType(__ffi_type);
                }

                public aaudio(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public aaudio(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public aaudio() {
                    super(__size);
                }

                public long getSize() {
                    return __size;
                }

                public long getFFIType() {
                    return __ffi_type;
                }

                public aaudio.aaudioPointer asPointer() {
                    return new aaudio.aaudioPointer(getPointer(), false, 1, this);
                }

                public void asPointer(aaudio.aaudioPointer ptr) {
                    ptr.setPointer(this);
                }

                public reroute reroute() {
                    return new reroute(getPointer(), false);
                }

                public void reroute(reroute toSetPtr) {
                    toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 16 : 8, this);
                }

                public reroute getReroute() {
                    return new reroute(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 16 : 8), true);
                }

                public void getReroute(reroute toCopyTo) {
                    toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
                }

                public void setReroute(reroute toCopyFrom) {
                    getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 16 : 8);
                }

                public static final class aaudioPointer extends StackElementPointer<aaudio> {

                    public aaudioPointer(VoidPointer pointer) {
                        super(pointer);
                    }

                    public aaudioPointer(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public aaudioPointer(long pointer, boolean freeOnGC, int capacity) {
                        super(pointer, freeOnGC, capacity * __size);
                    }

                    public aaudioPointer(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public aaudioPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                        super(pointer, freeOnGC, capacity * __size);
                        setParent(parent);
                    }

                    public aaudioPointer() {
                        this(1, true);
                    }

                    public aaudioPointer(int count, boolean freeOnGC) {
                        super(__size, count, freeOnGC);
                    }

                    public int getSize() {
                        return __size;
                    }

                    protected aaudio createStackElement(long ptr, boolean freeOnGC) {
                        return new aaudio(ptr, freeOnGC);
                    }
                }

                public final static class reroute extends Struct {

                    private final static int __size;

                    private final static long __ffi_type;

                    static {
                        __ffi_type = FFITypes.getCTypeInfo(237).getFfiType();
                        __size = CHandler.getSizeFromFFIType(__ffi_type);
                    }

                    public reroute(long pointer, boolean freeOnGC) {
                        super(pointer, freeOnGC);
                    }

                    public reroute(long pointer, boolean freeOnGC, Pointing parent) {
                        super(pointer, freeOnGC);
                        setParent(parent);
                    }

                    public reroute() {
                        super(__size);
                    }

                    public long getSize() {
                        return __size;
                    }

                    public long getFFIType() {
                        return __ffi_type;
                    }

                    public reroute.reroutePointer asPointer() {
                        return new reroute.reroutePointer(getPointer(), false, 1, this);
                    }

                    public void asPointer(reroute.reroutePointer ptr) {
                        ptr.setPointer(this);
                    }

                    public VoidPointer pDevice() {
                        return new VoidPointer(getBufPtr().getNativePointer(0), false);
                    }

                    public void pDevice(VoidPointer pDevice) {
                        getBufPtr().setNativePointer(0, pDevice.getPointer());
                    }

                    public long deviceType() {
                        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 8 : 4);
                    }

                    public void deviceType(long deviceType) {
                        getBufPtr().setUInt(CHandler.IS_64_BIT ? 8 : 4, deviceType);
                    }

                    public static final class reroutePointer extends StackElementPointer<reroute> {

                        public reroutePointer(VoidPointer pointer) {
                            super(pointer);
                        }

                        public reroutePointer(long pointer, boolean freeOnGC) {
                            super(pointer, freeOnGC);
                        }

                        public reroutePointer(long pointer, boolean freeOnGC, int capacity) {
                            super(pointer, freeOnGC, capacity * __size);
                        }

                        public reroutePointer(long pointer, boolean freeOnGC, Pointing parent) {
                            super(pointer, freeOnGC);
                            setParent(parent);
                        }

                        public reroutePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                            super(pointer, freeOnGC, capacity * __size);
                            setParent(parent);
                        }

                        public reroutePointer() {
                            this(1, true);
                        }

                        public reroutePointer(int count, boolean freeOnGC) {
                            super(__size, count, freeOnGC);
                        }

                        public int getSize() {
                            return __size;
                        }

                        protected reroute createStackElement(long ptr, boolean freeOnGC) {
                            return new reroute(ptr, freeOnGC);
                        }
                    }
                }
            }
        }
    }
}
