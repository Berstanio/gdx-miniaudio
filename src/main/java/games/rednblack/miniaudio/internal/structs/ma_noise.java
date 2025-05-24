package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_data_source_base;
import games.rednblack.miniaudio.internal.structs.ma_noise_config;
import games.rednblack.miniaudio.internal.structs.ma_lcg;
import games.rednblack.miniaudio.internal.structs.ma_noise.state;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import games.rednblack.miniaudio.internal.structs.ma_noise.state.pink;
import games.rednblack.miniaudio.internal.structs.ma_noise.state.brownian;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.DoublePointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;

public final class ma_noise extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(172).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_noise(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_noise(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_noise() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_noise.ma_noisePointer asPointer() {
        return new ma_noise.ma_noisePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_noise.ma_noisePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_data_source_base ds() {
        return new ma_data_source_base(getPointer(), false);
    }

    public void ds(ma_data_source_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, this);
    }

    public ma_data_source_base getDs() {
        return new ma_data_source_base(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), true);
    }

    public void getDs(ma_data_source_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public void setDs(ma_data_source_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56);
    }

    public ma_noise_config config() {
        return new ma_noise_config(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), false);
    }

    public void config(ma_noise_config toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56), CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32, this);
    }

    public ma_noise_config getConfig() {
        return new ma_noise_config(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32), true);
    }

    public void getConfig(ma_noise_config toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public void setConfig(ma_noise_config toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 52 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 72 : 56, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 28 : 32);
    }

    public ma_lcg lcg() {
        return new ma_lcg(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88), false);
    }

    public void lcg(ma_lcg toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88), 4, this);
    }

    public ma_lcg getLcg() {
        return new ma_lcg(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88, 4), true);
    }

    public void getLcg(ma_lcg toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88, 4);
    }

    public void setLcg(ma_lcg toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 80 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 104 : 88, toCopyFrom.getBufPtr(), 0, 4);
    }

    public state state() {
        return new state(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 92), false);
    }

    public void state(state toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 92), CHandler.IS_64_BIT ? 24 : 12, this);
    }

    public state getState() {
        return new state(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 92, CHandler.IS_64_BIT ? 24 : 12), true);
    }

    public void getState(state toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 92, CHandler.IS_64_BIT ? 24 : 12);
    }

    public void setState(state toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 84 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 112 : 92, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104, _pHeap.getPointer());
    }

    public long _ownsHeap() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 108);
    }

    public void _ownsHeap(long _ownsHeap) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 100 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 144 : 108, _ownsHeap);
    }

    public static final class ma_noisePointer extends StackElementPointer<ma_noise> {

        public ma_noisePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_noisePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_noisePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_noisePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_noisePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_noisePointer() {
            this(1, true);
        }

        public ma_noisePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_noise createStackElement(long ptr, boolean freeOnGC) {
            return new ma_noise(ptr, freeOnGC);
        }
    }

    public final static class state extends Union {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(244).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public state(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public state(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public state() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public state.statePointer asPointer() {
            return new state.statePointer(getPointer(), false, 1, this);
        }

        public void asPointer(state.statePointer ptr) {
            ptr.setPointer(this);
        }

        public pink pink() {
            return new pink(getPointer(), false);
        }

        public void pink(pink toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 24 : 12, this);
        }

        public pink getPink() {
            return new pink(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 24 : 12), true);
        }

        public void getPink(pink toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
        }

        public void setPink(pink toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 24 : 12);
        }

        public brownian brownian() {
            return new brownian(getPointer(), false);
        }

        public void brownian(brownian toSetPtr) {
            toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 8 : 4, this);
        }

        public brownian getBrownian() {
            return new brownian(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 8 : 4), true);
        }

        public void getBrownian(brownian toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
        }

        public void setBrownian(brownian toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 8 : 4);
        }

        public static final class statePointer extends StackElementPointer<state> {

            public statePointer(VoidPointer pointer) {
                super(pointer);
            }

            public statePointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public statePointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public statePointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public statePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public statePointer() {
                this(1, true);
            }

            public statePointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected state createStackElement(long ptr, boolean freeOnGC) {
                return new state(ptr, freeOnGC);
            }
        }

        public final static class pink extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(231).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public pink(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public pink(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public pink() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public pink.pinkPointer asPointer() {
                return new pink.pinkPointer(getPointer(), false, 1, this);
            }

            public void asPointer(pink.pinkPointer ptr) {
                ptr.setPointer(this);
            }

            public PointerPointer<DoublePointer> bin() {
                return new PointerPointer<>(getBufPtr().getNativePointer(0), false, DoublePointer::new);
            }

            public void bin(PointerPointer<DoublePointer> bin) {
                getBufPtr().setNativePointer(0, bin.getPointer());
            }

            public DoublePointer accumulation() {
                return new DoublePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), false);
            }

            public void accumulation(DoublePointer accumulation) {
                getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, accumulation.getPointer());
            }

            public UIntPointer counter() {
                return new UIntPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), false);
            }

            public void counter(UIntPointer counter) {
                getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, counter.getPointer());
            }

            public static final class pinkPointer extends StackElementPointer<pink> {

                public pinkPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public pinkPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public pinkPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public pinkPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public pinkPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public pinkPointer() {
                    this(1, true);
                }

                public pinkPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected pink createStackElement(long ptr, boolean freeOnGC) {
                    return new pink(ptr, freeOnGC);
                }
            }
        }

        public final static class brownian extends Struct {

            private final static int __size;

            private final static long __ffi_type;

            static {
                __ffi_type = FFITypes.getCTypeInfo(39).getFfiType();
                __size = CHandler.getSizeFromFFIType(__ffi_type);
            }

            public brownian(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public brownian(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public brownian() {
                super(__size);
            }

            public long getSize() {
                return __size;
            }

            public long getFFIType() {
                return __ffi_type;
            }

            public brownian.brownianPointer asPointer() {
                return new brownian.brownianPointer(getPointer(), false, 1, this);
            }

            public void asPointer(brownian.brownianPointer ptr) {
                ptr.setPointer(this);
            }

            public DoublePointer accumulation() {
                return new DoublePointer(getBufPtr().getNativePointer(0), false);
            }

            public void accumulation(DoublePointer accumulation) {
                getBufPtr().setNativePointer(0, accumulation.getPointer());
            }

            public static final class brownianPointer extends StackElementPointer<brownian> {

                public brownianPointer(VoidPointer pointer) {
                    super(pointer);
                }

                public brownianPointer(long pointer, boolean freeOnGC) {
                    super(pointer, freeOnGC);
                }

                public brownianPointer(long pointer, boolean freeOnGC, int capacity) {
                    super(pointer, freeOnGC, capacity * __size);
                }

                public brownianPointer(long pointer, boolean freeOnGC, Pointing parent) {
                    super(pointer, freeOnGC);
                    setParent(parent);
                }

                public brownianPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                    super(pointer, freeOnGC, capacity * __size);
                    setParent(parent);
                }

                public brownianPointer() {
                    this(1, true);
                }

                public brownianPointer(int count, boolean freeOnGC) {
                    super(__size, count, freeOnGC);
                }

                public int getSize() {
                    return __size;
                }

                protected brownian createStackElement(long ptr, boolean freeOnGC) {
                    return new brownian(ptr, freeOnGC);
                }
            }
        }
    }
}
