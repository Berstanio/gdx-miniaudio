package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;

public final class ma_context extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(95).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_context(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_context(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_context() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_context.ma_contextPointer asPointer() {
        return new ma_context.ma_contextPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_context.ma_contextPointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_contextPointer extends StackElementPointer<ma_context> {

        public ma_contextPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_contextPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_contextPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_contextPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_contextPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_contextPointer() {
            this(1, true);
        }

        public ma_contextPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_context createStackElement(long ptr, boolean freeOnGC) {
            return new ma_context(ptr, freeOnGC);
        }
    }

    public final static class coreaudio extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(44).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public coreaudio(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public coreaudio(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public coreaudio() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public coreaudio.coreaudioPointer asPointer() {
            return new coreaudio.coreaudioPointer(getPointer(), false, 1, this);
        }

        public void asPointer(coreaudio.coreaudioPointer ptr) {
            ptr.setPointer(this);
        }

        public VoidPointer hCoreFoundation() {
            return new VoidPointer(getBufPtr().getNativePointer(0), false);
        }

        public void hCoreFoundation(VoidPointer hCoreFoundation) {
            getBufPtr().setNativePointer(0, hCoreFoundation.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> CFStringGetCString() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 8 : 4), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void CFStringGetCString(ClosureObject<GdxMiniaudio.ma_proc> CFStringGetCString) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 8 : 4, CFStringGetCString.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> CFRelease() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 16 : 8), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void CFRelease(ClosureObject<GdxMiniaudio.ma_proc> CFRelease) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 16 : 8, CFRelease.getPointer());
        }

        public VoidPointer hCoreAudio() {
            return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 24 : 12), false);
        }

        public void hCoreAudio(VoidPointer hCoreAudio) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 24 : 12, hCoreAudio.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioObjectGetPropertyData() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 32 : 16), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioObjectGetPropertyData(ClosureObject<GdxMiniaudio.ma_proc> AudioObjectGetPropertyData) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 32 : 16, AudioObjectGetPropertyData.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioObjectGetPropertyDataSize() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 40 : 20), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioObjectGetPropertyDataSize(ClosureObject<GdxMiniaudio.ma_proc> AudioObjectGetPropertyDataSize) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 40 : 20, AudioObjectGetPropertyDataSize.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioObjectSetPropertyData() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 48 : 24), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioObjectSetPropertyData(ClosureObject<GdxMiniaudio.ma_proc> AudioObjectSetPropertyData) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 48 : 24, AudioObjectSetPropertyData.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioObjectAddPropertyListener() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 56 : 28), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioObjectAddPropertyListener(ClosureObject<GdxMiniaudio.ma_proc> AudioObjectAddPropertyListener) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 56 : 28, AudioObjectAddPropertyListener.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioObjectRemovePropertyListener() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 64 : 32), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioObjectRemovePropertyListener(ClosureObject<GdxMiniaudio.ma_proc> AudioObjectRemovePropertyListener) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 64 : 32, AudioObjectRemovePropertyListener.getPointer());
        }

        public VoidPointer hAudioUnit() {
            return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 72 : 36), false);
        }

        public void hAudioUnit(VoidPointer hAudioUnit) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 72 : 36, hAudioUnit.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioComponentFindNext() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 80 : 40), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioComponentFindNext(ClosureObject<GdxMiniaudio.ma_proc> AudioComponentFindNext) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 80 : 40, AudioComponentFindNext.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioComponentInstanceDispose() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 88 : 44), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioComponentInstanceDispose(ClosureObject<GdxMiniaudio.ma_proc> AudioComponentInstanceDispose) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 88 : 44, AudioComponentInstanceDispose.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioComponentInstanceNew() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 96 : 48), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioComponentInstanceNew(ClosureObject<GdxMiniaudio.ma_proc> AudioComponentInstanceNew) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 96 : 48, AudioComponentInstanceNew.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioOutputUnitStart() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 104 : 52), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioOutputUnitStart(ClosureObject<GdxMiniaudio.ma_proc> AudioOutputUnitStart) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 104 : 52, AudioOutputUnitStart.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioOutputUnitStop() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 112 : 56), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioOutputUnitStop(ClosureObject<GdxMiniaudio.ma_proc> AudioOutputUnitStop) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 112 : 56, AudioOutputUnitStop.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitAddPropertyListener() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 120 : 60), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitAddPropertyListener(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitAddPropertyListener) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 120 : 60, AudioUnitAddPropertyListener.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitGetPropertyInfo() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 128 : 64), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitGetPropertyInfo(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitGetPropertyInfo) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 128 : 64, AudioUnitGetPropertyInfo.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitGetProperty() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 136 : 68), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitGetProperty(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitGetProperty) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 136 : 68, AudioUnitGetProperty.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitSetProperty() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 144 : 72), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitSetProperty(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitSetProperty) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 144 : 72, AudioUnitSetProperty.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitInitialize() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 152 : 76), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitInitialize(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitInitialize) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 152 : 76, AudioUnitInitialize.getPointer());
        }

        public ClosureObject<GdxMiniaudio.ma_proc> AudioUnitRender() {
            return CHandler.getClosureObject(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 160 : 80), GdxMiniaudio_Internal.ma_proc_Internal::ma_proc_downcall);
        }

        public void AudioUnitRender(ClosureObject<GdxMiniaudio.ma_proc> AudioUnitRender) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 160 : 80, AudioUnitRender.getPointer());
        }

        public VoidPointer component() {
            return new VoidPointer(getBufPtr().getNativePointer(CHandler.IS_64_BIT ? 168 : 84), false);
        }

        public void component(VoidPointer component) {
            getBufPtr().setNativePointer(CHandler.IS_64_BIT ? 168 : 84, component.getPointer());
        }

        public long noAudioSessionDeactivate() {
            return getBufPtr().getUInt(CHandler.IS_64_BIT ? 176 : 88);
        }

        public void noAudioSessionDeactivate(long noAudioSessionDeactivate) {
            getBufPtr().setUInt(CHandler.IS_64_BIT ? 176 : 88, noAudioSessionDeactivate);
        }

        public static final class coreaudioPointer extends StackElementPointer<coreaudio> {

            public coreaudioPointer(VoidPointer pointer) {
                super(pointer);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public coreaudioPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public coreaudioPointer() {
                this(1, true);
            }

            public coreaudioPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected coreaudio createStackElement(long ptr, boolean freeOnGC) {
                return new coreaudio(ptr, freeOnGC);
            }
        }
    }

    public final static class null_backend extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(226).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public null_backend(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public null_backend(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public null_backend() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public null_backend.null_backendPointer asPointer() {
            return new null_backend.null_backendPointer(getPointer(), false, 1, this);
        }

        public void asPointer(null_backend.null_backendPointer ptr) {
            ptr.setPointer(this);
        }

        public int _unused() {
            return getBufPtr().getInt(0);
        }

        public void _unused(int _unused) {
            getBufPtr().setInt(0, _unused);
        }

        public static final class null_backendPointer extends StackElementPointer<null_backend> {

            public null_backendPointer(VoidPointer pointer) {
                super(pointer);
            }

            public null_backendPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public null_backendPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public null_backendPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public null_backendPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public null_backendPointer() {
                this(1, true);
            }

            public null_backendPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected null_backend createStackElement(long ptr, boolean freeOnGC) {
                return new null_backend(ptr, freeOnGC);
            }
        }
    }

    public final static class posix extends Struct {

        private final static int __size;

        private final static long __ffi_type;

        static {
            __ffi_type = FFITypes.getCTypeInfo(234).getFfiType();
            __size = CHandler.getSizeFromFFIType(__ffi_type);
        }

        public posix(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public posix(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public posix() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public long getFFIType() {
            return __ffi_type;
        }

        public posix.posixPointer asPointer() {
            return new posix.posixPointer(getPointer(), false, 1, this);
        }

        public void asPointer(posix.posixPointer ptr) {
            ptr.setPointer(this);
        }

        public int _unused() {
            return getBufPtr().getInt(0);
        }

        public void _unused(int _unused) {
            getBufPtr().setInt(0, _unused);
        }

        public static final class posixPointer extends StackElementPointer<posix> {

            public posixPointer(VoidPointer pointer) {
                super(pointer);
            }

            public posixPointer(long pointer, boolean freeOnGC) {
                super(pointer, freeOnGC);
            }

            public posixPointer(long pointer, boolean freeOnGC, int capacity) {
                super(pointer, freeOnGC, capacity * __size);
            }

            public posixPointer(long pointer, boolean freeOnGC, Pointing parent) {
                super(pointer, freeOnGC);
                setParent(parent);
            }

            public posixPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
                super(pointer, freeOnGC, capacity * __size);
                setParent(parent);
            }

            public posixPointer() {
                this(1, true);
            }

            public posixPointer(int count, boolean freeOnGC) {
                super(__size, count, freeOnGC);
            }

            public int getSize() {
                return __size;
            }

            protected posix createStackElement(long ptr, boolean freeOnGC) {
                return new posix(ptr, freeOnGC);
            }
        }
    }
}
