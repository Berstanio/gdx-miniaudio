package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_node_base;
import games.rednblack.miniaudio.internal.structs.ma_engine;
import games.rednblack.miniaudio.internal.enums.ma_mono_expansion_mode;
import games.rednblack.miniaudio.internal.structs.ma_fader;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler;
import games.rednblack.miniaudio.internal.structs.ma_spatializer;
import games.rednblack.miniaudio.internal.structs.ma_panner;
import games.rednblack.miniaudio.internal.structs.ma_gainer;
import games.rednblack.miniaudio.internal.structs.ma_atomic_float;
import games.rednblack.miniaudio.internal.structs.ma_engine_node.fadeSettings;
import games.rednblack.miniaudio.internal.structs.ma_atomic_uint64;

public final class ma_engine_node extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(126).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_engine_node(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_engine_node(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_engine_node() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_engine_node.ma_engine_nodePointer asPointer() {
        return new ma_engine_node.ma_engine_nodePointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_engine_node.ma_engine_nodePointer ptr) {
        ptr.setPointer(this);
    }

    public ma_node_base baseNode() {
        return new ma_node_base(getPointer(), false);
    }

    public void baseNode(ma_node_base toSetPtr) {
        toSetPtr.setPointer(getPointer(), CHandler.IS_64_BIT ? 360 : 256, this);
    }

    public ma_node_base getBaseNode() {
        return new ma_node_base(getBufPtr().duplicate(0, CHandler.IS_64_BIT ? 360 : 256), true);
    }

    public void getBaseNode(ma_node_base toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public void setBaseNode(ma_node_base toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 360 : 256);
    }

    public ma_engine.ma_enginePointer pEngine() {
        return new ma_engine.ma_enginePointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 360 : 256), false);
    }

    public void pEngine(ma_engine.ma_enginePointer pEngine) {
        getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 360 : 256, pEngine.getPointer());
    }

    public long sampleRate() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 368 : 260);
    }

    public void sampleRate(long sampleRate) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 368 : 260, sampleRate);
    }

    public long volumeSmoothTimeInPCMFrames() {
        return getBufPtr().getUInt(CHandler.IS_64_BIT ? 372 : 264);
    }

    public void volumeSmoothTimeInPCMFrames(long volumeSmoothTimeInPCMFrames) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 372 : 264, volumeSmoothTimeInPCMFrames);
    }

    public ma_mono_expansion_mode monoExpansionMode() {
        return ma_mono_expansion_mode.getByIndex((int) getBufPtr().getUInt(CHandler.IS_64_BIT ? 376 : 268));
    }

    public void monoExpansionMode(ma_mono_expansion_mode monoExpansionMode) {
        getBufPtr().setUInt(CHandler.IS_64_BIT ? 376 : 268, monoExpansionMode.getIndex());
    }

    public ma_fader fader() {
        return new ma_fader(getPointer() + (CHandler.IS_64_BIT ? 384 : 272), false);
    }

    public void fader(ma_fader toSetPtr) {
        toSetPtr.setPointer(getPointer() + (CHandler.IS_64_BIT ? 384 : 272), CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40, this);
    }

    public ma_fader getFader() {
        return new ma_fader(getBufPtr().duplicate(CHandler.IS_64_BIT ? 384 : 272, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40), true);
    }

    public void getFader(ma_fader toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), CHandler.IS_64_BIT ? 384 : 272, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40);
    }

    public void setFader(ma_fader toCopyFrom) {
        getBufPtr().copyFrom(CHandler.IS_64_BIT ? 384 : 272, toCopyFrom.getBufPtr(), 0, CHandler.IS_COMPILED_ANDROID_X86 ? 36 : 40);
    }

    public ma_linear_resampler resampler() {
        return new ma_linear_resampler(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 308 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 424 : 312), false);
    }

    public void resampler(ma_linear_resampler toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 308 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 424 : 312), (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104, this);
    }

    public ma_linear_resampler getResampler() {
        return new ma_linear_resampler(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 308 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 424 : 312, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104), true);
    }

    public void getResampler(ma_linear_resampler toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 308 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 424 : 312, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
    }

    public void setResampler(ma_linear_resampler toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 308 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 424 : 312, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 96 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 136 : 104);
    }

    public ma_spatializer spatializer() {
        return new ma_spatializer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 404 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 560 : 416), false);
    }

    public void spatializer(ma_spatializer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 404 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 560 : 416), CHandler.IS_64_BIT ? 200 : 168, this);
    }

    public ma_spatializer getSpatializer() {
        return new ma_spatializer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 404 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 560 : 416, CHandler.IS_64_BIT ? 200 : 168), true);
    }

    public void getSpatializer(ma_spatializer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 404 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 560 : 416, CHandler.IS_64_BIT ? 200 : 168);
    }

    public void setSpatializer(ma_spatializer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 404 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 560 : 416, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 200 : 168);
    }

    public ma_panner panner() {
        return new ma_panner(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 572 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 584), false);
    }

    public void panner(ma_panner toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 572 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 584), 16, this);
    }

    public ma_panner getPanner() {
        return new ma_panner(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 572 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 584, 16), true);
    }

    public void getPanner(ma_panner toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 572 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 584, 16);
    }

    public void setPanner(ma_panner toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 572 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 760 : 584, toCopyFrom.getBufPtr(), 0, 16);
    }

    public ma_gainer volumeGainer() {
        return new ma_gainer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 588 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 776 : 600), false);
    }

    public void volumeGainer(ma_gainer toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 588 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 776 : 600), CHandler.IS_64_BIT ? 48 : 32, this);
    }

    public ma_gainer getVolumeGainer() {
        return new ma_gainer(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 588 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 776 : 600, CHandler.IS_64_BIT ? 48 : 32), true);
    }

    public void getVolumeGainer(ma_gainer toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 588 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 776 : 600, CHandler.IS_64_BIT ? 48 : 32);
    }

    public void setVolumeGainer(ma_gainer toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 588 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 776 : 600, toCopyFrom.getBufPtr(), 0, CHandler.IS_64_BIT ? 48 : 32);
    }

    public ma_atomic_float volume() {
        return new ma_atomic_float(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 620 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 824 : 632), false);
    }

    public void volume(ma_atomic_float toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 620 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 824 : 632), 4, this);
    }

    public ma_atomic_float getVolume() {
        return new ma_atomic_float(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 620 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 824 : 632, 4), true);
    }

    public void getVolume(ma_atomic_float toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 620 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 824 : 632, 4);
    }

    public void setVolume(ma_atomic_float toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 620 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 824 : 632, toCopyFrom.getBufPtr(), 0, 4);
    }

    public float pitch() {
        return getBufPtr().getFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 624 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 828 : 636);
    }

    public void pitch(float pitch) {
        getBufPtr().setFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 624 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 828 : 636, pitch);
    }

    public float oldPitch() {
        return getBufPtr().getFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 628 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 832 : 640);
    }

    public void oldPitch(float oldPitch) {
        getBufPtr().setFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 628 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 832 : 640, oldPitch);
    }

    public float oldDopplerPitch() {
        return getBufPtr().getFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 632 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 836 : 644);
    }

    public void oldDopplerPitch(float oldDopplerPitch) {
        getBufPtr().setFloat((CHandler.IS_COMPILED_ANDROID_X86) ? 632 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 836 : 644, oldDopplerPitch);
    }

    public long isPitchDisabled() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 636 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 840 : 648);
    }

    public void isPitchDisabled(long isPitchDisabled) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 636 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 840 : 648, isPitchDisabled);
    }

    public long isSpatializationDisabled() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 640 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 844 : 652);
    }

    public void isSpatializationDisabled(long isSpatializationDisabled) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 640 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 844 : 652, isSpatializationDisabled);
    }

    public long pinnedListenerIndex() {
        return getBufPtr().getUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 644 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 848 : 656);
    }

    public void pinnedListenerIndex(long pinnedListenerIndex) {
        getBufPtr().setUInt((CHandler.IS_COMPILED_ANDROID_X86) ? 644 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 848 : 656, pinnedListenerIndex);
    }

    public fadeSettings fadeSettings() {
        return new fadeSettings(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 648 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 856 : 664), false);
    }

    public void fadeSettings(fadeSettings toSetPtr) {
        toSetPtr.setPointer(getPointer() + ((CHandler.IS_COMPILED_ANDROID_X86) ? 648 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 856 : 664), 24, this);
    }

    public fadeSettings getFadeSettings() {
        return new fadeSettings(getBufPtr().duplicate((CHandler.IS_COMPILED_ANDROID_X86) ? 648 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 856 : 664, 24), true);
    }

    public void getFadeSettings(fadeSettings toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), (CHandler.IS_COMPILED_ANDROID_X86) ? 648 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 856 : 664, 24);
    }

    public void setFadeSettings(fadeSettings toCopyFrom) {
        getBufPtr().copyFrom((CHandler.IS_COMPILED_ANDROID_X86) ? 648 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 856 : 664, toCopyFrom.getBufPtr(), 0, 24);
    }

    public char _ownsHeap() {
        return getBufPtr().getUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 672 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 880 : 688);
    }

    public void _ownsHeap(char _ownsHeap) {
        getBufPtr().setUByte((CHandler.IS_COMPILED_ANDROID_X86) ? 672 : ((CHandler.IS_64_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_64_BIT && CHandler.IS_COMPILED_UNIX)) ? 880 : 688, _ownsHeap);
    }

    public VoidPointer _pHeap() {
        return new VoidPointer(getBufPtr().getNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 676 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 692 : 888), false);
    }

    public void _pHeap(VoidPointer _pHeap) {
        getBufPtr().setNativePointer((CHandler.IS_COMPILED_ANDROID_X86) ? 676 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 692 : 888, _pHeap.getPointer());
    }

    public static final class ma_engine_nodePointer extends StackElementPointer<ma_engine_node> {

        public ma_engine_nodePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_engine_nodePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_engine_nodePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_engine_nodePointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_engine_nodePointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_engine_nodePointer() {
            this(1, true);
        }

        public ma_engine_nodePointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_engine_node createStackElement(long ptr, boolean freeOnGC) {
            return new ma_engine_node(ptr, freeOnGC);
        }
    }

    public final static class fadeSettings extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(58).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public fadeSettings(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public fadeSettings(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public fadeSettings() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public fadeSettings.fadeSettingsPointer asPointer() {
            return new fadeSettings.fadeSettingsPointer(getPointer(), false, 1, this);
        }

        public void asPointer(fadeSettings.fadeSettingsPointer ptr) {
            ptr.setPointer(this);
        }

        public ma_atomic_float volumeBeg() {
            return new ma_atomic_float(getPointer(), false);
        }

        public void volumeBeg(ma_atomic_float toSetPtr) {
            toSetPtr.setPointer(getPointer(), 4, this);
        }

        public ma_atomic_float getVolumeBeg() {
            return new ma_atomic_float(getBufPtr().duplicate(0, 4), true);
        }

        public void getVolumeBeg(ma_atomic_float toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, 4);
        }

        public void setVolumeBeg(ma_atomic_float toCopyFrom) {
            getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, 4);
        }

        public ma_atomic_float volumeEnd() {
            return new ma_atomic_float(getPointer() + (4), false);
        }

        public void volumeEnd(ma_atomic_float toSetPtr) {
            toSetPtr.setPointer(getPointer() + (4), 4, this);
        }

        public ma_atomic_float getVolumeEnd() {
            return new ma_atomic_float(getBufPtr().duplicate(4, 4), true);
        }

        public void getVolumeEnd(ma_atomic_float toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 4, 4);
        }

        public void setVolumeEnd(ma_atomic_float toCopyFrom) {
            getBufPtr().copyFrom(4, toCopyFrom.getBufPtr(), 0, 4);
        }

        public ma_atomic_uint64 fadeLengthInFrames() {
            return new ma_atomic_uint64(getPointer() + (8), false);
        }

        public void fadeLengthInFrames(ma_atomic_uint64 toSetPtr) {
            toSetPtr.setPointer(getPointer() + (8), 8, this);
        }

        public ma_atomic_uint64 getFadeLengthInFrames() {
            return new ma_atomic_uint64(getBufPtr().duplicate(8, 8), true);
        }

        public void getFadeLengthInFrames(ma_atomic_uint64 toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 8, 8);
        }

        public void setFadeLengthInFrames(ma_atomic_uint64 toCopyFrom) {
            getBufPtr().copyFrom(8, toCopyFrom.getBufPtr(), 0, 8);
        }

        public ma_atomic_uint64 absoluteGlobalTimeInFrames() {
            return new ma_atomic_uint64(getPointer() + (16), false);
        }

        public void absoluteGlobalTimeInFrames(ma_atomic_uint64 toSetPtr) {
            toSetPtr.setPointer(getPointer() + (16), 8, this);
        }

        public ma_atomic_uint64 getAbsoluteGlobalTimeInFrames() {
            return new ma_atomic_uint64(getBufPtr().duplicate(16, 8), true);
        }

        public void getAbsoluteGlobalTimeInFrames(ma_atomic_uint64 toCopyTo) {
            toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 16, 8);
        }

        public void setAbsoluteGlobalTimeInFrames(ma_atomic_uint64 toCopyFrom) {
            getBufPtr().copyFrom(16, toCopyFrom.getBufPtr(), 0, 8);
        }

        public static final class fadeSettingsPointer extends StackElementPointer<fadeSettings> {

            public fadeSettingsPointer(VoidPointer pointer) {
                super(pointer);
            }

            public fadeSettingsPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public fadeSettingsPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public fadeSettingsPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public fadeSettingsPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public fadeSettingsPointer() {
                this(1, true);
            }

            public fadeSettingsPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected fadeSettings createStackElement(long ptr, boolean freeOnGC) {
                return new fadeSettings(ptr, freeOnGC);
            }
        }
    }
}
