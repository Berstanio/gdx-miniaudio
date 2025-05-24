package games.rednblack.miniaudio.internal;

import com.badlogic.gdx.jnigen.runtime.c.CXXException;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.BytePointer;
import games.rednblack.miniaudio.internal.structs.ma_log_callback;
import com.badlogic.gdx.jnigen.runtime.closure.ClosureObject;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import games.rednblack.miniaudio.internal.GdxMiniaudio;
import games.rednblack.miniaudio.internal.GdxMiniaudio_Internal;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.enums.ma_result;
import games.rednblack.miniaudio.internal.structs.ma_allocation_callbacks;
import games.rednblack.miniaudio.internal.structs.ma_log;
import games.rednblack.miniaudio.internal.structs.ma_biquad_config;
import games.rednblack.miniaudio.internal.enums.ma_format;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.ULongPointer;
import games.rednblack.miniaudio.internal.structs.ma_biquad;
import games.rednblack.miniaudio.internal.structs.ma_lpf1_config;
import games.rednblack.miniaudio.internal.structs.ma_lpf1;
import games.rednblack.miniaudio.internal.structs.ma_lpf2;
import games.rednblack.miniaudio.internal.structs.ma_lpf_config;
import games.rednblack.miniaudio.internal.structs.ma_lpf;
import games.rednblack.miniaudio.internal.structs.ma_hpf1_config;
import games.rednblack.miniaudio.internal.structs.ma_hpf1;
import games.rednblack.miniaudio.internal.structs.ma_hpf2;
import games.rednblack.miniaudio.internal.structs.ma_hpf_config;
import games.rednblack.miniaudio.internal.structs.ma_hpf;
import games.rednblack.miniaudio.internal.structs.ma_bpf2_config;
import games.rednblack.miniaudio.internal.structs.ma_bpf2;
import games.rednblack.miniaudio.internal.structs.ma_bpf_config;
import games.rednblack.miniaudio.internal.structs.ma_bpf;
import games.rednblack.miniaudio.internal.structs.ma_notch2_config;
import games.rednblack.miniaudio.internal.structs.ma_notch2;
import games.rednblack.miniaudio.internal.structs.ma_peak2_config;
import games.rednblack.miniaudio.internal.structs.ma_peak2;
import games.rednblack.miniaudio.internal.structs.ma_loshelf2_config;
import games.rednblack.miniaudio.internal.structs.ma_loshelf2;
import games.rednblack.miniaudio.internal.structs.ma_hishelf2_config;
import games.rednblack.miniaudio.internal.structs.ma_hishelf2;
import games.rednblack.miniaudio.internal.structs.ma_delay_config;
import games.rednblack.miniaudio.internal.structs.ma_delay;
import games.rednblack.miniaudio.internal.structs.ma_gainer_config;
import games.rednblack.miniaudio.internal.structs.ma_gainer;
import com.badlogic.gdx.jnigen.runtime.pointer.FloatPointer;
import games.rednblack.miniaudio.internal.structs.ma_panner_config;
import games.rednblack.miniaudio.internal.structs.ma_panner;
import games.rednblack.miniaudio.internal.enums.ma_pan_mode;
import games.rednblack.miniaudio.internal.structs.ma_fader_config;
import games.rednblack.miniaudio.internal.structs.ma_fader;
import games.rednblack.miniaudio.internal.structs.ma_spatializer_listener_config;
import games.rednblack.miniaudio.internal.structs.ma_spatializer_listener;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UBytePointer;
import games.rednblack.miniaudio.internal.structs.ma_vec3f;
import games.rednblack.miniaudio.internal.structs.ma_spatializer_config;
import games.rednblack.miniaudio.internal.structs.ma_spatializer;
import games.rednblack.miniaudio.internal.enums.ma_attenuation_model;
import games.rednblack.miniaudio.internal.enums.ma_positioning;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler_config;
import games.rednblack.miniaudio.internal.structs.ma_linear_resampler;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.UInt64Pointer;
import games.rednblack.miniaudio.internal.structs.ma_resampler_config;
import games.rednblack.miniaudio.internal.enums.ma_resample_algorithm;
import games.rednblack.miniaudio.internal.structs.ma_resampler;
import games.rednblack.miniaudio.internal.structs.ma_channel_converter_config;
import games.rednblack.miniaudio.internal.enums.ma_channel_mix_mode;
import games.rednblack.miniaudio.internal.structs.ma_channel_converter;
import games.rednblack.miniaudio.internal.structs.ma_data_converter_config;
import games.rednblack.miniaudio.internal.structs.ma_data_converter;
import games.rednblack.miniaudio.internal.enums.ma_dither_mode;
import com.badlogic.gdx.jnigen.runtime.pointer.PointerPointer;
import games.rednblack.miniaudio.internal.enums.ma_standard_channel_map;
import games.rednblack.miniaudio.internal.structs.ma_data_source_config;
import games.rednblack.miniaudio.internal.structs.ma_audio_buffer_ref;
import games.rednblack.miniaudio.internal.structs.ma_audio_buffer_config;
import games.rednblack.miniaudio.internal.structs.ma_audio_buffer;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_data;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_page;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer_config;
import games.rednblack.miniaudio.internal.structs.ma_paged_audio_buffer;
import games.rednblack.miniaudio.internal.structs.ma_rb;
import games.rednblack.miniaudio.internal.structs.ma_pcm_rb;
import games.rednblack.miniaudio.internal.structs.ma_duplex_rb;
import games.rednblack.miniaudio.internal.structs.ma_event;
import games.rednblack.miniaudio.internal.structs.ma_semaphore;
import games.rednblack.miniaudio.internal.structs.ma_fence;
import games.rednblack.miniaudio.internal.structs.ma_async_notification_poll;
import games.rednblack.miniaudio.internal.structs.ma_async_notification_event;
import games.rednblack.miniaudio.internal.structs.ma_slot_allocator_config;
import games.rednblack.miniaudio.internal.structs.ma_slot_allocator;
import games.rednblack.miniaudio.internal.structs.ma_job;
import games.rednblack.miniaudio.internal.structs.ma_job_queue_config;
import games.rednblack.miniaudio.internal.structs.ma_job_queue;
import games.rednblack.miniaudio.internal.structs.ma_device_job_thread_config;
import games.rednblack.miniaudio.internal.structs.ma_device_job_thread;
import games.rednblack.miniaudio.internal.structs.ma_device_id;
import games.rednblack.miniaudio.internal.structs.ma_context_config;
import games.rednblack.miniaudio.internal.enums.ma_backend;
import games.rednblack.miniaudio.internal.structs.ma_context;
import games.rednblack.miniaudio.internal.structs.ma_device_info;
import games.rednblack.miniaudio.internal.enums.ma_device_type;
import games.rednblack.miniaudio.internal.structs.ma_device_config;
import games.rednblack.miniaudio.internal.structs.ma_device;
import games.rednblack.miniaudio.internal.enums.ma_device_state;
import games.rednblack.miniaudio.internal.structs.ma_device_descriptor;
import games.rednblack.miniaudio.internal.enums.ma_performance_profile;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SShortPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SIntPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.integer.SInt64Pointer;
import games.rednblack.miniaudio.internal.enums.ma_seek_origin;
import games.rednblack.miniaudio.internal.structs.ma_file_info;
import games.rednblack.miniaudio.internal.structs.ma_default_vfs;
import games.rednblack.miniaudio.internal.structs.ma_decoding_backend_config;
import games.rednblack.miniaudio.internal.structs.ma_decoder_config;
import games.rednblack.miniaudio.internal.structs.ma_decoder;
import games.rednblack.miniaudio.internal.structs.ma_encoder_config;
import games.rednblack.miniaudio.internal.enums.ma_encoding_format;
import games.rednblack.miniaudio.internal.structs.ma_encoder;
import games.rednblack.miniaudio.internal.structs.ma_waveform_config;
import games.rednblack.miniaudio.internal.enums.ma_waveform_type;
import games.rednblack.miniaudio.internal.structs.ma_waveform;
import games.rednblack.miniaudio.internal.structs.ma_pulsewave_config;
import games.rednblack.miniaudio.internal.structs.ma_pulsewave;
import games.rednblack.miniaudio.internal.structs.ma_noise_config;
import games.rednblack.miniaudio.internal.enums.ma_noise_type;
import games.rednblack.miniaudio.internal.structs.ma_noise;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_pipeline_notifications;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_source_config;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_config;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_buffer;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_stream;
import games.rednblack.miniaudio.internal.structs.ma_resource_manager_data_source;
import games.rednblack.miniaudio.internal.structs.ma_node_config;
import games.rednblack.miniaudio.internal.structs.ma_node_graph;
import games.rednblack.miniaudio.internal.enums.ma_node_state;
import games.rednblack.miniaudio.internal.structs.ma_node_graph_config;
import games.rednblack.miniaudio.internal.structs.ma_data_source_node_config;
import games.rednblack.miniaudio.internal.structs.ma_data_source_node;
import games.rednblack.miniaudio.internal.structs.ma_splitter_node_config;
import games.rednblack.miniaudio.internal.structs.ma_splitter_node;
import games.rednblack.miniaudio.internal.structs.ma_biquad_node_config;
import games.rednblack.miniaudio.internal.structs.ma_biquad_node;
import games.rednblack.miniaudio.internal.structs.ma_lpf_node_config;
import games.rednblack.miniaudio.internal.structs.ma_lpf_node;
import games.rednblack.miniaudio.internal.structs.ma_hpf_node_config;
import games.rednblack.miniaudio.internal.structs.ma_hpf_node;
import games.rednblack.miniaudio.internal.structs.ma_bpf_node_config;
import games.rednblack.miniaudio.internal.structs.ma_bpf_node;
import games.rednblack.miniaudio.internal.structs.ma_notch_node_config;
import games.rednblack.miniaudio.internal.structs.ma_notch_node;
import games.rednblack.miniaudio.internal.structs.ma_peak_node_config;
import games.rednblack.miniaudio.internal.structs.ma_peak_node;
import games.rednblack.miniaudio.internal.structs.ma_loshelf_node_config;
import games.rednblack.miniaudio.internal.structs.ma_loshelf_node;
import games.rednblack.miniaudio.internal.structs.ma_hishelf_node_config;
import games.rednblack.miniaudio.internal.structs.ma_hishelf_node;
import games.rednblack.miniaudio.internal.structs.ma_delay_node_config;
import games.rednblack.miniaudio.internal.structs.ma_delay_node;
import games.rednblack.miniaudio.internal.structs.ma_engine_node_config;
import games.rednblack.miniaudio.internal.structs.ma_engine;
import games.rednblack.miniaudio.internal.enums.ma_engine_node_type;
import games.rednblack.miniaudio.internal.structs.ma_engine_node;
import games.rednblack.miniaudio.internal.structs.ma_sound_config;
import games.rednblack.miniaudio.internal.structs.ma_engine_config;
import games.rednblack.miniaudio.internal.structs.ma_sound;
import com.badlogic.gdx.jnigen.runtime.closure.Closure;
import games.rednblack.miniaudio.internal.structs.ma_device_notification;

public final class GdxMiniaudio {

    static {
        CHandler.init();
        FFITypes.init();
        init(IllegalArgumentException.class, CXXException.class);
    }

    public static void initialize() {
    }

    /*JNI
#include <jnigen.h>
#include <gdx-miniaudio.h>

static jclass illegalArgumentExceptionClass = NULL;
static jclass cxxExceptionClass = NULL;
*/
    private static native void init(Class<?> illegalArgumentException, Class<?> cxxException);/*
    	illegalArgumentExceptionClass = (jclass)env->NewGlobalRef(illegalArgumentException);
    	cxxExceptionClass = (jclass)env->NewGlobalRef(cxxException);
    */

    public static void ma_version(UIntPointer pMajor, UIntPointer pMinor, UIntPointer pRevision) {
        ma_version_internal(pMajor.getPointer(), pMinor.getPointer(), pRevision.getPointer());
    }

    public static native void ma_version_internal(long pMajor, long pMinor, long pRevision);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_version((ma_uint32 *)pMajor, (ma_uint32 *)pMinor, (ma_uint32 *)pRevision);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static BytePointer ma_version_string() {
        return new BytePointer(ma_version_string_internal(), false);
    }

    public static void ma_version_string(BytePointer _retPar) {
        _retPar.setPointer(ma_version_string_internal());
    }

    public static native long ma_version_string_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_version_string();
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_log_callback ma_log_callback_init(ClosureObject<GdxMiniaudio.ma_log_callback_proc> onLog, VoidPointer pUserData) {
        return new ma_log_callback(ma_log_callback_init_internal(onLog.getPointer(), pUserData.getPointer(), 0), true);
    }

    public static void ma_log_callback_init(ClosureObject<GdxMiniaudio.ma_log_callback_proc> onLog, VoidPointer pUserData, ma_log_callback _retPar) {
        ma_log_callback_init_internal(onLog.getPointer(), pUserData.getPointer(), _retPar.getPointer());
    }

    public static native long ma_log_callback_init_internal(long onLog, long pUserData, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_log_callback* _ret = (ma_log_callback*) (_retPar == 0 ? malloc(sizeof(ma_log_callback)) : (void*)_retPar);
    	*_ret = ma_log_callback_init((ma_log_callback_proc)onLog, (void *)pUserData);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_log_init(ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_log.ma_logPointer pLog) {
        return ma_result.getByIndex((int) ma_log_init_internal(pAllocationCallbacks.getPointer(), pLog.getPointer()));
    }

    public static native int ma_log_init_internal(long pAllocationCallbacks, long pLog);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_log_init((const ma_allocation_callbacks *)pAllocationCallbacks, (ma_log *)pLog);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_log_uninit(ma_log.ma_logPointer pLog) {
        ma_log_uninit_internal(pLog.getPointer());
    }

    public static native void ma_log_uninit_internal(long pLog);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_log_uninit((ma_log *)pLog);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_log_register_callback(ma_log.ma_logPointer pLog, ma_log_callback callback) {
        return ma_result.getByIndex((int) ma_log_register_callback_internal(pLog.getPointer(), callback.getPointer()));
    }

    public static native int ma_log_register_callback_internal(long pLog, long callback);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_log_register_callback((ma_log *)pLog, *(ma_log_callback*)callback);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_log_unregister_callback(ma_log.ma_logPointer pLog, ma_log_callback callback) {
        return ma_result.getByIndex((int) ma_log_unregister_callback_internal(pLog.getPointer(), callback.getPointer()));
    }

    public static native int ma_log_unregister_callback_internal(long pLog, long callback);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_log_unregister_callback((ma_log *)pLog, *(ma_log_callback*)callback);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_log_post(ma_log.ma_logPointer pLog, long level, BytePointer pMessage) {
        return ma_result.getByIndex((int) ma_log_post_internal(pLog.getPointer(), level, pMessage.getPointer()));
    }

    public static native int ma_log_post_internal(long pLog, long level, long pMessage);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, level, 1, return 0);
    	return (jint)ma_log_post((ma_log *)pLog, (ma_uint32)level, (const char *)pMessage);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_biquad_config ma_biquad_config_init(ma_format format, long channels, double b0, double b1, double b2, double a0, double a1, double a2) {
        return new ma_biquad_config(ma_biquad_config_init_internal(format.getIndex(), channels, b0, b1, b2, a0, a1, a2, 0), true);
    }

    public static void ma_biquad_config_init(ma_format format, long channels, double b0, double b1, double b2, double a0, double a1, double a2, ma_biquad_config _retPar) {
        ma_biquad_config_init_internal(format.getIndex(), channels, b0, b1, b2, a0, a1, a2, _retPar.getPointer());
    }

    public static native long ma_biquad_config_init_internal(int format, long channels, double b0, double b1, double b2, double a0, double a1, double a2, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_biquad_config* _ret = (ma_biquad_config*) (_retPar == 0 ? malloc(sizeof(ma_biquad_config)) : (void*)_retPar);
    	*_ret = ma_biquad_config_init((ma_format)format, (ma_uint32)channels, (double)b0, (double)b1, (double)b2, (double)a0, (double)a1, (double)a2);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_get_heap_size(ma_biquad_config.ma_biquad_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_biquad_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_biquad_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_get_heap_size((const ma_biquad_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_init_preallocated(ma_biquad_config.ma_biquad_configPointer pConfig, VoidPointer pHeap, ma_biquad.ma_biquadPointer pBQ) {
        return ma_result.getByIndex((int) ma_biquad_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pBQ.getPointer()));
    }

    public static native int ma_biquad_init_preallocated_internal(long pConfig, long pHeap, long pBQ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_init_preallocated((const ma_biquad_config *)pConfig, (void *)pHeap, (ma_biquad *)pBQ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_init(ma_biquad_config.ma_biquad_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_biquad.ma_biquadPointer pBQ) {
        return ma_result.getByIndex((int) ma_biquad_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pBQ.getPointer()));
    }

    public static native int ma_biquad_init_internal(long pConfig, long pAllocationCallbacks, long pBQ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_init((const ma_biquad_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_biquad *)pBQ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_biquad_uninit(ma_biquad.ma_biquadPointer pBQ, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_biquad_uninit_internal(pBQ.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_biquad_uninit_internal(long pBQ, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_biquad_uninit((ma_biquad *)pBQ, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_biquad_reinit(ma_biquad_config.ma_biquad_configPointer pConfig, ma_biquad.ma_biquadPointer pBQ) {
        return ma_result.getByIndex((int) ma_biquad_reinit_internal(pConfig.getPointer(), pBQ.getPointer()));
    }

    public static native int ma_biquad_reinit_internal(long pConfig, long pBQ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_reinit((const ma_biquad_config *)pConfig, (ma_biquad *)pBQ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_clear_cache(ma_biquad.ma_biquadPointer pBQ) {
        return ma_result.getByIndex((int) ma_biquad_clear_cache_internal(pBQ.getPointer()));
    }

    public static native int ma_biquad_clear_cache_internal(long pBQ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_clear_cache((ma_biquad *)pBQ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_process_pcm_frames(ma_biquad.ma_biquadPointer pBQ, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_biquad_process_pcm_frames_internal(pBQ.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_biquad_process_pcm_frames_internal(long pBQ, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_biquad_process_pcm_frames((ma_biquad *)pBQ, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_biquad_get_latency(ma_biquad.ma_biquadPointer pBQ) {
        return ma_biquad_get_latency_internal(pBQ.getPointer());
    }

    public static native long ma_biquad_get_latency_internal(long pBQ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_biquad_get_latency((const ma_biquad *)pBQ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_lpf1_config ma_lpf1_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency) {
        return new ma_lpf1_config(ma_lpf1_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, 0), true);
    }

    public static void ma_lpf1_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, ma_lpf1_config _retPar) {
        ma_lpf1_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, _retPar.getPointer());
    }

    public static native long ma_lpf1_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_lpf1_config* _ret = (ma_lpf1_config*) (_retPar == 0 ? malloc(sizeof(ma_lpf1_config)) : (void*)_retPar);
    	*_ret = ma_lpf1_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_lpf1_config ma_lpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q) {
        return new ma_lpf1_config(ma_lpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, 0), true);
    }

    public static void ma_lpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q, ma_lpf1_config _retPar) {
        ma_lpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, _retPar.getPointer());
    }

    public static native long ma_lpf2_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, double q, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_lpf2_config* _ret = (ma_lpf2_config*) (_retPar == 0 ? malloc(sizeof(ma_lpf2_config)) : (void*)_retPar);
    	*_ret = ma_lpf2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (double)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf1_get_heap_size(ma_lpf1_config.ma_lpf1_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_lpf1_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_lpf1_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf1_get_heap_size((const ma_lpf1_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf1_init_preallocated(ma_lpf1_config.ma_lpf1_configPointer pConfig, VoidPointer pHeap, ma_lpf1.ma_lpf1Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf1_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf1_init_preallocated_internal(long pConfig, long pHeap, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf1_init_preallocated((const ma_lpf1_config *)pConfig, (void *)pHeap, (ma_lpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf1_init(ma_lpf1_config.ma_lpf1_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_lpf1.ma_lpf1Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf1_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf1_init_internal(long pConfig, long pAllocationCallbacks, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf1_init((const ma_lpf1_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_lpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_lpf1_uninit(ma_lpf1.ma_lpf1Pointer pLPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_lpf1_uninit_internal(pLPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_lpf1_uninit_internal(long pLPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_lpf1_uninit((ma_lpf1 *)pLPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_lpf1_reinit(ma_lpf1_config.ma_lpf1_configPointer pConfig, ma_lpf1.ma_lpf1Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf1_reinit_internal(pConfig.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf1_reinit_internal(long pConfig, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf1_reinit((const ma_lpf1_config *)pConfig, (ma_lpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf1_clear_cache(ma_lpf1.ma_lpf1Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf1_clear_cache_internal(pLPF.getPointer()));
    }

    public static native int ma_lpf1_clear_cache_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf1_clear_cache((ma_lpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf1_process_pcm_frames(ma_lpf1.ma_lpf1Pointer pLPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_lpf1_process_pcm_frames_internal(pLPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_lpf1_process_pcm_frames_internal(long pLPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_lpf1_process_pcm_frames((ma_lpf1 *)pLPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_lpf1_get_latency(ma_lpf1.ma_lpf1Pointer pLPF) {
        return ma_lpf1_get_latency_internal(pLPF.getPointer());
    }

    public static native long ma_lpf1_get_latency_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_lpf1_get_latency((const ma_lpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf2_get_heap_size(ma_lpf1_config.ma_lpf1_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_lpf2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_lpf2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf2_get_heap_size((const ma_lpf2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf2_init_preallocated(ma_lpf1_config.ma_lpf1_configPointer pConfig, VoidPointer pHeap, ma_lpf2.ma_lpf2Pointer pHPF) {
        return ma_result.getByIndex((int) ma_lpf2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_lpf2_init_preallocated_internal(long pConfig, long pHeap, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf2_init_preallocated((const ma_lpf2_config *)pConfig, (void *)pHeap, (ma_lpf2 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf2_init(ma_lpf1_config.ma_lpf1_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_lpf2.ma_lpf2Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf2_init_internal(long pConfig, long pAllocationCallbacks, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf2_init((const ma_lpf2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_lpf2 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_lpf2_uninit(ma_lpf2.ma_lpf2Pointer pLPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_lpf2_uninit_internal(pLPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_lpf2_uninit_internal(long pLPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_lpf2_uninit((ma_lpf2 *)pLPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_lpf2_reinit(ma_lpf1_config.ma_lpf1_configPointer pConfig, ma_lpf2.ma_lpf2Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf2_reinit_internal(pConfig.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf2_reinit_internal(long pConfig, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf2_reinit((const ma_lpf2_config *)pConfig, (ma_lpf2 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf2_clear_cache(ma_lpf2.ma_lpf2Pointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf2_clear_cache_internal(pLPF.getPointer()));
    }

    public static native int ma_lpf2_clear_cache_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf2_clear_cache((ma_lpf2 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf2_process_pcm_frames(ma_lpf2.ma_lpf2Pointer pLPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_lpf2_process_pcm_frames_internal(pLPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_lpf2_process_pcm_frames_internal(long pLPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_lpf2_process_pcm_frames((ma_lpf2 *)pLPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_lpf2_get_latency(ma_lpf2.ma_lpf2Pointer pLPF) {
        return ma_lpf2_get_latency_internal(pLPF.getPointer());
    }

    public static native long ma_lpf2_get_latency_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_lpf2_get_latency((const ma_lpf2 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_lpf_config ma_lpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_lpf_config(ma_lpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_lpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order, ma_lpf_config _retPar) {
        ma_lpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_lpf_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_lpf_config* _ret = (ma_lpf_config*) (_retPar == 0 ? malloc(sizeof(ma_lpf_config)) : (void*)_retPar);
    	*_ret = ma_lpf_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_get_heap_size(ma_lpf_config.ma_lpf_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_lpf_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_lpf_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_get_heap_size((const ma_lpf_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_init_preallocated(ma_lpf_config.ma_lpf_configPointer pConfig, VoidPointer pHeap, ma_lpf.ma_lpfPointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf_init_preallocated_internal(long pConfig, long pHeap, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_init_preallocated((const ma_lpf_config *)pConfig, (void *)pHeap, (ma_lpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_init(ma_lpf_config.ma_lpf_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_lpf.ma_lpfPointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf_init_internal(long pConfig, long pAllocationCallbacks, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_init((const ma_lpf_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_lpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_lpf_uninit(ma_lpf.ma_lpfPointer pLPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_lpf_uninit_internal(pLPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_lpf_uninit_internal(long pLPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_lpf_uninit((ma_lpf *)pLPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_lpf_reinit(ma_lpf_config.ma_lpf_configPointer pConfig, ma_lpf.ma_lpfPointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf_reinit_internal(pConfig.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_lpf_reinit_internal(long pConfig, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_reinit((const ma_lpf_config *)pConfig, (ma_lpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_clear_cache(ma_lpf.ma_lpfPointer pLPF) {
        return ma_result.getByIndex((int) ma_lpf_clear_cache_internal(pLPF.getPointer()));
    }

    public static native int ma_lpf_clear_cache_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_clear_cache((ma_lpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_process_pcm_frames(ma_lpf.ma_lpfPointer pLPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_lpf_process_pcm_frames_internal(pLPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_lpf_process_pcm_frames_internal(long pLPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_lpf_process_pcm_frames((ma_lpf *)pLPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_lpf_get_latency(ma_lpf.ma_lpfPointer pLPF) {
        return ma_lpf_get_latency_internal(pLPF.getPointer());
    }

    public static native long ma_lpf_get_latency_internal(long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_lpf_get_latency((const ma_lpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_hpf1_config ma_hpf1_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency) {
        return new ma_hpf1_config(ma_hpf1_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, 0), true);
    }

    public static void ma_hpf1_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, ma_hpf1_config _retPar) {
        ma_hpf1_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, _retPar.getPointer());
    }

    public static native long ma_hpf1_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_hpf1_config* _ret = (ma_hpf1_config*) (_retPar == 0 ? malloc(sizeof(ma_hpf1_config)) : (void*)_retPar);
    	*_ret = ma_hpf1_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_hpf1_config ma_hpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q) {
        return new ma_hpf1_config(ma_hpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, 0), true);
    }

    public static void ma_hpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q, ma_hpf1_config _retPar) {
        ma_hpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, _retPar.getPointer());
    }

    public static native long ma_hpf2_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, double q, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_hpf2_config* _ret = (ma_hpf2_config*) (_retPar == 0 ? malloc(sizeof(ma_hpf2_config)) : (void*)_retPar);
    	*_ret = ma_hpf2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (double)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf1_get_heap_size(ma_hpf1_config.ma_hpf1_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_hpf1_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_hpf1_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf1_get_heap_size((const ma_hpf1_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf1_init_preallocated(ma_hpf1_config.ma_hpf1_configPointer pConfig, VoidPointer pHeap, ma_hpf1.ma_hpf1Pointer pLPF) {
        return ma_result.getByIndex((int) ma_hpf1_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_hpf1_init_preallocated_internal(long pConfig, long pHeap, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf1_init_preallocated((const ma_hpf1_config *)pConfig, (void *)pHeap, (ma_hpf1 *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf1_init(ma_hpf1_config.ma_hpf1_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hpf1.ma_hpf1Pointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf1_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf1_init_internal(long pConfig, long pAllocationCallbacks, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf1_init((const ma_hpf1_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hpf1 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hpf1_uninit(ma_hpf1.ma_hpf1Pointer pHPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hpf1_uninit_internal(pHPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hpf1_uninit_internal(long pHPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hpf1_uninit((ma_hpf1 *)pHPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_hpf1_reinit(ma_hpf1_config.ma_hpf1_configPointer pConfig, ma_hpf1.ma_hpf1Pointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf1_reinit_internal(pConfig.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf1_reinit_internal(long pConfig, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf1_reinit((const ma_hpf1_config *)pConfig, (ma_hpf1 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf1_process_pcm_frames(ma_hpf1.ma_hpf1Pointer pHPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_hpf1_process_pcm_frames_internal(pHPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_hpf1_process_pcm_frames_internal(long pHPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_hpf1_process_pcm_frames((ma_hpf1 *)pHPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_hpf1_get_latency(ma_hpf1.ma_hpf1Pointer pHPF) {
        return ma_hpf1_get_latency_internal(pHPF.getPointer());
    }

    public static native long ma_hpf1_get_latency_internal(long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_hpf1_get_latency((const ma_hpf1 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf2_get_heap_size(ma_hpf1_config.ma_hpf1_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_hpf2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_hpf2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf2_get_heap_size((const ma_hpf2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf2_init_preallocated(ma_hpf1_config.ma_hpf1_configPointer pConfig, VoidPointer pHeap, ma_hpf2.ma_hpf2Pointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf2_init_preallocated_internal(long pConfig, long pHeap, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf2_init_preallocated((const ma_hpf2_config *)pConfig, (void *)pHeap, (ma_hpf2 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf2_init(ma_hpf1_config.ma_hpf1_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hpf2.ma_hpf2Pointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf2_init_internal(long pConfig, long pAllocationCallbacks, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf2_init((const ma_hpf2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hpf2 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hpf2_uninit(ma_hpf2.ma_hpf2Pointer pHPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hpf2_uninit_internal(pHPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hpf2_uninit_internal(long pHPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hpf2_uninit((ma_hpf2 *)pHPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_hpf2_reinit(ma_hpf1_config.ma_hpf1_configPointer pConfig, ma_hpf2.ma_hpf2Pointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf2_reinit_internal(pConfig.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf2_reinit_internal(long pConfig, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf2_reinit((const ma_hpf2_config *)pConfig, (ma_hpf2 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf2_process_pcm_frames(ma_hpf2.ma_hpf2Pointer pHPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_hpf2_process_pcm_frames_internal(pHPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_hpf2_process_pcm_frames_internal(long pHPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_hpf2_process_pcm_frames((ma_hpf2 *)pHPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_hpf2_get_latency(ma_hpf2.ma_hpf2Pointer pHPF) {
        return ma_hpf2_get_latency_internal(pHPF.getPointer());
    }

    public static native long ma_hpf2_get_latency_internal(long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_hpf2_get_latency((const ma_hpf2 *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_hpf_config ma_hpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_hpf_config(ma_hpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_hpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order, ma_hpf_config _retPar) {
        ma_hpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_hpf_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_hpf_config* _ret = (ma_hpf_config*) (_retPar == 0 ? malloc(sizeof(ma_hpf_config)) : (void*)_retPar);
    	*_ret = ma_hpf_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_get_heap_size(ma_hpf_config.ma_hpf_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_hpf_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_hpf_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_get_heap_size((const ma_hpf_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_init_preallocated(ma_hpf_config.ma_hpf_configPointer pConfig, VoidPointer pHeap, ma_hpf.ma_hpfPointer pLPF) {
        return ma_result.getByIndex((int) ma_hpf_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pLPF.getPointer()));
    }

    public static native int ma_hpf_init_preallocated_internal(long pConfig, long pHeap, long pLPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_init_preallocated((const ma_hpf_config *)pConfig, (void *)pHeap, (ma_hpf *)pLPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_init(ma_hpf_config.ma_hpf_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hpf.ma_hpfPointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf_init_internal(long pConfig, long pAllocationCallbacks, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_init((const ma_hpf_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hpf *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hpf_uninit(ma_hpf.ma_hpfPointer pHPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hpf_uninit_internal(pHPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hpf_uninit_internal(long pHPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hpf_uninit((ma_hpf *)pHPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_hpf_reinit(ma_hpf_config.ma_hpf_configPointer pConfig, ma_hpf.ma_hpfPointer pHPF) {
        return ma_result.getByIndex((int) ma_hpf_reinit_internal(pConfig.getPointer(), pHPF.getPointer()));
    }

    public static native int ma_hpf_reinit_internal(long pConfig, long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_reinit((const ma_hpf_config *)pConfig, (ma_hpf *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_process_pcm_frames(ma_hpf.ma_hpfPointer pHPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_hpf_process_pcm_frames_internal(pHPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_hpf_process_pcm_frames_internal(long pHPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_hpf_process_pcm_frames((ma_hpf *)pHPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_hpf_get_latency(ma_hpf.ma_hpfPointer pHPF) {
        return ma_hpf_get_latency_internal(pHPF.getPointer());
    }

    public static native long ma_hpf_get_latency_internal(long pHPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_hpf_get_latency((const ma_hpf *)pHPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_bpf2_config ma_bpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q) {
        return new ma_bpf2_config(ma_bpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, 0), true);
    }

    public static void ma_bpf2_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, double q, ma_bpf2_config _retPar) {
        ma_bpf2_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, q, _retPar.getPointer());
    }

    public static native long ma_bpf2_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, double q, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_bpf2_config* _ret = (ma_bpf2_config*) (_retPar == 0 ? malloc(sizeof(ma_bpf2_config)) : (void*)_retPar);
    	*_ret = ma_bpf2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (double)q);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf2_get_heap_size(ma_bpf2_config.ma_bpf2_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_bpf2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_bpf2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf2_get_heap_size((const ma_bpf2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf2_init_preallocated(ma_bpf2_config.ma_bpf2_configPointer pConfig, VoidPointer pHeap, ma_bpf2.ma_bpf2Pointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf2_init_preallocated_internal(long pConfig, long pHeap, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf2_init_preallocated((const ma_bpf2_config *)pConfig, (void *)pHeap, (ma_bpf2 *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf2_init(ma_bpf2_config.ma_bpf2_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_bpf2.ma_bpf2Pointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf2_init_internal(long pConfig, long pAllocationCallbacks, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf2_init((const ma_bpf2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_bpf2 *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_bpf2_uninit(ma_bpf2.ma_bpf2Pointer pBPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_bpf2_uninit_internal(pBPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_bpf2_uninit_internal(long pBPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_bpf2_uninit((ma_bpf2 *)pBPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_bpf2_reinit(ma_bpf2_config.ma_bpf2_configPointer pConfig, ma_bpf2.ma_bpf2Pointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf2_reinit_internal(pConfig.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf2_reinit_internal(long pConfig, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf2_reinit((const ma_bpf2_config *)pConfig, (ma_bpf2 *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf2_process_pcm_frames(ma_bpf2.ma_bpf2Pointer pBPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_bpf2_process_pcm_frames_internal(pBPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_bpf2_process_pcm_frames_internal(long pBPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_bpf2_process_pcm_frames((ma_bpf2 *)pBPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_bpf2_get_latency(ma_bpf2.ma_bpf2Pointer pBPF) {
        return ma_bpf2_get_latency_internal(pBPF.getPointer());
    }

    public static native long ma_bpf2_get_latency_internal(long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_bpf2_get_latency((const ma_bpf2 *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_bpf_config ma_bpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_bpf_config(ma_bpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_bpf_config_init(ma_format format, long channels, long sampleRate, double cutoffFrequency, long order, ma_bpf_config _retPar) {
        ma_bpf_config_init_internal(format.getIndex(), channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_bpf_config_init_internal(int format, long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_bpf_config* _ret = (ma_bpf_config*) (_retPar == 0 ? malloc(sizeof(ma_bpf_config)) : (void*)_retPar);
    	*_ret = ma_bpf_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_get_heap_size(ma_bpf_config.ma_bpf_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_bpf_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_bpf_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_get_heap_size((const ma_bpf_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_init_preallocated(ma_bpf_config.ma_bpf_configPointer pConfig, VoidPointer pHeap, ma_bpf.ma_bpfPointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf_init_preallocated_internal(long pConfig, long pHeap, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_init_preallocated((const ma_bpf_config *)pConfig, (void *)pHeap, (ma_bpf *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_init(ma_bpf_config.ma_bpf_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_bpf.ma_bpfPointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf_init_internal(long pConfig, long pAllocationCallbacks, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_init((const ma_bpf_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_bpf *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_bpf_uninit(ma_bpf.ma_bpfPointer pBPF, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_bpf_uninit_internal(pBPF.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_bpf_uninit_internal(long pBPF, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_bpf_uninit((ma_bpf *)pBPF, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_bpf_reinit(ma_bpf_config.ma_bpf_configPointer pConfig, ma_bpf.ma_bpfPointer pBPF) {
        return ma_result.getByIndex((int) ma_bpf_reinit_internal(pConfig.getPointer(), pBPF.getPointer()));
    }

    public static native int ma_bpf_reinit_internal(long pConfig, long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_reinit((const ma_bpf_config *)pConfig, (ma_bpf *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_process_pcm_frames(ma_bpf.ma_bpfPointer pBPF, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_bpf_process_pcm_frames_internal(pBPF.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_bpf_process_pcm_frames_internal(long pBPF, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_bpf_process_pcm_frames((ma_bpf *)pBPF, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_bpf_get_latency(ma_bpf.ma_bpfPointer pBPF) {
        return ma_bpf_get_latency_internal(pBPF.getPointer());
    }

    public static native long ma_bpf_get_latency_internal(long pBPF);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_bpf_get_latency((const ma_bpf *)pBPF);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_notch2_config ma_notch2_config_init(ma_format format, long channels, long sampleRate, double q, double frequency) {
        return new ma_notch2_config(ma_notch2_config_init_internal(format.getIndex(), channels, sampleRate, q, frequency, 0), true);
    }

    public static void ma_notch2_config_init(ma_format format, long channels, long sampleRate, double q, double frequency, ma_notch2_config _retPar) {
        ma_notch2_config_init_internal(format.getIndex(), channels, sampleRate, q, frequency, _retPar.getPointer());
    }

    public static native long ma_notch2_config_init_internal(int format, long channels, long sampleRate, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_notch2_config* _ret = (ma_notch2_config*) (_retPar == 0 ? malloc(sizeof(ma_notch2_config)) : (void*)_retPar);
    	*_ret = ma_notch2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch2_get_heap_size(ma_notch2_config.ma_notch2_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_notch2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_notch2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch2_get_heap_size((const ma_notch2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch2_init_preallocated(ma_notch2_config.ma_notch2_configPointer pConfig, VoidPointer pHeap, ma_notch2.ma_notch2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_notch2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_notch2_init_preallocated_internal(long pConfig, long pHeap, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch2_init_preallocated((const ma_notch2_config *)pConfig, (void *)pHeap, (ma_notch2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch2_init(ma_notch2_config.ma_notch2_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_notch2.ma_notch2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_notch2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_notch2_init_internal(long pConfig, long pAllocationCallbacks, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch2_init((const ma_notch2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_notch2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_notch2_uninit(ma_notch2.ma_notch2Pointer pFilter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_notch2_uninit_internal(pFilter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_notch2_uninit_internal(long pFilter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_notch2_uninit((ma_notch2 *)pFilter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_notch2_reinit(ma_notch2_config.ma_notch2_configPointer pConfig, ma_notch2.ma_notch2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_notch2_reinit_internal(pConfig.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_notch2_reinit_internal(long pConfig, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch2_reinit((const ma_notch2_config *)pConfig, (ma_notch2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch2_process_pcm_frames(ma_notch2.ma_notch2Pointer pFilter, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_notch2_process_pcm_frames_internal(pFilter.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_notch2_process_pcm_frames_internal(long pFilter, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_notch2_process_pcm_frames((ma_notch2 *)pFilter, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_notch2_get_latency(ma_notch2.ma_notch2Pointer pFilter) {
        return ma_notch2_get_latency_internal(pFilter.getPointer());
    }

    public static native long ma_notch2_get_latency_internal(long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_notch2_get_latency((const ma_notch2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_peak2_config ma_peak2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double q, double frequency) {
        return new ma_peak2_config(ma_peak2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, q, frequency, 0), true);
    }

    public static void ma_peak2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double q, double frequency, ma_peak2_config _retPar) {
        ma_peak2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, q, frequency, _retPar.getPointer());
    }

    public static native long ma_peak2_config_init_internal(int format, long channels, long sampleRate, double gainDB, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_peak2_config* _ret = (ma_peak2_config*) (_retPar == 0 ? malloc(sizeof(ma_peak2_config)) : (void*)_retPar);
    	*_ret = ma_peak2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak2_get_heap_size(ma_peak2_config.ma_peak2_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_peak2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_peak2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak2_get_heap_size((const ma_peak2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak2_init_preallocated(ma_peak2_config.ma_peak2_configPointer pConfig, VoidPointer pHeap, ma_peak2.ma_peak2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_peak2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_peak2_init_preallocated_internal(long pConfig, long pHeap, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak2_init_preallocated((const ma_peak2_config *)pConfig, (void *)pHeap, (ma_peak2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak2_init(ma_peak2_config.ma_peak2_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_peak2.ma_peak2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_peak2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_peak2_init_internal(long pConfig, long pAllocationCallbacks, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak2_init((const ma_peak2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_peak2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_peak2_uninit(ma_peak2.ma_peak2Pointer pFilter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_peak2_uninit_internal(pFilter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_peak2_uninit_internal(long pFilter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_peak2_uninit((ma_peak2 *)pFilter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_peak2_reinit(ma_peak2_config.ma_peak2_configPointer pConfig, ma_peak2.ma_peak2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_peak2_reinit_internal(pConfig.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_peak2_reinit_internal(long pConfig, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak2_reinit((const ma_peak2_config *)pConfig, (ma_peak2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak2_process_pcm_frames(ma_peak2.ma_peak2Pointer pFilter, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_peak2_process_pcm_frames_internal(pFilter.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_peak2_process_pcm_frames_internal(long pFilter, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_peak2_process_pcm_frames((ma_peak2 *)pFilter, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_peak2_get_latency(ma_peak2.ma_peak2Pointer pFilter) {
        return ma_peak2_get_latency_internal(pFilter.getPointer());
    }

    public static native long ma_peak2_get_latency_internal(long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_peak2_get_latency((const ma_peak2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_loshelf2_config ma_loshelf2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency) {
        return new ma_loshelf2_config(ma_loshelf2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, shelfSlope, frequency, 0), true);
    }

    public static void ma_loshelf2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency, ma_loshelf2_config _retPar) {
        ma_loshelf2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, shelfSlope, frequency, _retPar.getPointer());
    }

    public static native long ma_loshelf2_config_init_internal(int format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_loshelf2_config* _ret = (ma_loshelf2_config*) (_retPar == 0 ? malloc(sizeof(ma_loshelf2_config)) : (void*)_retPar);
    	*_ret = ma_loshelf2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)shelfSlope, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf2_get_heap_size(ma_loshelf2_config.ma_loshelf2_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_loshelf2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_loshelf2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf2_get_heap_size((const ma_loshelf2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf2_init_preallocated(ma_loshelf2_config.ma_loshelf2_configPointer pConfig, VoidPointer pHeap, ma_loshelf2.ma_loshelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_loshelf2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_loshelf2_init_preallocated_internal(long pConfig, long pHeap, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf2_init_preallocated((const ma_loshelf2_config *)pConfig, (void *)pHeap, (ma_loshelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf2_init(ma_loshelf2_config.ma_loshelf2_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_loshelf2.ma_loshelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_loshelf2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_loshelf2_init_internal(long pConfig, long pAllocationCallbacks, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf2_init((const ma_loshelf2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_loshelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_loshelf2_uninit(ma_loshelf2.ma_loshelf2Pointer pFilter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_loshelf2_uninit_internal(pFilter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_loshelf2_uninit_internal(long pFilter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_loshelf2_uninit((ma_loshelf2 *)pFilter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_loshelf2_reinit(ma_loshelf2_config.ma_loshelf2_configPointer pConfig, ma_loshelf2.ma_loshelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_loshelf2_reinit_internal(pConfig.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_loshelf2_reinit_internal(long pConfig, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf2_reinit((const ma_loshelf2_config *)pConfig, (ma_loshelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf2_process_pcm_frames(ma_loshelf2.ma_loshelf2Pointer pFilter, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_loshelf2_process_pcm_frames_internal(pFilter.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_loshelf2_process_pcm_frames_internal(long pFilter, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_loshelf2_process_pcm_frames((ma_loshelf2 *)pFilter, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_loshelf2_get_latency(ma_loshelf2.ma_loshelf2Pointer pFilter) {
        return ma_loshelf2_get_latency_internal(pFilter.getPointer());
    }

    public static native long ma_loshelf2_get_latency_internal(long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_loshelf2_get_latency((const ma_loshelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_hishelf2_config ma_hishelf2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency) {
        return new ma_hishelf2_config(ma_hishelf2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, shelfSlope, frequency, 0), true);
    }

    public static void ma_hishelf2_config_init(ma_format format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency, ma_hishelf2_config _retPar) {
        ma_hishelf2_config_init_internal(format.getIndex(), channels, sampleRate, gainDB, shelfSlope, frequency, _retPar.getPointer());
    }

    public static native long ma_hishelf2_config_init_internal(int format, long channels, long sampleRate, double gainDB, double shelfSlope, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_hishelf2_config* _ret = (ma_hishelf2_config*) (_retPar == 0 ? malloc(sizeof(ma_hishelf2_config)) : (void*)_retPar);
    	*_ret = ma_hishelf2_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)shelfSlope, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf2_get_heap_size(ma_hishelf2_config.ma_hishelf2_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_hishelf2_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_hishelf2_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf2_get_heap_size((const ma_hishelf2_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf2_init_preallocated(ma_hishelf2_config.ma_hishelf2_configPointer pConfig, VoidPointer pHeap, ma_hishelf2.ma_hishelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_hishelf2_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_hishelf2_init_preallocated_internal(long pConfig, long pHeap, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf2_init_preallocated((const ma_hishelf2_config *)pConfig, (void *)pHeap, (ma_hishelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf2_init(ma_hishelf2_config.ma_hishelf2_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hishelf2.ma_hishelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_hishelf2_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_hishelf2_init_internal(long pConfig, long pAllocationCallbacks, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf2_init((const ma_hishelf2_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hishelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hishelf2_uninit(ma_hishelf2.ma_hishelf2Pointer pFilter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hishelf2_uninit_internal(pFilter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hishelf2_uninit_internal(long pFilter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hishelf2_uninit((ma_hishelf2 *)pFilter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_hishelf2_reinit(ma_hishelf2_config.ma_hishelf2_configPointer pConfig, ma_hishelf2.ma_hishelf2Pointer pFilter) {
        return ma_result.getByIndex((int) ma_hishelf2_reinit_internal(pConfig.getPointer(), pFilter.getPointer()));
    }

    public static native int ma_hishelf2_reinit_internal(long pConfig, long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf2_reinit((const ma_hishelf2_config *)pConfig, (ma_hishelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf2_process_pcm_frames(ma_hishelf2.ma_hishelf2Pointer pFilter, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_hishelf2_process_pcm_frames_internal(pFilter.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_hishelf2_process_pcm_frames_internal(long pFilter, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_hishelf2_process_pcm_frames((ma_hishelf2 *)pFilter, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_hishelf2_get_latency(ma_hishelf2.ma_hishelf2Pointer pFilter) {
        return ma_hishelf2_get_latency_internal(pFilter.getPointer());
    }

    public static native long ma_hishelf2_get_latency_internal(long pFilter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_hishelf2_get_latency((const ma_hishelf2 *)pFilter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_delay_config ma_delay_config_init(long channels, long sampleRate, long delayInFrames, float decay) {
        return new ma_delay_config(ma_delay_config_init_internal(channels, sampleRate, delayInFrames, decay, 0), true);
    }

    public static void ma_delay_config_init(long channels, long sampleRate, long delayInFrames, float decay, ma_delay_config _retPar) {
        ma_delay_config_init_internal(channels, sampleRate, delayInFrames, decay, _retPar.getPointer());
    }

    public static native long ma_delay_config_init_internal(long channels, long sampleRate, long delayInFrames, float decay, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, delayInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_delay_config* _ret = (ma_delay_config*) (_retPar == 0 ? malloc(sizeof(ma_delay_config)) : (void*)_retPar);
    	*_ret = ma_delay_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (ma_uint32)delayInFrames, (float)decay);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_delay_init(ma_delay_config.ma_delay_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_delay.ma_delayPointer pDelay) {
        return ma_result.getByIndex((int) ma_delay_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pDelay.getPointer()));
    }

    public static native int ma_delay_init_internal(long pConfig, long pAllocationCallbacks, long pDelay);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_delay_init((const ma_delay_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_delay *)pDelay);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_uninit(ma_delay.ma_delayPointer pDelay, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_delay_uninit_internal(pDelay.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_delay_uninit_internal(long pDelay, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_uninit((ma_delay *)pDelay, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_delay_process_pcm_frames(ma_delay.ma_delayPointer pDelay, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_delay_process_pcm_frames_internal(pDelay.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_delay_process_pcm_frames_internal(long pDelay, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, frameCount, 3, return 0);
    	return (jint)ma_delay_process_pcm_frames((ma_delay *)pDelay, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint32)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_set_wet(ma_delay.ma_delayPointer pDelay, float value) {
        ma_delay_set_wet_internal(pDelay.getPointer(), value);
    }

    public static native void ma_delay_set_wet_internal(long pDelay, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_set_wet((ma_delay *)pDelay, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_get_wet(ma_delay.ma_delayPointer pDelay) {
        return ma_delay_get_wet_internal(pDelay.getPointer());
    }

    public static native float ma_delay_get_wet_internal(long pDelay);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_get_wet((const ma_delay *)pDelay);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_set_dry(ma_delay.ma_delayPointer pDelay, float value) {
        ma_delay_set_dry_internal(pDelay.getPointer(), value);
    }

    public static native void ma_delay_set_dry_internal(long pDelay, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_set_dry((ma_delay *)pDelay, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_get_dry(ma_delay.ma_delayPointer pDelay) {
        return ma_delay_get_dry_internal(pDelay.getPointer());
    }

    public static native float ma_delay_get_dry_internal(long pDelay);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_get_dry((const ma_delay *)pDelay);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_set_decay(ma_delay.ma_delayPointer pDelay, float value) {
        ma_delay_set_decay_internal(pDelay.getPointer(), value);
    }

    public static native void ma_delay_set_decay_internal(long pDelay, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_set_decay((ma_delay *)pDelay, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_get_decay(ma_delay.ma_delayPointer pDelay) {
        return ma_delay_get_decay_internal(pDelay.getPointer());
    }

    public static native float ma_delay_get_decay_internal(long pDelay);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_get_decay((const ma_delay *)pDelay);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_gainer_config ma_gainer_config_init(long channels, long smoothTimeInFrames) {
        return new ma_gainer_config(ma_gainer_config_init_internal(channels, smoothTimeInFrames, 0), true);
    }

    public static void ma_gainer_config_init(long channels, long smoothTimeInFrames, ma_gainer_config _retPar) {
        ma_gainer_config_init_internal(channels, smoothTimeInFrames, _retPar.getPointer());
    }

    public static native long ma_gainer_config_init_internal(long channels, long smoothTimeInFrames, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, smoothTimeInFrames, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_gainer_config* _ret = (ma_gainer_config*) (_retPar == 0 ? malloc(sizeof(ma_gainer_config)) : (void*)_retPar);
    	*_ret = ma_gainer_config_init((ma_uint32)channels, (ma_uint32)smoothTimeInFrames);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_get_heap_size(ma_gainer_config.ma_gainer_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_gainer_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_gainer_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_get_heap_size((const ma_gainer_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_init_preallocated(ma_gainer_config.ma_gainer_configPointer pConfig, VoidPointer pHeap, ma_gainer.ma_gainerPointer pGainer) {
        return ma_result.getByIndex((int) ma_gainer_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pGainer.getPointer()));
    }

    public static native int ma_gainer_init_preallocated_internal(long pConfig, long pHeap, long pGainer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_init_preallocated((const ma_gainer_config *)pConfig, (void *)pHeap, (ma_gainer *)pGainer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_init(ma_gainer_config.ma_gainer_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_gainer.ma_gainerPointer pGainer) {
        return ma_result.getByIndex((int) ma_gainer_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pGainer.getPointer()));
    }

    public static native int ma_gainer_init_internal(long pConfig, long pAllocationCallbacks, long pGainer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_init((const ma_gainer_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_gainer *)pGainer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_gainer_uninit(ma_gainer.ma_gainerPointer pGainer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_gainer_uninit_internal(pGainer.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_gainer_uninit_internal(long pGainer, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_gainer_uninit((ma_gainer *)pGainer, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_gainer_process_pcm_frames(ma_gainer.ma_gainerPointer pGainer, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_gainer_process_pcm_frames_internal(pGainer.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_gainer_process_pcm_frames_internal(long pGainer, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_gainer_process_pcm_frames((ma_gainer *)pGainer, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_set_gain(ma_gainer.ma_gainerPointer pGainer, float newGain) {
        return ma_result.getByIndex((int) ma_gainer_set_gain_internal(pGainer.getPointer(), newGain));
    }

    public static native int ma_gainer_set_gain_internal(long pGainer, float newGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_set_gain((ma_gainer *)pGainer, (float)newGain);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_set_gains(ma_gainer.ma_gainerPointer pGainer, FloatPointer pNewGains) {
        return ma_result.getByIndex((int) ma_gainer_set_gains_internal(pGainer.getPointer(), pNewGains.getPointer()));
    }

    public static native int ma_gainer_set_gains_internal(long pGainer, long pNewGains);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_set_gains((ma_gainer *)pGainer, (float *)pNewGains);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_set_master_volume(ma_gainer.ma_gainerPointer pGainer, float volume) {
        return ma_result.getByIndex((int) ma_gainer_set_master_volume_internal(pGainer.getPointer(), volume));
    }

    public static native int ma_gainer_set_master_volume_internal(long pGainer, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_set_master_volume((ma_gainer *)pGainer, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_gainer_get_master_volume(ma_gainer.ma_gainerPointer pGainer, FloatPointer pVolume) {
        return ma_result.getByIndex((int) ma_gainer_get_master_volume_internal(pGainer.getPointer(), pVolume.getPointer()));
    }

    public static native int ma_gainer_get_master_volume_internal(long pGainer, long pVolume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_gainer_get_master_volume((const ma_gainer *)pGainer, (float *)pVolume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_panner_config ma_panner_config_init(ma_format format, long channels) {
        return new ma_panner_config(ma_panner_config_init_internal(format.getIndex(), channels, 0), true);
    }

    public static void ma_panner_config_init(ma_format format, long channels, ma_panner_config _retPar) {
        ma_panner_config_init_internal(format.getIndex(), channels, _retPar.getPointer());
    }

    public static native long ma_panner_config_init_internal(int format, long channels, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_panner_config* _ret = (ma_panner_config*) (_retPar == 0 ? malloc(sizeof(ma_panner_config)) : (void*)_retPar);
    	*_ret = ma_panner_config_init((ma_format)format, (ma_uint32)channels);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_panner_init(ma_panner_config.ma_panner_configPointer pConfig, ma_panner.ma_pannerPointer pPanner) {
        return ma_result.getByIndex((int) ma_panner_init_internal(pConfig.getPointer(), pPanner.getPointer()));
    }

    public static native int ma_panner_init_internal(long pConfig, long pPanner);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_panner_init((const ma_panner_config *)pConfig, (ma_panner *)pPanner);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_panner_process_pcm_frames(ma_panner.ma_pannerPointer pPanner, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_panner_process_pcm_frames_internal(pPanner.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_panner_process_pcm_frames_internal(long pPanner, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_panner_process_pcm_frames((ma_panner *)pPanner, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_panner_set_mode(ma_panner.ma_pannerPointer pPanner, ma_pan_mode mode) {
        ma_panner_set_mode_internal(pPanner.getPointer(), mode.getIndex());
    }

    public static native void ma_panner_set_mode_internal(long pPanner, int mode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_panner_set_mode((ma_panner *)pPanner, (ma_pan_mode)mode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_pan_mode ma_panner_get_mode(ma_panner.ma_pannerPointer pPanner) {
        return ma_pan_mode.getByIndex((int) ma_panner_get_mode_internal(pPanner.getPointer()));
    }

    public static native int ma_panner_get_mode_internal(long pPanner);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_panner_get_mode((const ma_panner *)pPanner);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_panner_set_pan(ma_panner.ma_pannerPointer pPanner, float pan) {
        ma_panner_set_pan_internal(pPanner.getPointer(), pan);
    }

    public static native void ma_panner_set_pan_internal(long pPanner, float pan);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_panner_set_pan((ma_panner *)pPanner, (float)pan);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_panner_get_pan(ma_panner.ma_pannerPointer pPanner) {
        return ma_panner_get_pan_internal(pPanner.getPointer());
    }

    public static native float ma_panner_get_pan_internal(long pPanner);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_panner_get_pan((const ma_panner *)pPanner);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_fader_config ma_fader_config_init(ma_format format, long channels, long sampleRate) {
        return new ma_fader_config(ma_fader_config_init_internal(format.getIndex(), channels, sampleRate, 0), true);
    }

    public static void ma_fader_config_init(ma_format format, long channels, long sampleRate, ma_fader_config _retPar) {
        ma_fader_config_init_internal(format.getIndex(), channels, sampleRate, _retPar.getPointer());
    }

    public static native long ma_fader_config_init_internal(int format, long channels, long sampleRate, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_fader_config* _ret = (ma_fader_config*) (_retPar == 0 ? malloc(sizeof(ma_fader_config)) : (void*)_retPar);
    	*_ret = ma_fader_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_fader_init(ma_fader_config.ma_fader_configPointer pConfig, ma_fader.ma_faderPointer pFader) {
        return ma_result.getByIndex((int) ma_fader_init_internal(pConfig.getPointer(), pFader.getPointer()));
    }

    public static native int ma_fader_init_internal(long pConfig, long pFader);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_fader_init((const ma_fader_config *)pConfig, (ma_fader *)pFader);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_fader_process_pcm_frames(ma_fader.ma_faderPointer pFader, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_fader_process_pcm_frames_internal(pFader.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_fader_process_pcm_frames_internal(long pFader, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_fader_process_pcm_frames((ma_fader *)pFader, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_fader_get_data_format(ma_fader.ma_faderPointer pFader, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate) {
        ma_fader_get_data_format_internal(pFader.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer());
    }

    public static native void ma_fader_get_data_format_internal(long pFader, long pFormat, long pChannels, long pSampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_fader_get_data_format((const ma_fader *)pFader, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_fader_set_fade(ma_fader.ma_faderPointer pFader, float volumeBeg, float volumeEnd, long lengthInFrames) {
        ma_fader_set_fade_internal(pFader.getPointer(), volumeBeg, volumeEnd, lengthInFrames);
    }

    public static native void ma_fader_set_fade_internal(long pFader, float volumeBeg, float volumeEnd, long lengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, lengthInFrames, 3, return);
    	ma_fader_set_fade((ma_fader *)pFader, (float)volumeBeg, (float)volumeEnd, (ma_uint64)lengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_fader_set_fade_ex(ma_fader.ma_faderPointer pFader, float volumeBeg, float volumeEnd, long lengthInFrames, long startOffsetInFrames) {
        ma_fader_set_fade_ex_internal(pFader.getPointer(), volumeBeg, volumeEnd, lengthInFrames, startOffsetInFrames);
    }

    public static native void ma_fader_set_fade_ex_internal(long pFader, float volumeBeg, float volumeEnd, long lengthInFrames, long startOffsetInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_int64, startOffsetInFrames, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, lengthInFrames, 3, return);
    	ma_fader_set_fade_ex((ma_fader *)pFader, (float)volumeBeg, (float)volumeEnd, (ma_uint64)lengthInFrames, (ma_int64)startOffsetInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_fader_get_current_volume(ma_fader.ma_faderPointer pFader) {
        return ma_fader_get_current_volume_internal(pFader.getPointer());
    }

    public static native float ma_fader_get_current_volume_internal(long pFader);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_fader_get_current_volume((const ma_fader *)pFader);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_spatializer_listener_config ma_spatializer_listener_config_init(long channelsOut) {
        return new ma_spatializer_listener_config(ma_spatializer_listener_config_init_internal(channelsOut, 0), true);
    }

    public static void ma_spatializer_listener_config_init(long channelsOut, ma_spatializer_listener_config _retPar) {
        ma_spatializer_listener_config_init_internal(channelsOut, _retPar.getPointer());
    }

    public static native long ma_spatializer_listener_config_init_internal(long channelsOut, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsOut, 0, return 0);
    	ma_spatializer_listener_config* _ret = (ma_spatializer_listener_config*) (_retPar == 0 ? malloc(sizeof(ma_spatializer_listener_config)) : (void*)_retPar);
    	*_ret = ma_spatializer_listener_config_init((ma_uint32)channelsOut);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_listener_get_heap_size(ma_spatializer_listener_config.ma_spatializer_listener_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_spatializer_listener_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_spatializer_listener_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_listener_get_heap_size((const ma_spatializer_listener_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_listener_init_preallocated(ma_spatializer_listener_config.ma_spatializer_listener_configPointer pConfig, VoidPointer pHeap, ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return ma_result.getByIndex((int) ma_spatializer_listener_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pListener.getPointer()));
    }

    public static native int ma_spatializer_listener_init_preallocated_internal(long pConfig, long pHeap, long pListener);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_listener_init_preallocated((const ma_spatializer_listener_config *)pConfig, (void *)pHeap, (ma_spatializer_listener *)pListener);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_listener_init(ma_spatializer_listener_config.ma_spatializer_listener_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return ma_result.getByIndex((int) ma_spatializer_listener_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pListener.getPointer()));
    }

    public static native int ma_spatializer_listener_init_internal(long pConfig, long pAllocationCallbacks, long pListener);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_listener_init((const ma_spatializer_listener_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_spatializer_listener *)pListener);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_uninit(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_spatializer_listener_uninit_internal(pListener.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_spatializer_listener_uninit_internal(long pListener, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_uninit((ma_spatializer_listener *)pListener, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static UBytePointer ma_spatializer_listener_get_channel_map(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return new UBytePointer(ma_spatializer_listener_get_channel_map_internal(pListener.getPointer()), false);
    }

    public static void ma_spatializer_listener_get_channel_map(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, UBytePointer _retPar) {
        _retPar.setPointer(ma_spatializer_listener_get_channel_map_internal(pListener.getPointer()));
    }

    public static native long ma_spatializer_listener_get_channel_map_internal(long pListener);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_spatializer_listener_get_channel_map((ma_spatializer_listener *)pListener);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_cone(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float innerAngleInRadians, float outerAngleInRadians, float outerGain) {
        ma_spatializer_listener_set_cone_internal(pListener.getPointer(), innerAngleInRadians, outerAngleInRadians, outerGain);
    }

    public static native void ma_spatializer_listener_set_cone_internal(long pListener, float innerAngleInRadians, float outerAngleInRadians, float outerGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_cone((ma_spatializer_listener *)pListener, (float)innerAngleInRadians, (float)outerAngleInRadians, (float)outerGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_spatializer_listener_get_cone(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, FloatPointer pInnerAngleInRadians, FloatPointer pOuterAngleInRadians, FloatPointer pOuterGain) {
        ma_spatializer_listener_get_cone_internal(pListener.getPointer(), pInnerAngleInRadians.getPointer(), pOuterAngleInRadians.getPointer(), pOuterGain.getPointer());
    }

    public static native void ma_spatializer_listener_get_cone_internal(long pListener, long pInnerAngleInRadians, long pOuterAngleInRadians, long pOuterGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_get_cone((const ma_spatializer_listener *)pListener, (float *)pInnerAngleInRadians, (float *)pOuterAngleInRadians, (float *)pOuterGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_spatializer_listener_set_position(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float x, float y, float z) {
        ma_spatializer_listener_set_position_internal(pListener.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_listener_set_position_internal(long pListener, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_position((ma_spatializer_listener *)pListener, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_listener_get_position(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return new ma_vec3f(ma_spatializer_listener_get_position_internal(pListener.getPointer(), 0), true);
    }

    public static void ma_spatializer_listener_get_position(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_vec3f _retPar) {
        ma_spatializer_listener_get_position_internal(pListener.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_listener_get_position_internal(long pListener, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_listener_get_position((const ma_spatializer_listener *)pListener);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_direction(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float x, float y, float z) {
        ma_spatializer_listener_set_direction_internal(pListener.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_listener_set_direction_internal(long pListener, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_direction((ma_spatializer_listener *)pListener, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_listener_get_direction(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return new ma_vec3f(ma_spatializer_listener_get_direction_internal(pListener.getPointer(), 0), true);
    }

    public static void ma_spatializer_listener_get_direction(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_vec3f _retPar) {
        ma_spatializer_listener_get_direction_internal(pListener.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_listener_get_direction_internal(long pListener, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_listener_get_direction((const ma_spatializer_listener *)pListener);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_velocity(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float x, float y, float z) {
        ma_spatializer_listener_set_velocity_internal(pListener.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_listener_set_velocity_internal(long pListener, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_velocity((ma_spatializer_listener *)pListener, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_listener_get_velocity(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return new ma_vec3f(ma_spatializer_listener_get_velocity_internal(pListener.getPointer(), 0), true);
    }

    public static void ma_spatializer_listener_get_velocity(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_vec3f _retPar) {
        ma_spatializer_listener_get_velocity_internal(pListener.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_listener_get_velocity_internal(long pListener, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_listener_get_velocity((const ma_spatializer_listener *)pListener);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_speed_of_sound(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float speedOfSound) {
        ma_spatializer_listener_set_speed_of_sound_internal(pListener.getPointer(), speedOfSound);
    }

    public static native void ma_spatializer_listener_set_speed_of_sound_internal(long pListener, float speedOfSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_speed_of_sound((ma_spatializer_listener *)pListener, (float)speedOfSound);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_listener_get_speed_of_sound(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return ma_spatializer_listener_get_speed_of_sound_internal(pListener.getPointer());
    }

    public static native float ma_spatializer_listener_get_speed_of_sound_internal(long pListener);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_listener_get_speed_of_sound((const ma_spatializer_listener *)pListener);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_world_up(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, float x, float y, float z) {
        ma_spatializer_listener_set_world_up_internal(pListener.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_listener_set_world_up_internal(long pListener, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_listener_set_world_up((ma_spatializer_listener *)pListener, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_listener_get_world_up(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return new ma_vec3f(ma_spatializer_listener_get_world_up_internal(pListener.getPointer(), 0), true);
    }

    public static void ma_spatializer_listener_get_world_up(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_vec3f _retPar) {
        ma_spatializer_listener_get_world_up_internal(pListener.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_listener_get_world_up_internal(long pListener, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_listener_get_world_up((const ma_spatializer_listener *)pListener);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_listener_set_enabled(ma_spatializer_listener.ma_spatializer_listenerPointer pListener, long isEnabled) {
        ma_spatializer_listener_set_enabled_internal(pListener.getPointer(), isEnabled);
    }

    public static native void ma_spatializer_listener_set_enabled_internal(long pListener, long isEnabled);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isEnabled, 1, return);
    	ma_spatializer_listener_set_enabled((ma_spatializer_listener *)pListener, (ma_bool32)isEnabled);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_spatializer_listener_is_enabled(ma_spatializer_listener.ma_spatializer_listenerPointer pListener) {
        return ma_spatializer_listener_is_enabled_internal(pListener.getPointer());
    }

    public static native long ma_spatializer_listener_is_enabled_internal(long pListener);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_spatializer_listener_is_enabled((const ma_spatializer_listener *)pListener);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_spatializer_config ma_spatializer_config_init(long channelsIn, long channelsOut) {
        return new ma_spatializer_config(ma_spatializer_config_init_internal(channelsIn, channelsOut, 0), true);
    }

    public static void ma_spatializer_config_init(long channelsIn, long channelsOut, ma_spatializer_config _retPar) {
        ma_spatializer_config_init_internal(channelsIn, channelsOut, _retPar.getPointer());
    }

    public static native long ma_spatializer_config_init_internal(long channelsIn, long channelsOut, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsOut, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsIn, 0, return 0);
    	ma_spatializer_config* _ret = (ma_spatializer_config*) (_retPar == 0 ? malloc(sizeof(ma_spatializer_config)) : (void*)_retPar);
    	*_ret = ma_spatializer_config_init((ma_uint32)channelsIn, (ma_uint32)channelsOut);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_get_heap_size(ma_spatializer_config.ma_spatializer_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_spatializer_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_spatializer_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_get_heap_size((const ma_spatializer_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_init_preallocated(ma_spatializer_config.ma_spatializer_configPointer pConfig, VoidPointer pHeap, ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_result.getByIndex((int) ma_spatializer_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pSpatializer.getPointer()));
    }

    public static native int ma_spatializer_init_preallocated_internal(long pConfig, long pHeap, long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_init_preallocated((const ma_spatializer_config *)pConfig, (void *)pHeap, (ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_init(ma_spatializer_config.ma_spatializer_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_result.getByIndex((int) ma_spatializer_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pSpatializer.getPointer()));
    }

    public static native int ma_spatializer_init_internal(long pConfig, long pAllocationCallbacks, long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_init((const ma_spatializer_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_uninit(ma_spatializer.ma_spatializerPointer pSpatializer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_spatializer_uninit_internal(pSpatializer.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_spatializer_uninit_internal(long pSpatializer, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_uninit((ma_spatializer *)pSpatializer, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_spatializer_process_pcm_frames(ma_spatializer.ma_spatializerPointer pSpatializer, ma_spatializer_listener.ma_spatializer_listenerPointer pListener, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_spatializer_process_pcm_frames_internal(pSpatializer.getPointer(), pListener.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_spatializer_process_pcm_frames_internal(long pSpatializer, long pListener, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 4, return 0);
    	return (jint)ma_spatializer_process_pcm_frames((ma_spatializer *)pSpatializer, (ma_spatializer_listener *)pListener, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_set_master_volume(ma_spatializer.ma_spatializerPointer pSpatializer, float volume) {
        return ma_result.getByIndex((int) ma_spatializer_set_master_volume_internal(pSpatializer.getPointer(), volume));
    }

    public static native int ma_spatializer_set_master_volume_internal(long pSpatializer, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_set_master_volume((ma_spatializer *)pSpatializer, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spatializer_get_master_volume(ma_spatializer.ma_spatializerPointer pSpatializer, FloatPointer pVolume) {
        return ma_result.getByIndex((int) ma_spatializer_get_master_volume_internal(pSpatializer.getPointer(), pVolume.getPointer()));
    }

    public static native int ma_spatializer_get_master_volume_internal(long pSpatializer, long pVolume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_get_master_volume((const ma_spatializer *)pSpatializer, (float *)pVolume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_spatializer_get_input_channels(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_input_channels_internal(pSpatializer.getPointer());
    }

    public static native long ma_spatializer_get_input_channels_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_spatializer_get_input_channels((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_spatializer_get_output_channels(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_output_channels_internal(pSpatializer.getPointer());
    }

    public static native long ma_spatializer_get_output_channels_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_spatializer_get_output_channels((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_attenuation_model(ma_spatializer.ma_spatializerPointer pSpatializer, ma_attenuation_model attenuationModel) {
        ma_spatializer_set_attenuation_model_internal(pSpatializer.getPointer(), attenuationModel.getIndex());
    }

    public static native void ma_spatializer_set_attenuation_model_internal(long pSpatializer, int attenuationModel);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_attenuation_model((ma_spatializer *)pSpatializer, (ma_attenuation_model)attenuationModel);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_attenuation_model ma_spatializer_get_attenuation_model(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_attenuation_model.getByIndex((int) ma_spatializer_get_attenuation_model_internal(pSpatializer.getPointer()));
    }

    public static native int ma_spatializer_get_attenuation_model_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_get_attenuation_model((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_positioning(ma_spatializer.ma_spatializerPointer pSpatializer, ma_positioning positioning) {
        ma_spatializer_set_positioning_internal(pSpatializer.getPointer(), positioning.getIndex());
    }

    public static native void ma_spatializer_set_positioning_internal(long pSpatializer, int positioning);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_positioning((ma_spatializer *)pSpatializer, (ma_positioning)positioning);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_positioning ma_spatializer_get_positioning(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_positioning.getByIndex((int) ma_spatializer_get_positioning_internal(pSpatializer.getPointer()));
    }

    public static native int ma_spatializer_get_positioning_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spatializer_get_positioning((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_rolloff(ma_spatializer.ma_spatializerPointer pSpatializer, float rolloff) {
        ma_spatializer_set_rolloff_internal(pSpatializer.getPointer(), rolloff);
    }

    public static native void ma_spatializer_set_rolloff_internal(long pSpatializer, float rolloff);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_rolloff((ma_spatializer *)pSpatializer, (float)rolloff);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_rolloff(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_rolloff_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_rolloff_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_rolloff((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_min_gain(ma_spatializer.ma_spatializerPointer pSpatializer, float minGain) {
        ma_spatializer_set_min_gain_internal(pSpatializer.getPointer(), minGain);
    }

    public static native void ma_spatializer_set_min_gain_internal(long pSpatializer, float minGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_min_gain((ma_spatializer *)pSpatializer, (float)minGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_min_gain(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_min_gain_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_min_gain_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_min_gain((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_max_gain(ma_spatializer.ma_spatializerPointer pSpatializer, float maxGain) {
        ma_spatializer_set_max_gain_internal(pSpatializer.getPointer(), maxGain);
    }

    public static native void ma_spatializer_set_max_gain_internal(long pSpatializer, float maxGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_max_gain((ma_spatializer *)pSpatializer, (float)maxGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_max_gain(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_max_gain_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_max_gain_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_max_gain((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_min_distance(ma_spatializer.ma_spatializerPointer pSpatializer, float minDistance) {
        ma_spatializer_set_min_distance_internal(pSpatializer.getPointer(), minDistance);
    }

    public static native void ma_spatializer_set_min_distance_internal(long pSpatializer, float minDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_min_distance((ma_spatializer *)pSpatializer, (float)minDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_min_distance(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_min_distance_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_min_distance_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_min_distance((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_max_distance(ma_spatializer.ma_spatializerPointer pSpatializer, float maxDistance) {
        ma_spatializer_set_max_distance_internal(pSpatializer.getPointer(), maxDistance);
    }

    public static native void ma_spatializer_set_max_distance_internal(long pSpatializer, float maxDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_max_distance((ma_spatializer *)pSpatializer, (float)maxDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_max_distance(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_max_distance_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_max_distance_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_max_distance((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_cone(ma_spatializer.ma_spatializerPointer pSpatializer, float innerAngleInRadians, float outerAngleInRadians, float outerGain) {
        ma_spatializer_set_cone_internal(pSpatializer.getPointer(), innerAngleInRadians, outerAngleInRadians, outerGain);
    }

    public static native void ma_spatializer_set_cone_internal(long pSpatializer, float innerAngleInRadians, float outerAngleInRadians, float outerGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_cone((ma_spatializer *)pSpatializer, (float)innerAngleInRadians, (float)outerAngleInRadians, (float)outerGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_spatializer_get_cone(ma_spatializer.ma_spatializerPointer pSpatializer, FloatPointer pInnerAngleInRadians, FloatPointer pOuterAngleInRadians, FloatPointer pOuterGain) {
        ma_spatializer_get_cone_internal(pSpatializer.getPointer(), pInnerAngleInRadians.getPointer(), pOuterAngleInRadians.getPointer(), pOuterGain.getPointer());
    }

    public static native void ma_spatializer_get_cone_internal(long pSpatializer, long pInnerAngleInRadians, long pOuterAngleInRadians, long pOuterGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_get_cone((const ma_spatializer *)pSpatializer, (float *)pInnerAngleInRadians, (float *)pOuterAngleInRadians, (float *)pOuterGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_spatializer_set_doppler_factor(ma_spatializer.ma_spatializerPointer pSpatializer, float dopplerFactor) {
        ma_spatializer_set_doppler_factor_internal(pSpatializer.getPointer(), dopplerFactor);
    }

    public static native void ma_spatializer_set_doppler_factor_internal(long pSpatializer, float dopplerFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_doppler_factor((ma_spatializer *)pSpatializer, (float)dopplerFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_doppler_factor(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_doppler_factor_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_doppler_factor_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_doppler_factor((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_directional_attenuation_factor(ma_spatializer.ma_spatializerPointer pSpatializer, float directionalAttenuationFactor) {
        ma_spatializer_set_directional_attenuation_factor_internal(pSpatializer.getPointer(), directionalAttenuationFactor);
    }

    public static native void ma_spatializer_set_directional_attenuation_factor_internal(long pSpatializer, float directionalAttenuationFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_directional_attenuation_factor((ma_spatializer *)pSpatializer, (float)directionalAttenuationFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_spatializer_get_directional_attenuation_factor(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return ma_spatializer_get_directional_attenuation_factor_internal(pSpatializer.getPointer());
    }

    public static native float ma_spatializer_get_directional_attenuation_factor_internal(long pSpatializer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_spatializer_get_directional_attenuation_factor((const ma_spatializer *)pSpatializer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_position(ma_spatializer.ma_spatializerPointer pSpatializer, float x, float y, float z) {
        ma_spatializer_set_position_internal(pSpatializer.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_set_position_internal(long pSpatializer, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_position((ma_spatializer *)pSpatializer, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_get_position(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return new ma_vec3f(ma_spatializer_get_position_internal(pSpatializer.getPointer(), 0), true);
    }

    public static void ma_spatializer_get_position(ma_spatializer.ma_spatializerPointer pSpatializer, ma_vec3f _retPar) {
        ma_spatializer_get_position_internal(pSpatializer.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_get_position_internal(long pSpatializer, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_get_position((const ma_spatializer *)pSpatializer);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_direction(ma_spatializer.ma_spatializerPointer pSpatializer, float x, float y, float z) {
        ma_spatializer_set_direction_internal(pSpatializer.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_set_direction_internal(long pSpatializer, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_direction((ma_spatializer *)pSpatializer, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_get_direction(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return new ma_vec3f(ma_spatializer_get_direction_internal(pSpatializer.getPointer(), 0), true);
    }

    public static void ma_spatializer_get_direction(ma_spatializer.ma_spatializerPointer pSpatializer, ma_vec3f _retPar) {
        ma_spatializer_get_direction_internal(pSpatializer.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_get_direction_internal(long pSpatializer, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_get_direction((const ma_spatializer *)pSpatializer);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_set_velocity(ma_spatializer.ma_spatializerPointer pSpatializer, float x, float y, float z) {
        ma_spatializer_set_velocity_internal(pSpatializer.getPointer(), x, y, z);
    }

    public static native void ma_spatializer_set_velocity_internal(long pSpatializer, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_set_velocity((ma_spatializer *)pSpatializer, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_spatializer_get_velocity(ma_spatializer.ma_spatializerPointer pSpatializer) {
        return new ma_vec3f(ma_spatializer_get_velocity_internal(pSpatializer.getPointer(), 0), true);
    }

    public static void ma_spatializer_get_velocity(ma_spatializer.ma_spatializerPointer pSpatializer, ma_vec3f _retPar) {
        ma_spatializer_get_velocity_internal(pSpatializer.getPointer(), _retPar.getPointer());
    }

    public static native long ma_spatializer_get_velocity_internal(long pSpatializer, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_spatializer_get_velocity((const ma_spatializer *)pSpatializer);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_spatializer_get_relative_position_and_direction(ma_spatializer.ma_spatializerPointer pSpatializer, ma_spatializer_listener.ma_spatializer_listenerPointer pListener, ma_vec3f.ma_vec3fPointer pRelativePos, ma_vec3f.ma_vec3fPointer pRelativeDir) {
        ma_spatializer_get_relative_position_and_direction_internal(pSpatializer.getPointer(), pListener.getPointer(), pRelativePos.getPointer(), pRelativeDir.getPointer());
    }

    public static native void ma_spatializer_get_relative_position_and_direction_internal(long pSpatializer, long pListener, long pRelativePos, long pRelativeDir);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_spatializer_get_relative_position_and_direction((const ma_spatializer *)pSpatializer, (const ma_spatializer_listener *)pListener, (ma_vec3f *)pRelativePos, (ma_vec3f *)pRelativeDir);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_linear_resampler_config ma_linear_resampler_config_init(ma_format format, long channels, long sampleRateIn, long sampleRateOut) {
        return new ma_linear_resampler_config(ma_linear_resampler_config_init_internal(format.getIndex(), channels, sampleRateIn, sampleRateOut, 0), true);
    }

    public static void ma_linear_resampler_config_init(ma_format format, long channels, long sampleRateIn, long sampleRateOut, ma_linear_resampler_config _retPar) {
        ma_linear_resampler_config_init_internal(format.getIndex(), channels, sampleRateIn, sampleRateOut, _retPar.getPointer());
    }

    public static native long ma_linear_resampler_config_init_internal(int format, long channels, long sampleRateIn, long sampleRateOut, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_linear_resampler_config* _ret = (ma_linear_resampler_config*) (_retPar == 0 ? malloc(sizeof(ma_linear_resampler_config)) : (void*)_retPar);
    	*_ret = ma_linear_resampler_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_get_heap_size(ma_linear_resampler_config.ma_linear_resampler_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_linear_resampler_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_linear_resampler_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_get_heap_size((const ma_linear_resampler_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_init_preallocated(ma_linear_resampler_config.ma_linear_resampler_configPointer pConfig, VoidPointer pHeap, ma_linear_resampler.ma_linear_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_linear_resampler_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pResampler.getPointer()));
    }

    public static native int ma_linear_resampler_init_preallocated_internal(long pConfig, long pHeap, long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_init_preallocated((const ma_linear_resampler_config *)pConfig, (void *)pHeap, (ma_linear_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_init(ma_linear_resampler_config.ma_linear_resampler_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_linear_resampler.ma_linear_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_linear_resampler_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pResampler.getPointer()));
    }

    public static native int ma_linear_resampler_init_internal(long pConfig, long pAllocationCallbacks, long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_init((const ma_linear_resampler_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_linear_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_linear_resampler_uninit(ma_linear_resampler.ma_linear_resamplerPointer pResampler, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_linear_resampler_uninit_internal(pResampler.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_linear_resampler_uninit_internal(long pResampler, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_linear_resampler_uninit((ma_linear_resampler *)pResampler, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_linear_resampler_process_pcm_frames(ma_linear_resampler.ma_linear_resamplerPointer pResampler, VoidPointer pFramesIn, UInt64Pointer pFrameCountIn, VoidPointer pFramesOut, UInt64Pointer pFrameCountOut) {
        return ma_result.getByIndex((int) ma_linear_resampler_process_pcm_frames_internal(pResampler.getPointer(), pFramesIn.getPointer(), pFrameCountIn.getPointer(), pFramesOut.getPointer(), pFrameCountOut.getPointer()));
    }

    public static native int ma_linear_resampler_process_pcm_frames_internal(long pResampler, long pFramesIn, long pFrameCountIn, long pFramesOut, long pFrameCountOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_process_pcm_frames((ma_linear_resampler *)pResampler, (const void *)pFramesIn, (ma_uint64 *)pFrameCountIn, (void *)pFramesOut, (ma_uint64 *)pFrameCountOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_set_rate(ma_linear_resampler.ma_linear_resamplerPointer pResampler, long sampleRateIn, long sampleRateOut) {
        return ma_result.getByIndex((int) ma_linear_resampler_set_rate_internal(pResampler.getPointer(), sampleRateIn, sampleRateOut));
    }

    public static native int ma_linear_resampler_set_rate_internal(long pResampler, long sampleRateIn, long sampleRateOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 1, return 0);
    	return (jint)ma_linear_resampler_set_rate((ma_linear_resampler *)pResampler, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_set_rate_ratio(ma_linear_resampler.ma_linear_resamplerPointer pResampler, float ratioInOut) {
        return ma_result.getByIndex((int) ma_linear_resampler_set_rate_ratio_internal(pResampler.getPointer(), ratioInOut));
    }

    public static native int ma_linear_resampler_set_rate_ratio_internal(long pResampler, float ratioInOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_set_rate_ratio((ma_linear_resampler *)pResampler, (float)ratioInOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_linear_resampler_get_input_latency(ma_linear_resampler.ma_linear_resamplerPointer pResampler) {
        return ma_linear_resampler_get_input_latency_internal(pResampler.getPointer());
    }

    public static native long ma_linear_resampler_get_input_latency_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_linear_resampler_get_input_latency((const ma_linear_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_linear_resampler_get_output_latency(ma_linear_resampler.ma_linear_resamplerPointer pResampler) {
        return ma_linear_resampler_get_output_latency_internal(pResampler.getPointer());
    }

    public static native long ma_linear_resampler_get_output_latency_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_linear_resampler_get_output_latency((const ma_linear_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_get_required_input_frame_count(ma_linear_resampler.ma_linear_resamplerPointer pResampler, long outputFrameCount, UInt64Pointer pInputFrameCount) {
        return ma_result.getByIndex((int) ma_linear_resampler_get_required_input_frame_count_internal(pResampler.getPointer(), outputFrameCount, pInputFrameCount.getPointer()));
    }

    public static native int ma_linear_resampler_get_required_input_frame_count_internal(long pResampler, long outputFrameCount, long pInputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, outputFrameCount, 1, return 0);
    	return (jint)ma_linear_resampler_get_required_input_frame_count((const ma_linear_resampler *)pResampler, (ma_uint64)outputFrameCount, (ma_uint64 *)pInputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_get_expected_output_frame_count(ma_linear_resampler.ma_linear_resamplerPointer pResampler, long inputFrameCount, UInt64Pointer pOutputFrameCount) {
        return ma_result.getByIndex((int) ma_linear_resampler_get_expected_output_frame_count_internal(pResampler.getPointer(), inputFrameCount, pOutputFrameCount.getPointer()));
    }

    public static native int ma_linear_resampler_get_expected_output_frame_count_internal(long pResampler, long inputFrameCount, long pOutputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, inputFrameCount, 1, return 0);
    	return (jint)ma_linear_resampler_get_expected_output_frame_count((const ma_linear_resampler *)pResampler, (ma_uint64)inputFrameCount, (ma_uint64 *)pOutputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_linear_resampler_reset(ma_linear_resampler.ma_linear_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_linear_resampler_reset_internal(pResampler.getPointer()));
    }

    public static native int ma_linear_resampler_reset_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_linear_resampler_reset((ma_linear_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_resampler_config ma_resampler_config_init(ma_format format, long channels, long sampleRateIn, long sampleRateOut, ma_resample_algorithm algorithm) {
        return new ma_resampler_config(ma_resampler_config_init_internal(format.getIndex(), channels, sampleRateIn, sampleRateOut, algorithm.getIndex(), 0), true);
    }

    public static void ma_resampler_config_init(ma_format format, long channels, long sampleRateIn, long sampleRateOut, ma_resample_algorithm algorithm, ma_resampler_config _retPar) {
        ma_resampler_config_init_internal(format.getIndex(), channels, sampleRateIn, sampleRateOut, algorithm.getIndex(), _retPar.getPointer());
    }

    public static native long ma_resampler_config_init_internal(int format, long channels, long sampleRateIn, long sampleRateOut, int algorithm, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_resampler_config* _ret = (ma_resampler_config*) (_retPar == 0 ? malloc(sizeof(ma_resampler_config)) : (void*)_retPar);
    	*_ret = ma_resampler_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut, (ma_resample_algorithm)algorithm);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_get_heap_size(ma_resampler_config.ma_resampler_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_resampler_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_resampler_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_get_heap_size((const ma_resampler_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_init_preallocated(ma_resampler_config.ma_resampler_configPointer pConfig, VoidPointer pHeap, ma_resampler.ma_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_resampler_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pResampler.getPointer()));
    }

    public static native int ma_resampler_init_preallocated_internal(long pConfig, long pHeap, long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_init_preallocated((const ma_resampler_config *)pConfig, (void *)pHeap, (ma_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_init(ma_resampler_config.ma_resampler_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_resampler.ma_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_resampler_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pResampler.getPointer()));
    }

    public static native int ma_resampler_init_internal(long pConfig, long pAllocationCallbacks, long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_init((const ma_resampler_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_resampler_uninit(ma_resampler.ma_resamplerPointer pResampler, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_resampler_uninit_internal(pResampler.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_resampler_uninit_internal(long pResampler, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_resampler_uninit((ma_resampler *)pResampler, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_resampler_process_pcm_frames(ma_resampler.ma_resamplerPointer pResampler, VoidPointer pFramesIn, UInt64Pointer pFrameCountIn, VoidPointer pFramesOut, UInt64Pointer pFrameCountOut) {
        return ma_result.getByIndex((int) ma_resampler_process_pcm_frames_internal(pResampler.getPointer(), pFramesIn.getPointer(), pFrameCountIn.getPointer(), pFramesOut.getPointer(), pFrameCountOut.getPointer()));
    }

    public static native int ma_resampler_process_pcm_frames_internal(long pResampler, long pFramesIn, long pFrameCountIn, long pFramesOut, long pFrameCountOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_process_pcm_frames((ma_resampler *)pResampler, (const void *)pFramesIn, (ma_uint64 *)pFrameCountIn, (void *)pFramesOut, (ma_uint64 *)pFrameCountOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_set_rate(ma_resampler.ma_resamplerPointer pResampler, long sampleRateIn, long sampleRateOut) {
        return ma_result.getByIndex((int) ma_resampler_set_rate_internal(pResampler.getPointer(), sampleRateIn, sampleRateOut));
    }

    public static native int ma_resampler_set_rate_internal(long pResampler, long sampleRateIn, long sampleRateOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 1, return 0);
    	return (jint)ma_resampler_set_rate((ma_resampler *)pResampler, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_set_rate_ratio(ma_resampler.ma_resamplerPointer pResampler, float ratio) {
        return ma_result.getByIndex((int) ma_resampler_set_rate_ratio_internal(pResampler.getPointer(), ratio));
    }

    public static native int ma_resampler_set_rate_ratio_internal(long pResampler, float ratio);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_set_rate_ratio((ma_resampler *)pResampler, (float)ratio);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_resampler_get_input_latency(ma_resampler.ma_resamplerPointer pResampler) {
        return ma_resampler_get_input_latency_internal(pResampler.getPointer());
    }

    public static native long ma_resampler_get_input_latency_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resampler_get_input_latency((const ma_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_resampler_get_output_latency(ma_resampler.ma_resamplerPointer pResampler) {
        return ma_resampler_get_output_latency_internal(pResampler.getPointer());
    }

    public static native long ma_resampler_get_output_latency_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resampler_get_output_latency((const ma_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_get_required_input_frame_count(ma_resampler.ma_resamplerPointer pResampler, long outputFrameCount, UInt64Pointer pInputFrameCount) {
        return ma_result.getByIndex((int) ma_resampler_get_required_input_frame_count_internal(pResampler.getPointer(), outputFrameCount, pInputFrameCount.getPointer()));
    }

    public static native int ma_resampler_get_required_input_frame_count_internal(long pResampler, long outputFrameCount, long pInputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, outputFrameCount, 1, return 0);
    	return (jint)ma_resampler_get_required_input_frame_count((const ma_resampler *)pResampler, (ma_uint64)outputFrameCount, (ma_uint64 *)pInputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_get_expected_output_frame_count(ma_resampler.ma_resamplerPointer pResampler, long inputFrameCount, UInt64Pointer pOutputFrameCount) {
        return ma_result.getByIndex((int) ma_resampler_get_expected_output_frame_count_internal(pResampler.getPointer(), inputFrameCount, pOutputFrameCount.getPointer()));
    }

    public static native int ma_resampler_get_expected_output_frame_count_internal(long pResampler, long inputFrameCount, long pOutputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, inputFrameCount, 1, return 0);
    	return (jint)ma_resampler_get_expected_output_frame_count((const ma_resampler *)pResampler, (ma_uint64)inputFrameCount, (ma_uint64 *)pOutputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resampler_reset(ma_resampler.ma_resamplerPointer pResampler) {
        return ma_result.getByIndex((int) ma_resampler_reset_internal(pResampler.getPointer()));
    }

    public static native int ma_resampler_reset_internal(long pResampler);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resampler_reset((ma_resampler *)pResampler);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_channel_converter_config ma_channel_converter_config_init(ma_format format, long channelsIn, UBytePointer pChannelMapIn, long channelsOut, UBytePointer pChannelMapOut, ma_channel_mix_mode mixingMode) {
        return new ma_channel_converter_config(ma_channel_converter_config_init_internal(format.getIndex(), channelsIn, pChannelMapIn.getPointer(), channelsOut, pChannelMapOut.getPointer(), mixingMode.getIndex(), 0), true);
    }

    public static void ma_channel_converter_config_init(ma_format format, long channelsIn, UBytePointer pChannelMapIn, long channelsOut, UBytePointer pChannelMapOut, ma_channel_mix_mode mixingMode, ma_channel_converter_config _retPar) {
        ma_channel_converter_config_init_internal(format.getIndex(), channelsIn, pChannelMapIn.getPointer(), channelsOut, pChannelMapOut.getPointer(), mixingMode.getIndex(), _retPar.getPointer());
    }

    public static native long ma_channel_converter_config_init_internal(int format, long channelsIn, long pChannelMapIn, long channelsOut, long pChannelMapOut, int mixingMode, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsOut, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsIn, 1, return 0);
    	ma_channel_converter_config* _ret = (ma_channel_converter_config*) (_retPar == 0 ? malloc(sizeof(ma_channel_converter_config)) : (void*)_retPar);
    	*_ret = ma_channel_converter_config_init((ma_format)format, (ma_uint32)channelsIn, (const ma_channel *)pChannelMapIn, (ma_uint32)channelsOut, (const ma_channel *)pChannelMapOut, (ma_channel_mix_mode)mixingMode);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_channel_converter_get_heap_size(ma_channel_converter_config.ma_channel_converter_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_channel_converter_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_channel_converter_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_channel_converter_get_heap_size((const ma_channel_converter_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_channel_converter_init_preallocated(ma_channel_converter_config.ma_channel_converter_configPointer pConfig, VoidPointer pHeap, ma_channel_converter.ma_channel_converterPointer pConverter) {
        return ma_result.getByIndex((int) ma_channel_converter_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pConverter.getPointer()));
    }

    public static native int ma_channel_converter_init_preallocated_internal(long pConfig, long pHeap, long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_channel_converter_init_preallocated((const ma_channel_converter_config *)pConfig, (void *)pHeap, (ma_channel_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_channel_converter_init(ma_channel_converter_config.ma_channel_converter_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_channel_converter.ma_channel_converterPointer pConverter) {
        return ma_result.getByIndex((int) ma_channel_converter_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pConverter.getPointer()));
    }

    public static native int ma_channel_converter_init_internal(long pConfig, long pAllocationCallbacks, long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_channel_converter_init((const ma_channel_converter_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_channel_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_channel_converter_uninit(ma_channel_converter.ma_channel_converterPointer pConverter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_channel_converter_uninit_internal(pConverter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_channel_converter_uninit_internal(long pConverter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_channel_converter_uninit((ma_channel_converter *)pConverter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_channel_converter_process_pcm_frames(ma_channel_converter.ma_channel_converterPointer pConverter, VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount) {
        return ma_result.getByIndex((int) ma_channel_converter_process_pcm_frames_internal(pConverter.getPointer(), pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount));
    }

    public static native int ma_channel_converter_process_pcm_frames_internal(long pConverter, long pFramesOut, long pFramesIn, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_channel_converter_process_pcm_frames((ma_channel_converter *)pConverter, (void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_channel_converter_get_input_channel_map(ma_channel_converter.ma_channel_converterPointer pConverter, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_channel_converter_get_input_channel_map_internal(pConverter.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_channel_converter_get_input_channel_map_internal(long pConverter, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 2, return 0);
    	return (jint)ma_channel_converter_get_input_channel_map((const ma_channel_converter *)pConverter, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_channel_converter_get_output_channel_map(ma_channel_converter.ma_channel_converterPointer pConverter, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_channel_converter_get_output_channel_map_internal(pConverter.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_channel_converter_get_output_channel_map_internal(long pConverter, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 2, return 0);
    	return (jint)ma_channel_converter_get_output_channel_map((const ma_channel_converter *)pConverter, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_data_converter_config ma_data_converter_config_init_default() {
        return new ma_data_converter_config(ma_data_converter_config_init_default_internal(0), true);
    }

    public static void ma_data_converter_config_init_default(ma_data_converter_config _retPar) {
        ma_data_converter_config_init_default_internal(_retPar.getPointer());
    }

    public static native long ma_data_converter_config_init_default_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_converter_config* _ret = (ma_data_converter_config*) (_retPar == 0 ? malloc(sizeof(ma_data_converter_config)) : (void*)_retPar);
    	*_ret = ma_data_converter_config_init_default();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_data_converter_config ma_data_converter_config_init(ma_format formatIn, ma_format formatOut, long channelsIn, long channelsOut, long sampleRateIn, long sampleRateOut) {
        return new ma_data_converter_config(ma_data_converter_config_init_internal(formatIn.getIndex(), formatOut.getIndex(), channelsIn, channelsOut, sampleRateIn, sampleRateOut, 0), true);
    }

    public static void ma_data_converter_config_init(ma_format formatIn, ma_format formatOut, long channelsIn, long channelsOut, long sampleRateIn, long sampleRateOut, ma_data_converter_config _retPar) {
        ma_data_converter_config_init_internal(formatIn.getIndex(), formatOut.getIndex(), channelsIn, channelsOut, sampleRateIn, sampleRateOut, _retPar.getPointer());
    }

    public static native long ma_data_converter_config_init_internal(int formatIn, int formatOut, long channelsIn, long channelsOut, long sampleRateIn, long sampleRateOut, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 5, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsOut, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsIn, 2, return 0);
    	ma_data_converter_config* _ret = (ma_data_converter_config*) (_retPar == 0 ? malloc(sizeof(ma_data_converter_config)) : (void*)_retPar);
    	*_ret = ma_data_converter_config_init((ma_format)formatIn, (ma_format)formatOut, (ma_uint32)channelsIn, (ma_uint32)channelsOut, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_get_heap_size(ma_data_converter_config.ma_data_converter_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_data_converter_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_data_converter_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_get_heap_size((const ma_data_converter_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_init_preallocated(ma_data_converter_config.ma_data_converter_configPointer pConfig, VoidPointer pHeap, ma_data_converter.ma_data_converterPointer pConverter) {
        return ma_result.getByIndex((int) ma_data_converter_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pConverter.getPointer()));
    }

    public static native int ma_data_converter_init_preallocated_internal(long pConfig, long pHeap, long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_init_preallocated((const ma_data_converter_config *)pConfig, (void *)pHeap, (ma_data_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_init(ma_data_converter_config.ma_data_converter_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_data_converter.ma_data_converterPointer pConverter) {
        return ma_result.getByIndex((int) ma_data_converter_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pConverter.getPointer()));
    }

    public static native int ma_data_converter_init_internal(long pConfig, long pAllocationCallbacks, long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_init((const ma_data_converter_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_data_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_data_converter_uninit(ma_data_converter.ma_data_converterPointer pConverter, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_data_converter_uninit_internal(pConverter.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_data_converter_uninit_internal(long pConverter, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_converter_uninit((ma_data_converter *)pConverter, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_data_converter_process_pcm_frames(ma_data_converter.ma_data_converterPointer pConverter, VoidPointer pFramesIn, UInt64Pointer pFrameCountIn, VoidPointer pFramesOut, UInt64Pointer pFrameCountOut) {
        return ma_result.getByIndex((int) ma_data_converter_process_pcm_frames_internal(pConverter.getPointer(), pFramesIn.getPointer(), pFrameCountIn.getPointer(), pFramesOut.getPointer(), pFrameCountOut.getPointer()));
    }

    public static native int ma_data_converter_process_pcm_frames_internal(long pConverter, long pFramesIn, long pFrameCountIn, long pFramesOut, long pFrameCountOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_process_pcm_frames((ma_data_converter *)pConverter, (const void *)pFramesIn, (ma_uint64 *)pFrameCountIn, (void *)pFramesOut, (ma_uint64 *)pFrameCountOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_set_rate(ma_data_converter.ma_data_converterPointer pConverter, long sampleRateIn, long sampleRateOut) {
        return ma_result.getByIndex((int) ma_data_converter_set_rate_internal(pConverter.getPointer(), sampleRateIn, sampleRateOut));
    }

    public static native int ma_data_converter_set_rate_internal(long pConverter, long sampleRateIn, long sampleRateOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 1, return 0);
    	return (jint)ma_data_converter_set_rate((ma_data_converter *)pConverter, (ma_uint32)sampleRateIn, (ma_uint32)sampleRateOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_set_rate_ratio(ma_data_converter.ma_data_converterPointer pConverter, float ratioInOut) {
        return ma_result.getByIndex((int) ma_data_converter_set_rate_ratio_internal(pConverter.getPointer(), ratioInOut));
    }

    public static native int ma_data_converter_set_rate_ratio_internal(long pConverter, float ratioInOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_set_rate_ratio((ma_data_converter *)pConverter, (float)ratioInOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_data_converter_get_input_latency(ma_data_converter.ma_data_converterPointer pConverter) {
        return ma_data_converter_get_input_latency_internal(pConverter.getPointer());
    }

    public static native long ma_data_converter_get_input_latency_internal(long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_converter_get_input_latency((const ma_data_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_data_converter_get_output_latency(ma_data_converter.ma_data_converterPointer pConverter) {
        return ma_data_converter_get_output_latency_internal(pConverter.getPointer());
    }

    public static native long ma_data_converter_get_output_latency_internal(long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_converter_get_output_latency((const ma_data_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_get_required_input_frame_count(ma_data_converter.ma_data_converterPointer pConverter, long outputFrameCount, UInt64Pointer pInputFrameCount) {
        return ma_result.getByIndex((int) ma_data_converter_get_required_input_frame_count_internal(pConverter.getPointer(), outputFrameCount, pInputFrameCount.getPointer()));
    }

    public static native int ma_data_converter_get_required_input_frame_count_internal(long pConverter, long outputFrameCount, long pInputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, outputFrameCount, 1, return 0);
    	return (jint)ma_data_converter_get_required_input_frame_count((const ma_data_converter *)pConverter, (ma_uint64)outputFrameCount, (ma_uint64 *)pInputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_get_expected_output_frame_count(ma_data_converter.ma_data_converterPointer pConverter, long inputFrameCount, UInt64Pointer pOutputFrameCount) {
        return ma_result.getByIndex((int) ma_data_converter_get_expected_output_frame_count_internal(pConverter.getPointer(), inputFrameCount, pOutputFrameCount.getPointer()));
    }

    public static native int ma_data_converter_get_expected_output_frame_count_internal(long pConverter, long inputFrameCount, long pOutputFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, inputFrameCount, 1, return 0);
    	return (jint)ma_data_converter_get_expected_output_frame_count((const ma_data_converter *)pConverter, (ma_uint64)inputFrameCount, (ma_uint64 *)pOutputFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_get_input_channel_map(ma_data_converter.ma_data_converterPointer pConverter, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_data_converter_get_input_channel_map_internal(pConverter.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_data_converter_get_input_channel_map_internal(long pConverter, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 2, return 0);
    	return (jint)ma_data_converter_get_input_channel_map((const ma_data_converter *)pConverter, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_get_output_channel_map(ma_data_converter.ma_data_converterPointer pConverter, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_data_converter_get_output_channel_map_internal(pConverter.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_data_converter_get_output_channel_map_internal(long pConverter, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 2, return 0);
    	return (jint)ma_data_converter_get_output_channel_map((const ma_data_converter *)pConverter, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_converter_reset(ma_data_converter.ma_data_converterPointer pConverter) {
        return ma_result.getByIndex((int) ma_data_converter_reset_internal(pConverter.getPointer()));
    }

    public static native int ma_data_converter_reset_internal(long pConverter);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_converter_reset((ma_data_converter *)pConverter);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * ********************************************************************************************************************************************************
     * Format Conversion
     * *********************************************************************************************************************************************************
     */
    public static void ma_pcm_u8_to_s16(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_u8_to_s16_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_u8_to_s16_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_u8_to_s16((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_u8_to_s24(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_u8_to_s24_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_u8_to_s24_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_u8_to_s24((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_u8_to_s32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_u8_to_s32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_u8_to_s32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_u8_to_s32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_u8_to_f32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_u8_to_f32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_u8_to_f32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_u8_to_f32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s16_to_u8(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s16_to_u8_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s16_to_u8_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s16_to_u8((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s16_to_s24(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s16_to_s24_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s16_to_s24_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s16_to_s24((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s16_to_s32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s16_to_s32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s16_to_s32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s16_to_s32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s16_to_f32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s16_to_f32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s16_to_f32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s16_to_f32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s24_to_u8(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s24_to_u8_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s24_to_u8_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s24_to_u8((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s24_to_s16(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s24_to_s16_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s24_to_s16_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s24_to_s16((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s24_to_s32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s24_to_s32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s24_to_s32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s24_to_s32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s24_to_f32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s24_to_f32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s24_to_f32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s24_to_f32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s32_to_u8(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s32_to_u8_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s32_to_u8_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s32_to_u8((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s32_to_s16(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s32_to_s16_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s32_to_s16_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s32_to_s16((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s32_to_s24(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s32_to_s24_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s32_to_s24_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s32_to_s24((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_s32_to_f32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_s32_to_f32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_s32_to_f32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_s32_to_f32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_f32_to_u8(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_f32_to_u8_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_f32_to_u8_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_f32_to_u8((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_f32_to_s16(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_f32_to_s16_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_f32_to_s16_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_f32_to_s16((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_f32_to_s24(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_f32_to_s24_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_f32_to_s24_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_f32_to_s24((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_f32_to_s32(VoidPointer pOut, VoidPointer pIn, long count, ma_dither_mode ditherMode) {
        ma_pcm_f32_to_s32_internal(pOut.getPointer(), pIn.getPointer(), count, ditherMode.getIndex());
    }

    public static native void ma_pcm_f32_to_s32_internal(long pOut, long pIn, long count, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_pcm_f32_to_s32((void *)pOut, (const void *)pIn, (ma_uint64)count, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_convert(VoidPointer pOut, ma_format formatOut, VoidPointer pIn, ma_format formatIn, long sampleCount, ma_dither_mode ditherMode) {
        ma_pcm_convert_internal(pOut.getPointer(), formatOut.getIndex(), pIn.getPointer(), formatIn.getIndex(), sampleCount, ditherMode.getIndex());
    }

    public static native void ma_pcm_convert_internal(long pOut, int formatOut, long pIn, int formatIn, long sampleCount, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 4, return);
    	ma_pcm_convert((void *)pOut, (ma_format)formatOut, (const void *)pIn, (ma_format)formatIn, (ma_uint64)sampleCount, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_convert_pcm_frames_format(VoidPointer pOut, ma_format formatOut, VoidPointer pIn, ma_format formatIn, long frameCount, long channels, ma_dither_mode ditherMode) {
        ma_convert_pcm_frames_format_internal(pOut.getPointer(), formatOut.getIndex(), pIn.getPointer(), formatIn.getIndex(), frameCount, channels, ditherMode.getIndex());
    }

    public static native void ma_convert_pcm_frames_format_internal(long pOut, int formatOut, long pIn, int formatIn, long frameCount, long channels, int ditherMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 5, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 4, return);
    	ma_convert_pcm_frames_format((void *)pOut, (ma_format)formatOut, (const void *)pIn, (ma_format)formatIn, (ma_uint64)frameCount, (ma_uint32)channels, (ma_dither_mode)ditherMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_deinterleave_pcm_frames(ma_format format, long channels, long frameCount, VoidPointer pInterleavedPCMFrames, PointerPointer<VoidPointer> ppDeinterleavedPCMFrames) {
        ma_deinterleave_pcm_frames_internal(format.getIndex(), channels, frameCount, pInterleavedPCMFrames.getPointer(), ppDeinterleavedPCMFrames.getPointer());
    }

    public static native void ma_deinterleave_pcm_frames_internal(int format, long channels, long frameCount, long pInterleavedPCMFrames, long ppDeinterleavedPCMFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return);
    	ma_deinterleave_pcm_frames((ma_format)format, (ma_uint32)channels, (ma_uint64)frameCount, (const void *)pInterleavedPCMFrames, (void **)ppDeinterleavedPCMFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_interleave_pcm_frames(ma_format format, long channels, long frameCount, PointerPointer<VoidPointer> ppDeinterleavedPCMFrames, VoidPointer pInterleavedPCMFrames) {
        ma_interleave_pcm_frames_internal(format.getIndex(), channels, frameCount, ppDeinterleavedPCMFrames.getPointer(), pInterleavedPCMFrames.getPointer());
    }

    public static native void ma_interleave_pcm_frames_internal(int format, long channels, long frameCount, long ppDeinterleavedPCMFrames, long pInterleavedPCMFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return);
    	ma_interleave_pcm_frames((ma_format)format, (ma_uint32)channels, (ma_uint64)frameCount, (const void **)ppDeinterleavedPCMFrames, (void *)pInterleavedPCMFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static char ma_channel_map_get_channel(UBytePointer pChannelMap, long channelCount, long channelIndex) {
        return ma_channel_map_get_channel_internal(pChannelMap.getPointer(), channelCount, channelIndex);
    }

    public static native char ma_channel_map_get_channel_internal(long pChannelMap, long channelCount, long channelIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelIndex, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelCount, 1, return 0);
    	return (jchar)ma_channel_map_get_channel((const ma_channel *)pChannelMap, (ma_uint32)channelCount, (ma_uint32)channelIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_channel_map_init_blank(UBytePointer pChannelMap, long channels) {
        ma_channel_map_init_blank_internal(pChannelMap.getPointer(), channels);
    }

    public static native void ma_channel_map_init_blank_internal(long pChannelMap, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return);
    	ma_channel_map_init_blank((ma_channel *)pChannelMap, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_channel_map_init_standard(ma_standard_channel_map standardChannelMap, UBytePointer pChannelMap, long channelMapCap, long channels) {
        ma_channel_map_init_standard_internal(standardChannelMap.getIndex(), pChannelMap.getPointer(), channelMapCap, channels);
    }

    public static native void ma_channel_map_init_standard_internal(int standardChannelMap, long pChannelMap, long channelMapCap, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 2, return);
    	ma_channel_map_init_standard((ma_standard_channel_map)standardChannelMap, (ma_channel *)pChannelMap, (size_t)channelMapCap, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_channel_map_copy(UBytePointer pOut, UBytePointer pIn, long channels) {
        ma_channel_map_copy_internal(pOut.getPointer(), pIn.getPointer(), channels);
    }

    public static native void ma_channel_map_copy_internal(long pOut, long pIn, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	ma_channel_map_copy((ma_channel *)pOut, (const ma_channel *)pIn, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_channel_map_copy_or_default(UBytePointer pOut, long channelMapCapOut, UBytePointer pIn, long channels) {
        ma_channel_map_copy_or_default_internal(pOut.getPointer(), channelMapCapOut, pIn.getPointer(), channels);
    }

    public static native void ma_channel_map_copy_or_default_internal(long pOut, long channelMapCapOut, long pIn, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCapOut, 1, return);
    	ma_channel_map_copy_or_default((ma_channel *)pOut, (size_t)channelMapCapOut, (const ma_channel *)pIn, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_channel_map_is_valid(UBytePointer pChannelMap, long channels) {
        return ma_channel_map_is_valid_internal(pChannelMap.getPointer(), channels);
    }

    public static native long ma_channel_map_is_valid_internal(long pChannelMap, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jlong)ma_channel_map_is_valid((const ma_channel *)pChannelMap, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_channel_map_is_equal(UBytePointer pChannelMapA, UBytePointer pChannelMapB, long channels) {
        return ma_channel_map_is_equal_internal(pChannelMapA.getPointer(), pChannelMapB.getPointer(), channels);
    }

    public static native long ma_channel_map_is_equal_internal(long pChannelMapA, long pChannelMapB, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return 0);
    	return (jlong)ma_channel_map_is_equal((const ma_channel *)pChannelMapA, (const ma_channel *)pChannelMapB, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_channel_map_is_blank(UBytePointer pChannelMap, long channels) {
        return ma_channel_map_is_blank_internal(pChannelMap.getPointer(), channels);
    }

    public static native long ma_channel_map_is_blank_internal(long pChannelMap, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jlong)ma_channel_map_is_blank((const ma_channel *)pChannelMap, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_channel_map_contains_channel_position(long channels, UBytePointer pChannelMap, char channelPosition) {
        return ma_channel_map_contains_channel_position_internal(channels, pChannelMap.getPointer(), channelPosition);
    }

    public static native long ma_channel_map_contains_channel_position_internal(long channels, long pChannelMap, char channelPosition);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_channel, channelPosition, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	return (jlong)ma_channel_map_contains_channel_position((ma_uint32)channels, (const ma_channel *)pChannelMap, (ma_channel)channelPosition);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_channel_map_find_channel_position(long channels, UBytePointer pChannelMap, char channelPosition, UIntPointer pChannelIndex) {
        return ma_channel_map_find_channel_position_internal(channels, pChannelMap.getPointer(), channelPosition, pChannelIndex.getPointer());
    }

    public static native long ma_channel_map_find_channel_position_internal(long channels, long pChannelMap, char channelPosition, long pChannelIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_channel, channelPosition, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	return (jlong)ma_channel_map_find_channel_position((ma_uint32)channels, (const ma_channel *)pChannelMap, (ma_channel)channelPosition, (ma_uint32 *)pChannelIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_channel_map_to_string(UBytePointer pChannelMap, long channels, BytePointer pBufferOut, long bufferCap) {
        return ma_channel_map_to_string_internal(pChannelMap.getPointer(), channels, pBufferOut.getPointer(), bufferCap);
    }

    public static native long ma_channel_map_to_string_internal(long pChannelMap, long channels, long pBufferOut, long bufferCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, bufferCap, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jlong)ma_channel_map_to_string((const ma_channel *)pChannelMap, (ma_uint32)channels, (char *)pBufferOut, (size_t)bufferCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static BytePointer ma_channel_position_to_string(char channel) {
        return new BytePointer(ma_channel_position_to_string_internal(channel), false);
    }

    public static void ma_channel_position_to_string(char channel, BytePointer _retPar) {
        _retPar.setPointer(ma_channel_position_to_string_internal(channel));
    }

    public static native long ma_channel_position_to_string_internal(char channel);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_channel, channel, 0, return 0);
    	return (jlong)ma_channel_position_to_string((ma_channel)channel);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * ********************************************************************************************************************************************************
     * Conversion Helpers
     * *********************************************************************************************************************************************************
     */
    public static long ma_convert_frames(VoidPointer pOut, long frameCountOut, ma_format formatOut, long channelsOut, long sampleRateOut, VoidPointer pIn, long frameCountIn, ma_format formatIn, long channelsIn, long sampleRateIn) {
        return ma_convert_frames_internal(pOut.getPointer(), frameCountOut, formatOut.getIndex(), channelsOut, sampleRateOut, pIn.getPointer(), frameCountIn, formatIn.getIndex(), channelsIn, sampleRateIn);
    }

    public static native long ma_convert_frames_internal(long pOut, long frameCountOut, int formatOut, long channelsOut, long sampleRateOut, long pIn, long frameCountIn, int formatIn, long channelsIn, long sampleRateIn);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateIn, 9, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsIn, 8, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCountIn, 6, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRateOut, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channelsOut, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCountOut, 1, return 0);
    	return (jlong)ma_convert_frames((void *)pOut, (ma_uint64)frameCountOut, (ma_format)formatOut, (ma_uint32)channelsOut, (ma_uint32)sampleRateOut, (const void *)pIn, (ma_uint64)frameCountIn, (ma_format)formatIn, (ma_uint32)channelsIn, (ma_uint32)sampleRateIn);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_convert_frames_ex(VoidPointer pOut, long frameCountOut, VoidPointer pIn, long frameCountIn, ma_data_converter_config.ma_data_converter_configPointer pConfig) {
        return ma_convert_frames_ex_internal(pOut.getPointer(), frameCountOut, pIn.getPointer(), frameCountIn, pConfig.getPointer());
    }

    public static native long ma_convert_frames_ex_internal(long pOut, long frameCountOut, long pIn, long frameCountIn, long pConfig);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCountIn, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCountOut, 1, return 0);
    	return (jlong)ma_convert_frames_ex((void *)pOut, (ma_uint64)frameCountOut, (const void *)pIn, (ma_uint64)frameCountIn, (const ma_data_converter_config *)pConfig);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_data_source_config ma_data_source_config_init() {
        return new ma_data_source_config(ma_data_source_config_init_internal(0), true);
    }

    public static void ma_data_source_config_init(ma_data_source_config _retPar) {
        ma_data_source_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_data_source_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_config* _ret = (ma_data_source_config*) (_retPar == 0 ? malloc(sizeof(ma_data_source_config)) : (void*)_retPar);
    	*_ret = ma_data_source_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_init(ma_data_source_config.ma_data_source_configPointer pConfig, VoidPointer pDataSource) {
        return ma_result.getByIndex((int) ma_data_source_init_internal(pConfig.getPointer(), pDataSource.getPointer()));
    }

    public static native int ma_data_source_init_internal(long pConfig, long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_init((const ma_data_source_config *)pConfig, (ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_data_source_uninit(VoidPointer pDataSource) {
        ma_data_source_uninit_internal(pDataSource.getPointer());
    }

    public static native void ma_data_source_uninit_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_uninit((ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_data_source_read_pcm_frames(VoidPointer pDataSource, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_data_source_read_pcm_frames_internal(pDataSource.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_data_source_read_pcm_frames_internal(long pDataSource, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_data_source_read_pcm_frames((ma_data_source *)pDataSource, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_seek_pcm_frames(VoidPointer pDataSource, long frameCount, UInt64Pointer pFramesSeeked) {
        return ma_result.getByIndex((int) ma_data_source_seek_pcm_frames_internal(pDataSource.getPointer(), frameCount, pFramesSeeked.getPointer()));
    }

    public static native int ma_data_source_seek_pcm_frames_internal(long pDataSource, long frameCount, long pFramesSeeked);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return 0);
    	return (jint)ma_data_source_seek_pcm_frames((ma_data_source *)pDataSource, (ma_uint64)frameCount, (ma_uint64 *)pFramesSeeked);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_seek_to_pcm_frame(VoidPointer pDataSource, long frameIndex) {
        return ma_result.getByIndex((int) ma_data_source_seek_to_pcm_frame_internal(pDataSource.getPointer(), frameIndex));
    }

    public static native int ma_data_source_seek_to_pcm_frame_internal(long pDataSource, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_data_source_seek_to_pcm_frame((ma_data_source *)pDataSource, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_seek_seconds(VoidPointer pDataSource, float secondCount, FloatPointer pSecondsSeeked) {
        return ma_result.getByIndex((int) ma_data_source_seek_seconds_internal(pDataSource.getPointer(), secondCount, pSecondsSeeked.getPointer()));
    }

    public static native int ma_data_source_seek_seconds_internal(long pDataSource, float secondCount, long pSecondsSeeked);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_seek_seconds((ma_data_source *)pDataSource, (float)secondCount, (float *)pSecondsSeeked);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_seek_to_second(VoidPointer pDataSource, float seekPointInSeconds) {
        return ma_result.getByIndex((int) ma_data_source_seek_to_second_internal(pDataSource.getPointer(), seekPointInSeconds));
    }

    public static native int ma_data_source_seek_to_second_internal(long pDataSource, float seekPointInSeconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_seek_to_second((ma_data_source *)pDataSource, (float)seekPointInSeconds);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_get_data_format(VoidPointer pDataSource, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_data_source_get_data_format_internal(pDataSource.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_data_source_get_data_format_internal(long pDataSource, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_data_source_get_data_format((ma_data_source *)pDataSource, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_get_cursor_in_pcm_frames(VoidPointer pDataSource, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_data_source_get_cursor_in_pcm_frames_internal(pDataSource.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_data_source_get_cursor_in_pcm_frames_internal(long pDataSource, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_get_cursor_in_pcm_frames((ma_data_source *)pDataSource, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_get_length_in_pcm_frames(VoidPointer pDataSource, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_data_source_get_length_in_pcm_frames_internal(pDataSource.getPointer(), pLength.getPointer()));
    }

    public static native int ma_data_source_get_length_in_pcm_frames_internal(long pDataSource, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_get_length_in_pcm_frames((ma_data_source *)pDataSource, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_get_cursor_in_seconds(VoidPointer pDataSource, FloatPointer pCursor) {
        return ma_result.getByIndex((int) ma_data_source_get_cursor_in_seconds_internal(pDataSource.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_data_source_get_cursor_in_seconds_internal(long pDataSource, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_get_cursor_in_seconds((ma_data_source *)pDataSource, (float *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_get_length_in_seconds(VoidPointer pDataSource, FloatPointer pLength) {
        return ma_result.getByIndex((int) ma_data_source_get_length_in_seconds_internal(pDataSource.getPointer(), pLength.getPointer()));
    }

    public static native int ma_data_source_get_length_in_seconds_internal(long pDataSource, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_get_length_in_seconds((ma_data_source *)pDataSource, (float *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_set_looping(VoidPointer pDataSource, long isLooping) {
        return ma_result.getByIndex((int) ma_data_source_set_looping_internal(pDataSource.getPointer(), isLooping));
    }

    public static native int ma_data_source_set_looping_internal(long pDataSource, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return 0);
    	return (jint)ma_data_source_set_looping((ma_data_source *)pDataSource, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_data_source_is_looping(VoidPointer pDataSource) {
        return ma_data_source_is_looping_internal(pDataSource.getPointer());
    }

    public static native long ma_data_source_is_looping_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_source_is_looping((const ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_set_range_in_pcm_frames(VoidPointer pDataSource, long rangeBegInFrames, long rangeEndInFrames) {
        return ma_result.getByIndex((int) ma_data_source_set_range_in_pcm_frames_internal(pDataSource.getPointer(), rangeBegInFrames, rangeEndInFrames));
    }

    public static native int ma_data_source_set_range_in_pcm_frames_internal(long pDataSource, long rangeBegInFrames, long rangeEndInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, rangeEndInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, rangeBegInFrames, 1, return 0);
    	return (jint)ma_data_source_set_range_in_pcm_frames((ma_data_source *)pDataSource, (ma_uint64)rangeBegInFrames, (ma_uint64)rangeEndInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_data_source_get_range_in_pcm_frames(VoidPointer pDataSource, UInt64Pointer pRangeBegInFrames, UInt64Pointer pRangeEndInFrames) {
        ma_data_source_get_range_in_pcm_frames_internal(pDataSource.getPointer(), pRangeBegInFrames.getPointer(), pRangeEndInFrames.getPointer());
    }

    public static native void ma_data_source_get_range_in_pcm_frames_internal(long pDataSource, long pRangeBegInFrames, long pRangeEndInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_get_range_in_pcm_frames((const ma_data_source *)pDataSource, (ma_uint64 *)pRangeBegInFrames, (ma_uint64 *)pRangeEndInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_data_source_set_loop_point_in_pcm_frames(VoidPointer pDataSource, long loopBegInFrames, long loopEndInFrames) {
        return ma_result.getByIndex((int) ma_data_source_set_loop_point_in_pcm_frames_internal(pDataSource.getPointer(), loopBegInFrames, loopEndInFrames));
    }

    public static native int ma_data_source_set_loop_point_in_pcm_frames_internal(long pDataSource, long loopBegInFrames, long loopEndInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, loopEndInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, loopBegInFrames, 1, return 0);
    	return (jint)ma_data_source_set_loop_point_in_pcm_frames((ma_data_source *)pDataSource, (ma_uint64)loopBegInFrames, (ma_uint64)loopEndInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_data_source_get_loop_point_in_pcm_frames(VoidPointer pDataSource, UInt64Pointer pLoopBegInFrames, UInt64Pointer pLoopEndInFrames) {
        ma_data_source_get_loop_point_in_pcm_frames_internal(pDataSource.getPointer(), pLoopBegInFrames.getPointer(), pLoopEndInFrames.getPointer());
    }

    public static native void ma_data_source_get_loop_point_in_pcm_frames_internal(long pDataSource, long pLoopBegInFrames, long pLoopEndInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_get_loop_point_in_pcm_frames((const ma_data_source *)pDataSource, (ma_uint64 *)pLoopBegInFrames, (ma_uint64 *)pLoopEndInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_data_source_set_current(VoidPointer pDataSource, VoidPointer pCurrentDataSource) {
        return ma_result.getByIndex((int) ma_data_source_set_current_internal(pDataSource.getPointer(), pCurrentDataSource.getPointer()));
    }

    public static native int ma_data_source_set_current_internal(long pDataSource, long pCurrentDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_set_current((ma_data_source *)pDataSource, (ma_data_source *)pCurrentDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_data_source_get_current(VoidPointer pDataSource) {
        return new VoidPointer(ma_data_source_get_current_internal(pDataSource.getPointer()), false);
    }

    public static void ma_data_source_get_current(VoidPointer pDataSource, VoidPointer _retPar) {
        _retPar.setPointer(ma_data_source_get_current_internal(pDataSource.getPointer()));
    }

    public static native long ma_data_source_get_current_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_source_get_current((const ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_set_next(VoidPointer pDataSource, VoidPointer pNextDataSource) {
        return ma_result.getByIndex((int) ma_data_source_set_next_internal(pDataSource.getPointer(), pNextDataSource.getPointer()));
    }

    public static native int ma_data_source_set_next_internal(long pDataSource, long pNextDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_set_next((ma_data_source *)pDataSource, (ma_data_source *)pNextDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_data_source_get_next(VoidPointer pDataSource) {
        return new VoidPointer(ma_data_source_get_next_internal(pDataSource.getPointer()), false);
    }

    public static void ma_data_source_get_next(VoidPointer pDataSource, VoidPointer _retPar) {
        _retPar.setPointer(ma_data_source_get_next_internal(pDataSource.getPointer()));
    }

    public static native long ma_data_source_get_next_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_source_get_next((const ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_set_next_callback(VoidPointer pDataSource, ClosureObject<GdxMiniaudio.ma_data_source_get_next_proc> onGetNext) {
        return ma_result.getByIndex((int) ma_data_source_set_next_callback_internal(pDataSource.getPointer(), onGetNext.getPointer()));
    }

    public static native int ma_data_source_set_next_callback_internal(long pDataSource, long onGetNext);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_set_next_callback((ma_data_source *)pDataSource, (ma_data_source_get_next_proc)onGetNext);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ClosureObject<GdxMiniaudio.ma_data_source_get_next_proc> ma_data_source_get_next_callback(VoidPointer pDataSource) {
        return CHandler.getClosureObject(ma_data_source_get_next_callback_internal(pDataSource.getPointer()), GdxMiniaudio_Internal.ma_data_source_get_next_proc_Internal::ma_data_source_get_next_proc_downcall);
    }

    public static native long ma_data_source_get_next_callback_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_source_get_next_callback((const ma_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_init(ma_format format, long channels, VoidPointer pData, long sizeInFrames, ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_init_internal(format.getIndex(), channels, pData.getPointer(), sizeInFrames, pAudioBufferRef.getPointer()));
    }

    public static native int ma_audio_buffer_ref_init_internal(int format, long channels, long pData, long sizeInFrames, long pAudioBufferRef);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sizeInFrames, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jint)ma_audio_buffer_ref_init((ma_format)format, (ma_uint32)channels, (const void *)pData, (ma_uint64)sizeInFrames, (ma_audio_buffer_ref *)pAudioBufferRef);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_audio_buffer_ref_uninit(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef) {
        ma_audio_buffer_ref_uninit_internal(pAudioBufferRef.getPointer());
    }

    public static native void ma_audio_buffer_ref_uninit_internal(long pAudioBufferRef);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_audio_buffer_ref_uninit((ma_audio_buffer_ref *)pAudioBufferRef);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_audio_buffer_ref_set_data(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, VoidPointer pData, long sizeInFrames) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_set_data_internal(pAudioBufferRef.getPointer(), pData.getPointer(), sizeInFrames));
    }

    public static native int ma_audio_buffer_ref_set_data_internal(long pAudioBufferRef, long pData, long sizeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sizeInFrames, 2, return 0);
    	return (jint)ma_audio_buffer_ref_set_data((ma_audio_buffer_ref *)pAudioBufferRef, (const void *)pData, (ma_uint64)sizeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_audio_buffer_ref_read_pcm_frames(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, VoidPointer pFramesOut, long frameCount, long loop) {
        return ma_audio_buffer_ref_read_pcm_frames_internal(pAudioBufferRef.getPointer(), pFramesOut.getPointer(), frameCount, loop);
    }

    public static native long ma_audio_buffer_ref_read_pcm_frames_internal(long pAudioBufferRef, long pFramesOut, long frameCount, long loop);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, loop, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jlong)ma_audio_buffer_ref_read_pcm_frames((ma_audio_buffer_ref *)pAudioBufferRef, (void *)pFramesOut, (ma_uint64)frameCount, (ma_bool32)loop);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_seek_to_pcm_frame(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, long frameIndex) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_seek_to_pcm_frame_internal(pAudioBufferRef.getPointer(), frameIndex));
    }

    public static native int ma_audio_buffer_ref_seek_to_pcm_frame_internal(long pAudioBufferRef, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_audio_buffer_ref_seek_to_pcm_frame((ma_audio_buffer_ref *)pAudioBufferRef, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_map(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, PointerPointer<VoidPointer> ppFramesOut, UInt64Pointer pFrameCount) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_map_internal(pAudioBufferRef.getPointer(), ppFramesOut.getPointer(), pFrameCount.getPointer()));
    }

    public static native int ma_audio_buffer_ref_map_internal(long pAudioBufferRef, long ppFramesOut, long pFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_ref_map((ma_audio_buffer_ref *)pAudioBufferRef, (void **)ppFramesOut, (ma_uint64 *)pFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_unmap(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, long frameCount) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_unmap_internal(pAudioBufferRef.getPointer(), frameCount));
    }

    public static native int ma_audio_buffer_ref_unmap_internal(long pAudioBufferRef, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return 0);
    	return (jint)ma_audio_buffer_ref_unmap((ma_audio_buffer_ref *)pAudioBufferRef, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_audio_buffer_ref_at_end(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef) {
        return ma_audio_buffer_ref_at_end_internal(pAudioBufferRef.getPointer());
    }

    public static native long ma_audio_buffer_ref_at_end_internal(long pAudioBufferRef);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_audio_buffer_ref_at_end((const ma_audio_buffer_ref *)pAudioBufferRef);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_get_cursor_in_pcm_frames(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_get_cursor_in_pcm_frames_internal(pAudioBufferRef.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_audio_buffer_ref_get_cursor_in_pcm_frames_internal(long pAudioBufferRef, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_ref_get_cursor_in_pcm_frames((const ma_audio_buffer_ref *)pAudioBufferRef, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_get_length_in_pcm_frames(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_get_length_in_pcm_frames_internal(pAudioBufferRef.getPointer(), pLength.getPointer()));
    }

    public static native int ma_audio_buffer_ref_get_length_in_pcm_frames_internal(long pAudioBufferRef, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_ref_get_length_in_pcm_frames((const ma_audio_buffer_ref *)pAudioBufferRef, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_ref_get_available_frames(ma_audio_buffer_ref.ma_audio_buffer_refPointer pAudioBufferRef, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_audio_buffer_ref_get_available_frames_internal(pAudioBufferRef.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_audio_buffer_ref_get_available_frames_internal(long pAudioBufferRef, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_ref_get_available_frames((const ma_audio_buffer_ref *)pAudioBufferRef, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_audio_buffer_config ma_audio_buffer_config_init(ma_format format, long channels, long sizeInFrames, VoidPointer pData, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return new ma_audio_buffer_config(ma_audio_buffer_config_init_internal(format.getIndex(), channels, sizeInFrames, pData.getPointer(), pAllocationCallbacks.getPointer(), 0), true);
    }

    public static void ma_audio_buffer_config_init(ma_format format, long channels, long sizeInFrames, VoidPointer pData, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_audio_buffer_config _retPar) {
        ma_audio_buffer_config_init_internal(format.getIndex(), channels, sizeInFrames, pData.getPointer(), pAllocationCallbacks.getPointer(), _retPar.getPointer());
    }

    public static native long ma_audio_buffer_config_init_internal(int format, long channels, long sizeInFrames, long pData, long pAllocationCallbacks, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sizeInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_audio_buffer_config* _ret = (ma_audio_buffer_config*) (_retPar == 0 ? malloc(sizeof(ma_audio_buffer_config)) : (void*)_retPar);
    	*_ret = ma_audio_buffer_config_init((ma_format)format, (ma_uint32)channels, (ma_uint64)sizeInFrames, (const void *)pData, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_init(ma_audio_buffer_config.ma_audio_buffer_configPointer pConfig, ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer) {
        return ma_result.getByIndex((int) ma_audio_buffer_init_internal(pConfig.getPointer(), pAudioBuffer.getPointer()));
    }

    public static native int ma_audio_buffer_init_internal(long pConfig, long pAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_init((const ma_audio_buffer_config *)pConfig, (ma_audio_buffer *)pAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_init_copy(ma_audio_buffer_config.ma_audio_buffer_configPointer pConfig, ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer) {
        return ma_result.getByIndex((int) ma_audio_buffer_init_copy_internal(pConfig.getPointer(), pAudioBuffer.getPointer()));
    }

    public static native int ma_audio_buffer_init_copy_internal(long pConfig, long pAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_init_copy((const ma_audio_buffer_config *)pConfig, (ma_audio_buffer *)pAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_alloc_and_init(ma_audio_buffer_config.ma_audio_buffer_configPointer pConfig, PointerPointer<ma_audio_buffer.ma_audio_bufferPointer> ppAudioBuffer) {
        return ma_result.getByIndex((int) ma_audio_buffer_alloc_and_init_internal(pConfig.getPointer(), ppAudioBuffer.getPointer()));
    }

    public static native int ma_audio_buffer_alloc_and_init_internal(long pConfig, long ppAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_alloc_and_init((const ma_audio_buffer_config *)pConfig, (ma_audio_buffer **)ppAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_audio_buffer_uninit(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer) {
        ma_audio_buffer_uninit_internal(pAudioBuffer.getPointer());
    }

    public static native void ma_audio_buffer_uninit_internal(long pAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_audio_buffer_uninit((ma_audio_buffer *)pAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_audio_buffer_uninit_and_free(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer) {
        ma_audio_buffer_uninit_and_free_internal(pAudioBuffer.getPointer());
    }

    public static native void ma_audio_buffer_uninit_and_free_internal(long pAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_audio_buffer_uninit_and_free((ma_audio_buffer *)pAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_audio_buffer_read_pcm_frames(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, VoidPointer pFramesOut, long frameCount, long loop) {
        return ma_audio_buffer_read_pcm_frames_internal(pAudioBuffer.getPointer(), pFramesOut.getPointer(), frameCount, loop);
    }

    public static native long ma_audio_buffer_read_pcm_frames_internal(long pAudioBuffer, long pFramesOut, long frameCount, long loop);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, loop, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jlong)ma_audio_buffer_read_pcm_frames((ma_audio_buffer *)pAudioBuffer, (void *)pFramesOut, (ma_uint64)frameCount, (ma_bool32)loop);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_seek_to_pcm_frame(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, long frameIndex) {
        return ma_result.getByIndex((int) ma_audio_buffer_seek_to_pcm_frame_internal(pAudioBuffer.getPointer(), frameIndex));
    }

    public static native int ma_audio_buffer_seek_to_pcm_frame_internal(long pAudioBuffer, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_audio_buffer_seek_to_pcm_frame((ma_audio_buffer *)pAudioBuffer, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_map(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, PointerPointer<VoidPointer> ppFramesOut, UInt64Pointer pFrameCount) {
        return ma_result.getByIndex((int) ma_audio_buffer_map_internal(pAudioBuffer.getPointer(), ppFramesOut.getPointer(), pFrameCount.getPointer()));
    }

    public static native int ma_audio_buffer_map_internal(long pAudioBuffer, long ppFramesOut, long pFrameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_map((ma_audio_buffer *)pAudioBuffer, (void **)ppFramesOut, (ma_uint64 *)pFrameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_unmap(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, long frameCount) {
        return ma_result.getByIndex((int) ma_audio_buffer_unmap_internal(pAudioBuffer.getPointer(), frameCount));
    }

    public static native int ma_audio_buffer_unmap_internal(long pAudioBuffer, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return 0);
    	return (jint)ma_audio_buffer_unmap((ma_audio_buffer *)pAudioBuffer, (ma_uint64)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_audio_buffer_at_end(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer) {
        return ma_audio_buffer_at_end_internal(pAudioBuffer.getPointer());
    }

    public static native long ma_audio_buffer_at_end_internal(long pAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_audio_buffer_at_end((const ma_audio_buffer *)pAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_get_cursor_in_pcm_frames(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_audio_buffer_get_cursor_in_pcm_frames_internal(pAudioBuffer.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_audio_buffer_get_cursor_in_pcm_frames_internal(long pAudioBuffer, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_get_cursor_in_pcm_frames((const ma_audio_buffer *)pAudioBuffer, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_get_length_in_pcm_frames(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_audio_buffer_get_length_in_pcm_frames_internal(pAudioBuffer.getPointer(), pLength.getPointer()));
    }

    public static native int ma_audio_buffer_get_length_in_pcm_frames_internal(long pAudioBuffer, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_get_length_in_pcm_frames((const ma_audio_buffer *)pAudioBuffer, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_audio_buffer_get_available_frames(ma_audio_buffer.ma_audio_bufferPointer pAudioBuffer, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_audio_buffer_get_available_frames_internal(pAudioBuffer.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_audio_buffer_get_available_frames_internal(long pAudioBuffer, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_audio_buffer_get_available_frames((const ma_audio_buffer *)pAudioBuffer, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_init(ma_format format, long channels, ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_init_internal(format.getIndex(), channels, pData.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_init_internal(int format, long channels, long pData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jint)ma_paged_audio_buffer_data_init((ma_format)format, (ma_uint32)channels, (ma_paged_audio_buffer_data *)pData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_paged_audio_buffer_data_uninit(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_paged_audio_buffer_data_uninit_internal(pData.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_paged_audio_buffer_data_uninit_internal(long pData, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_paged_audio_buffer_data_uninit((ma_paged_audio_buffer_data *)pData, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer ma_paged_audio_buffer_data_get_head(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(ma_paged_audio_buffer_data_get_head_internal(pData.getPointer()), false);
    }

    public static void ma_paged_audio_buffer_data_get_head(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer _retPar) {
        _retPar.setPointer(ma_paged_audio_buffer_data_get_head_internal(pData.getPointer()));
    }

    public static native long ma_paged_audio_buffer_data_get_head_internal(long pData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_paged_audio_buffer_data_get_head((ma_paged_audio_buffer_data *)pData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer ma_paged_audio_buffer_data_get_tail(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        return new ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer(ma_paged_audio_buffer_data_get_tail_internal(pData.getPointer()), false);
    }

    public static void ma_paged_audio_buffer_data_get_tail(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer _retPar) {
        _retPar.setPointer(ma_paged_audio_buffer_data_get_tail_internal(pData.getPointer()));
    }

    public static native long ma_paged_audio_buffer_data_get_tail_internal(long pData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_paged_audio_buffer_data_get_tail((ma_paged_audio_buffer_data *)pData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_get_length_in_pcm_frames(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_get_length_in_pcm_frames_internal(pData.getPointer(), pLength.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_get_length_in_pcm_frames_internal(long pData, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_data_get_length_in_pcm_frames((ma_paged_audio_buffer_data *)pData, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_allocate_page(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, long pageSizeInFrames, VoidPointer pInitialData, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, PointerPointer<ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer> ppPage) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_allocate_page_internal(pData.getPointer(), pageSizeInFrames, pInitialData.getPointer(), pAllocationCallbacks.getPointer(), ppPage.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_allocate_page_internal(long pData, long pageSizeInFrames, long pInitialData, long pAllocationCallbacks, long ppPage);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, pageSizeInFrames, 1, return 0);
    	return (jint)ma_paged_audio_buffer_data_allocate_page((ma_paged_audio_buffer_data *)pData, (ma_uint64)pageSizeInFrames, (const void *)pInitialData, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_paged_audio_buffer_page **)ppPage);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_free_page(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pPage, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_free_page_internal(pData.getPointer(), pPage.getPointer(), pAllocationCallbacks.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_free_page_internal(long pData, long pPage, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_data_free_page((ma_paged_audio_buffer_data *)pData, (ma_paged_audio_buffer_page *)pPage, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_append_page(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_paged_audio_buffer_page.ma_paged_audio_buffer_pagePointer pPage) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_append_page_internal(pData.getPointer(), pPage.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_append_page_internal(long pData, long pPage);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_data_append_page((ma_paged_audio_buffer_data *)pData, (ma_paged_audio_buffer_page *)pPage);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_data_allocate_and_append_page(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, long pageSizeInFrames, VoidPointer pInitialData, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_data_allocate_and_append_page_internal(pData.getPointer(), pageSizeInFrames, pInitialData.getPointer(), pAllocationCallbacks.getPointer()));
    }

    public static native int ma_paged_audio_buffer_data_allocate_and_append_page_internal(long pData, long pageSizeInFrames, long pInitialData, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, pageSizeInFrames, 1, return 0);
    	return (jint)ma_paged_audio_buffer_data_allocate_and_append_page((ma_paged_audio_buffer_data *)pData, (ma_uint32)pageSizeInFrames, (const void *)pInitialData, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_paged_audio_buffer_config ma_paged_audio_buffer_config_init(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData) {
        return new ma_paged_audio_buffer_config(ma_paged_audio_buffer_config_init_internal(pData.getPointer(), 0), true);
    }

    public static void ma_paged_audio_buffer_config_init(ma_paged_audio_buffer_data.ma_paged_audio_buffer_dataPointer pData, ma_paged_audio_buffer_config _retPar) {
        ma_paged_audio_buffer_config_init_internal(pData.getPointer(), _retPar.getPointer());
    }

    public static native long ma_paged_audio_buffer_config_init_internal(long pData, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_paged_audio_buffer_config* _ret = (ma_paged_audio_buffer_config*) (_retPar == 0 ? malloc(sizeof(ma_paged_audio_buffer_config)) : (void*)_retPar);
    	*_ret = ma_paged_audio_buffer_config_init((ma_paged_audio_buffer_data *)pData);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_init(ma_paged_audio_buffer_config.ma_paged_audio_buffer_configPointer pConfig, ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_init_internal(pConfig.getPointer(), pPagedAudioBuffer.getPointer()));
    }

    public static native int ma_paged_audio_buffer_init_internal(long pConfig, long pPagedAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_init((const ma_paged_audio_buffer_config *)pConfig, (ma_paged_audio_buffer *)pPagedAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_paged_audio_buffer_uninit(ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer) {
        ma_paged_audio_buffer_uninit_internal(pPagedAudioBuffer.getPointer());
    }

    public static native void ma_paged_audio_buffer_uninit_internal(long pPagedAudioBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_paged_audio_buffer_uninit((ma_paged_audio_buffer *)pPagedAudioBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_paged_audio_buffer_read_pcm_frames(ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_read_pcm_frames_internal(pPagedAudioBuffer.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_paged_audio_buffer_read_pcm_frames_internal(long pPagedAudioBuffer, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_paged_audio_buffer_read_pcm_frames((ma_paged_audio_buffer *)pPagedAudioBuffer, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_seek_to_pcm_frame(ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer, long frameIndex) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_seek_to_pcm_frame_internal(pPagedAudioBuffer.getPointer(), frameIndex));
    }

    public static native int ma_paged_audio_buffer_seek_to_pcm_frame_internal(long pPagedAudioBuffer, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_paged_audio_buffer_seek_to_pcm_frame((ma_paged_audio_buffer *)pPagedAudioBuffer, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_get_cursor_in_pcm_frames(ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_get_cursor_in_pcm_frames_internal(pPagedAudioBuffer.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_paged_audio_buffer_get_cursor_in_pcm_frames_internal(long pPagedAudioBuffer, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_get_cursor_in_pcm_frames((ma_paged_audio_buffer *)pPagedAudioBuffer, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_paged_audio_buffer_get_length_in_pcm_frames(ma_paged_audio_buffer.ma_paged_audio_bufferPointer pPagedAudioBuffer, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_paged_audio_buffer_get_length_in_pcm_frames_internal(pPagedAudioBuffer.getPointer(), pLength.getPointer()));
    }

    public static native int ma_paged_audio_buffer_get_length_in_pcm_frames_internal(long pPagedAudioBuffer, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_paged_audio_buffer_get_length_in_pcm_frames((ma_paged_audio_buffer *)pPagedAudioBuffer, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_init_ex(long subbufferSizeInBytes, long subbufferCount, long subbufferStrideInBytes, VoidPointer pOptionalPreallocatedBuffer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_rb.ma_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_rb_init_ex_internal(subbufferSizeInBytes, subbufferCount, subbufferStrideInBytes, pOptionalPreallocatedBuffer.getPointer(), pAllocationCallbacks.getPointer(), pRB.getPointer()));
    }

    public static native int ma_rb_init_ex_internal(long subbufferSizeInBytes, long subbufferCount, long subbufferStrideInBytes, long pOptionalPreallocatedBuffer, long pAllocationCallbacks, long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, subbufferStrideInBytes, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, size_t, subbufferCount, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, size_t, subbufferSizeInBytes, 0, return 0);
    	return (jint)ma_rb_init_ex((size_t)subbufferSizeInBytes, (size_t)subbufferCount, (size_t)subbufferStrideInBytes, (void *)pOptionalPreallocatedBuffer, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_init(long bufferSizeInBytes, VoidPointer pOptionalPreallocatedBuffer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_rb.ma_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_rb_init_internal(bufferSizeInBytes, pOptionalPreallocatedBuffer.getPointer(), pAllocationCallbacks.getPointer(), pRB.getPointer()));
    }

    public static native int ma_rb_init_internal(long bufferSizeInBytes, long pOptionalPreallocatedBuffer, long pAllocationCallbacks, long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, bufferSizeInBytes, 0, return 0);
    	return (jint)ma_rb_init((size_t)bufferSizeInBytes, (void *)pOptionalPreallocatedBuffer, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_rb_uninit(ma_rb.ma_rbPointer pRB) {
        ma_rb_uninit_internal(pRB.getPointer());
    }

    public static native void ma_rb_uninit_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_rb_uninit((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_rb_reset(ma_rb.ma_rbPointer pRB) {
        ma_rb_reset_internal(pRB.getPointer());
    }

    public static native void ma_rb_reset_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_rb_reset((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_rb_acquire_read(ma_rb.ma_rbPointer pRB, ULongPointer pSizeInBytes, PointerPointer<VoidPointer> ppBufferOut) {
        return ma_result.getByIndex((int) ma_rb_acquire_read_internal(pRB.getPointer(), pSizeInBytes.getPointer(), ppBufferOut.getPointer()));
    }

    public static native int ma_rb_acquire_read_internal(long pRB, long pSizeInBytes, long ppBufferOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_rb_acquire_read((ma_rb *)pRB, (size_t *)pSizeInBytes, (void **)ppBufferOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_commit_read(ma_rb.ma_rbPointer pRB, long sizeInBytes) {
        return ma_result.getByIndex((int) ma_rb_commit_read_internal(pRB.getPointer(), sizeInBytes));
    }

    public static native int ma_rb_commit_read_internal(long pRB, long sizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 1, return 0);
    	return (jint)ma_rb_commit_read((ma_rb *)pRB, (size_t)sizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_acquire_write(ma_rb.ma_rbPointer pRB, ULongPointer pSizeInBytes, PointerPointer<VoidPointer> ppBufferOut) {
        return ma_result.getByIndex((int) ma_rb_acquire_write_internal(pRB.getPointer(), pSizeInBytes.getPointer(), ppBufferOut.getPointer()));
    }

    public static native int ma_rb_acquire_write_internal(long pRB, long pSizeInBytes, long ppBufferOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_rb_acquire_write((ma_rb *)pRB, (size_t *)pSizeInBytes, (void **)ppBufferOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_commit_write(ma_rb.ma_rbPointer pRB, long sizeInBytes) {
        return ma_result.getByIndex((int) ma_rb_commit_write_internal(pRB.getPointer(), sizeInBytes));
    }

    public static native int ma_rb_commit_write_internal(long pRB, long sizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 1, return 0);
    	return (jint)ma_rb_commit_write((ma_rb *)pRB, (size_t)sizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_seek_read(ma_rb.ma_rbPointer pRB, long offsetInBytes) {
        return ma_result.getByIndex((int) ma_rb_seek_read_internal(pRB.getPointer(), offsetInBytes));
    }

    public static native int ma_rb_seek_read_internal(long pRB, long offsetInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, offsetInBytes, 1, return 0);
    	return (jint)ma_rb_seek_read((ma_rb *)pRB, (size_t)offsetInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_rb_seek_write(ma_rb.ma_rbPointer pRB, long offsetInBytes) {
        return ma_result.getByIndex((int) ma_rb_seek_write_internal(pRB.getPointer(), offsetInBytes));
    }

    public static native int ma_rb_seek_write_internal(long pRB, long offsetInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, offsetInBytes, 1, return 0);
    	return (jint)ma_rb_seek_write((ma_rb *)pRB, (size_t)offsetInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static int ma_rb_pointer_distance(ma_rb.ma_rbPointer pRB) {
        return ma_rb_pointer_distance_internal(pRB.getPointer());
    }

    public static native int ma_rb_pointer_distance_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_rb_pointer_distance((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_rb_available_read(ma_rb.ma_rbPointer pRB) {
        return ma_rb_available_read_internal(pRB.getPointer());
    }

    public static native long ma_rb_available_read_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_rb_available_read((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_rb_available_write(ma_rb.ma_rbPointer pRB) {
        return ma_rb_available_write_internal(pRB.getPointer());
    }

    public static native long ma_rb_available_write_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_rb_available_write((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_rb_get_subbuffer_size(ma_rb.ma_rbPointer pRB) {
        return ma_rb_get_subbuffer_size_internal(pRB.getPointer());
    }

    public static native long ma_rb_get_subbuffer_size_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_rb_get_subbuffer_size((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_rb_get_subbuffer_stride(ma_rb.ma_rbPointer pRB) {
        return ma_rb_get_subbuffer_stride_internal(pRB.getPointer());
    }

    public static native long ma_rb_get_subbuffer_stride_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_rb_get_subbuffer_stride((ma_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_rb_get_subbuffer_offset(ma_rb.ma_rbPointer pRB, long subbufferIndex) {
        return ma_rb_get_subbuffer_offset_internal(pRB.getPointer(), subbufferIndex);
    }

    public static native long ma_rb_get_subbuffer_offset_internal(long pRB, long subbufferIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, subbufferIndex, 1, return 0);
    	return (jlong)ma_rb_get_subbuffer_offset((ma_rb *)pRB, (size_t)subbufferIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_rb_get_subbuffer_ptr(ma_rb.ma_rbPointer pRB, long subbufferIndex, VoidPointer pBuffer) {
        return new VoidPointer(ma_rb_get_subbuffer_ptr_internal(pRB.getPointer(), subbufferIndex, pBuffer.getPointer()), false);
    }

    public static void ma_rb_get_subbuffer_ptr(ma_rb.ma_rbPointer pRB, long subbufferIndex, VoidPointer pBuffer, VoidPointer _retPar) {
        _retPar.setPointer(ma_rb_get_subbuffer_ptr_internal(pRB.getPointer(), subbufferIndex, pBuffer.getPointer()));
    }

    public static native long ma_rb_get_subbuffer_ptr_internal(long pRB, long subbufferIndex, long pBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, subbufferIndex, 1, return 0);
    	return (jlong)ma_rb_get_subbuffer_ptr((ma_rb *)pRB, (size_t)subbufferIndex, (void *)pBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_init_ex(ma_format format, long channels, long subbufferSizeInFrames, long subbufferCount, long subbufferStrideInFrames, VoidPointer pOptionalPreallocatedBuffer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_pcm_rb_init_ex_internal(format.getIndex(), channels, subbufferSizeInFrames, subbufferCount, subbufferStrideInFrames, pOptionalPreallocatedBuffer.getPointer(), pAllocationCallbacks.getPointer(), pRB.getPointer()));
    }

    public static native int ma_pcm_rb_init_ex_internal(int format, long channels, long subbufferSizeInFrames, long subbufferCount, long subbufferStrideInFrames, long pOptionalPreallocatedBuffer, long pAllocationCallbacks, long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, subbufferStrideInFrames, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, subbufferCount, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, subbufferSizeInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jint)ma_pcm_rb_init_ex((ma_format)format, (ma_uint32)channels, (ma_uint32)subbufferSizeInFrames, (ma_uint32)subbufferCount, (ma_uint32)subbufferStrideInFrames, (void *)pOptionalPreallocatedBuffer, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_init(ma_format format, long channels, long bufferSizeInFrames, VoidPointer pOptionalPreallocatedBuffer, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_pcm_rb_init_internal(format.getIndex(), channels, bufferSizeInFrames, pOptionalPreallocatedBuffer.getPointer(), pAllocationCallbacks.getPointer(), pRB.getPointer()));
    }

    public static native int ma_pcm_rb_init_internal(int format, long channels, long bufferSizeInFrames, long pOptionalPreallocatedBuffer, long pAllocationCallbacks, long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, bufferSizeInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jint)ma_pcm_rb_init((ma_format)format, (ma_uint32)channels, (ma_uint32)bufferSizeInFrames, (void *)pOptionalPreallocatedBuffer, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_pcm_rb_uninit(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        ma_pcm_rb_uninit_internal(pRB.getPointer());
    }

    public static native void ma_pcm_rb_uninit_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_pcm_rb_uninit((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_pcm_rb_reset(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        ma_pcm_rb_reset_internal(pRB.getPointer());
    }

    public static native void ma_pcm_rb_reset_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_pcm_rb_reset((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_pcm_rb_acquire_read(ma_pcm_rb.ma_pcm_rbPointer pRB, UIntPointer pSizeInFrames, PointerPointer<VoidPointer> ppBufferOut) {
        return ma_result.getByIndex((int) ma_pcm_rb_acquire_read_internal(pRB.getPointer(), pSizeInFrames.getPointer(), ppBufferOut.getPointer()));
    }

    public static native int ma_pcm_rb_acquire_read_internal(long pRB, long pSizeInFrames, long ppBufferOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pcm_rb_acquire_read((ma_pcm_rb *)pRB, (ma_uint32 *)pSizeInFrames, (void **)ppBufferOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_commit_read(ma_pcm_rb.ma_pcm_rbPointer pRB, long sizeInFrames) {
        return ma_result.getByIndex((int) ma_pcm_rb_commit_read_internal(pRB.getPointer(), sizeInFrames));
    }

    public static native int ma_pcm_rb_commit_read_internal(long pRB, long sizeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sizeInFrames, 1, return 0);
    	return (jint)ma_pcm_rb_commit_read((ma_pcm_rb *)pRB, (ma_uint32)sizeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_acquire_write(ma_pcm_rb.ma_pcm_rbPointer pRB, UIntPointer pSizeInFrames, PointerPointer<VoidPointer> ppBufferOut) {
        return ma_result.getByIndex((int) ma_pcm_rb_acquire_write_internal(pRB.getPointer(), pSizeInFrames.getPointer(), ppBufferOut.getPointer()));
    }

    public static native int ma_pcm_rb_acquire_write_internal(long pRB, long pSizeInFrames, long ppBufferOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pcm_rb_acquire_write((ma_pcm_rb *)pRB, (ma_uint32 *)pSizeInFrames, (void **)ppBufferOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_commit_write(ma_pcm_rb.ma_pcm_rbPointer pRB, long sizeInFrames) {
        return ma_result.getByIndex((int) ma_pcm_rb_commit_write_internal(pRB.getPointer(), sizeInFrames));
    }

    public static native int ma_pcm_rb_commit_write_internal(long pRB, long sizeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sizeInFrames, 1, return 0);
    	return (jint)ma_pcm_rb_commit_write((ma_pcm_rb *)pRB, (ma_uint32)sizeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_seek_read(ma_pcm_rb.ma_pcm_rbPointer pRB, long offsetInFrames) {
        return ma_result.getByIndex((int) ma_pcm_rb_seek_read_internal(pRB.getPointer(), offsetInFrames));
    }

    public static native int ma_pcm_rb_seek_read_internal(long pRB, long offsetInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, offsetInFrames, 1, return 0);
    	return (jint)ma_pcm_rb_seek_read((ma_pcm_rb *)pRB, (ma_uint32)offsetInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pcm_rb_seek_write(ma_pcm_rb.ma_pcm_rbPointer pRB, long offsetInFrames) {
        return ma_result.getByIndex((int) ma_pcm_rb_seek_write_internal(pRB.getPointer(), offsetInFrames));
    }

    public static native int ma_pcm_rb_seek_write_internal(long pRB, long offsetInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, offsetInFrames, 1, return 0);
    	return (jint)ma_pcm_rb_seek_write((ma_pcm_rb *)pRB, (ma_uint32)offsetInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static int ma_pcm_rb_pointer_distance(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_pointer_distance_internal(pRB.getPointer());
    }

    public static native int ma_pcm_rb_pointer_distance_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pcm_rb_pointer_distance((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_available_read(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_available_read_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_available_read_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_available_read((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_available_write(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_available_write_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_available_write_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_available_write((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_get_subbuffer_size(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_get_subbuffer_size_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_get_subbuffer_size_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_get_subbuffer_size((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_get_subbuffer_stride(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_get_subbuffer_stride_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_get_subbuffer_stride_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_get_subbuffer_stride((ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_get_subbuffer_offset(ma_pcm_rb.ma_pcm_rbPointer pRB, long subbufferIndex) {
        return ma_pcm_rb_get_subbuffer_offset_internal(pRB.getPointer(), subbufferIndex);
    }

    public static native long ma_pcm_rb_get_subbuffer_offset_internal(long pRB, long subbufferIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, subbufferIndex, 1, return 0);
    	return (jlong)ma_pcm_rb_get_subbuffer_offset((ma_pcm_rb *)pRB, (ma_uint32)subbufferIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_pcm_rb_get_subbuffer_ptr(ma_pcm_rb.ma_pcm_rbPointer pRB, long subbufferIndex, VoidPointer pBuffer) {
        return new VoidPointer(ma_pcm_rb_get_subbuffer_ptr_internal(pRB.getPointer(), subbufferIndex, pBuffer.getPointer()), false);
    }

    public static void ma_pcm_rb_get_subbuffer_ptr(ma_pcm_rb.ma_pcm_rbPointer pRB, long subbufferIndex, VoidPointer pBuffer, VoidPointer _retPar) {
        _retPar.setPointer(ma_pcm_rb_get_subbuffer_ptr_internal(pRB.getPointer(), subbufferIndex, pBuffer.getPointer()));
    }

    public static native long ma_pcm_rb_get_subbuffer_ptr_internal(long pRB, long subbufferIndex, long pBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, subbufferIndex, 1, return 0);
    	return (jlong)ma_pcm_rb_get_subbuffer_ptr((ma_pcm_rb *)pRB, (ma_uint32)subbufferIndex, (void *)pBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_format ma_pcm_rb_get_format(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_format.getByIndex((int) ma_pcm_rb_get_format_internal(pRB.getPointer()));
    }

    public static native int ma_pcm_rb_get_format_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pcm_rb_get_format((const ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_get_channels(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_get_channels_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_get_channels_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_get_channels((const ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_pcm_rb_get_sample_rate(ma_pcm_rb.ma_pcm_rbPointer pRB) {
        return ma_pcm_rb_get_sample_rate_internal(pRB.getPointer());
    }

    public static native long ma_pcm_rb_get_sample_rate_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_pcm_rb_get_sample_rate((const ma_pcm_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_pcm_rb_set_sample_rate(ma_pcm_rb.ma_pcm_rbPointer pRB, long sampleRate) {
        ma_pcm_rb_set_sample_rate_internal(pRB.getPointer(), sampleRate);
    }

    public static native void ma_pcm_rb_set_sample_rate_internal(long pRB, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return);
    	ma_pcm_rb_set_sample_rate((ma_pcm_rb *)pRB, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_duplex_rb_init(ma_format captureFormat, long captureChannels, long sampleRate, long captureInternalSampleRate, long captureInternalPeriodSizeInFrames, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_duplex_rb.ma_duplex_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_duplex_rb_init_internal(captureFormat.getIndex(), captureChannels, sampleRate, captureInternalSampleRate, captureInternalPeriodSizeInFrames, pAllocationCallbacks.getPointer(), pRB.getPointer()));
    }

    public static native int ma_duplex_rb_init_internal(int captureFormat, long captureChannels, long sampleRate, long captureInternalSampleRate, long captureInternalPeriodSizeInFrames, long pAllocationCallbacks, long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, captureInternalPeriodSizeInFrames, 4, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, captureInternalSampleRate, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, captureChannels, 1, return 0);
    	return (jint)ma_duplex_rb_init((ma_format)captureFormat, (ma_uint32)captureChannels, (ma_uint32)sampleRate, (ma_uint32)captureInternalSampleRate, (ma_uint32)captureInternalPeriodSizeInFrames, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_duplex_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_duplex_rb_uninit(ma_duplex_rb.ma_duplex_rbPointer pRB) {
        return ma_result.getByIndex((int) ma_duplex_rb_uninit_internal(pRB.getPointer()));
    }

    public static native int ma_duplex_rb_uninit_internal(long pRB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_duplex_rb_uninit((ma_duplex_rb *)pRB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * ********************************************************************************************************************************************************
     * Miscellaneous Helpers
     * *********************************************************************************************************************************************************
     */
    public static BytePointer ma_result_description(ma_result result) {
        return new BytePointer(ma_result_description_internal(result.getIndex()), false);
    }

    /**
     * ********************************************************************************************************************************************************
     * Miscellaneous Helpers
     * *********************************************************************************************************************************************************
     */
    public static void ma_result_description(ma_result result, BytePointer _retPar) {
        _retPar.setPointer(ma_result_description_internal(result.getIndex()));
    }

    public static native long ma_result_description_internal(int result);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_result_description((ma_result)result);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_malloc(long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return new VoidPointer(ma_malloc_internal(sz, pAllocationCallbacks.getPointer()), false);
    }

    public static void ma_malloc(long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, VoidPointer _retPar) {
        _retPar.setPointer(ma_malloc_internal(sz, pAllocationCallbacks.getPointer()));
    }

    public static native long ma_malloc_internal(long sz, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sz, 0, return 0);
    	return (jlong)ma_malloc((size_t)sz, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_calloc(long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return new VoidPointer(ma_calloc_internal(sz, pAllocationCallbacks.getPointer()), false);
    }

    public static void ma_calloc(long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, VoidPointer _retPar) {
        _retPar.setPointer(ma_calloc_internal(sz, pAllocationCallbacks.getPointer()));
    }

    public static native long ma_calloc_internal(long sz, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sz, 0, return 0);
    	return (jlong)ma_calloc((size_t)sz, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_realloc(VoidPointer p, long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return new VoidPointer(ma_realloc_internal(p.getPointer(), sz, pAllocationCallbacks.getPointer()), false);
    }

    public static void ma_realloc(VoidPointer p, long sz, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, VoidPointer _retPar) {
        _retPar.setPointer(ma_realloc_internal(p.getPointer(), sz, pAllocationCallbacks.getPointer()));
    }

    public static native long ma_realloc_internal(long p, long sz, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sz, 1, return 0);
    	return (jlong)ma_realloc((void *)p, (size_t)sz, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_free(VoidPointer p, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_free_internal(p.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_free_internal(long p, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_free((void *)p, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static VoidPointer ma_aligned_malloc(long sz, long alignment, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return new VoidPointer(ma_aligned_malloc_internal(sz, alignment, pAllocationCallbacks.getPointer()), false);
    }

    public static void ma_aligned_malloc(long sz, long alignment, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, VoidPointer _retPar) {
        _retPar.setPointer(ma_aligned_malloc_internal(sz, alignment, pAllocationCallbacks.getPointer()));
    }

    public static native long ma_aligned_malloc_internal(long sz, long alignment, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, alignment, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, size_t, sz, 0, return 0);
    	return (jlong)ma_aligned_malloc((size_t)sz, (size_t)alignment, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_aligned_free(VoidPointer p, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_aligned_free_internal(p.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_aligned_free_internal(long p, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_aligned_free((void *)p, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static BytePointer ma_get_format_name(ma_format format) {
        return new BytePointer(ma_get_format_name_internal(format.getIndex()), false);
    }

    public static void ma_get_format_name(ma_format format, BytePointer _retPar) {
        _retPar.setPointer(ma_get_format_name_internal(format.getIndex()));
    }

    public static native long ma_get_format_name_internal(int format);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_get_format_name((ma_format)format);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_blend_f32(FloatPointer pOut, FloatPointer pInA, FloatPointer pInB, float factor, long channels) {
        ma_blend_f32_internal(pOut.getPointer(), pInA.getPointer(), pInB.getPointer(), factor, channels);
    }

    public static native void ma_blend_f32_internal(long pOut, long pInA, long pInB, float factor, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 4, return);
    	ma_blend_f32((float *)pOut, (float *)pInA, (float *)pInB, (float)factor, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_get_bytes_per_sample(ma_format format) {
        return ma_get_bytes_per_sample_internal(format.getIndex());
    }

    public static native long ma_get_bytes_per_sample_internal(int format);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_get_bytes_per_sample((ma_format)format);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_get_bytes_per_frame(ma_format format, long channels) {
        return ma_get_bytes_per_frame_internal(format.getIndex(), channels);
    }

    public static native long ma_get_bytes_per_frame_internal(int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	return (jlong)ma_get_bytes_per_frame((ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static BytePointer ma_log_level_to_string(long logLevel) {
        return new BytePointer(ma_log_level_to_string_internal(logLevel), false);
    }

    public static void ma_log_level_to_string(long logLevel, BytePointer _retPar) {
        _retPar.setPointer(ma_log_level_to_string_internal(logLevel));
    }

    public static native long ma_log_level_to_string_internal(long logLevel);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, logLevel, 0, return 0);
    	return (jlong)ma_log_level_to_string((ma_uint32)logLevel);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * ********************************************************************************************************************************************************
     * Synchronization
     * *********************************************************************************************************************************************************
     */
    public static ma_result ma_spinlock_lock(UIntPointer pSpinlock) {
        return ma_result.getByIndex((int) ma_spinlock_lock_internal(pSpinlock.getPointer()));
    }

    public static native int ma_spinlock_lock_internal(long pSpinlock);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spinlock_lock((volatile ma_spinlock *)pSpinlock);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spinlock_lock_noyield(UIntPointer pSpinlock) {
        return ma_result.getByIndex((int) ma_spinlock_lock_noyield_internal(pSpinlock.getPointer()));
    }

    public static native int ma_spinlock_lock_noyield_internal(long pSpinlock);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spinlock_lock_noyield((volatile ma_spinlock *)pSpinlock);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_spinlock_unlock(UIntPointer pSpinlock) {
        return ma_result.getByIndex((int) ma_spinlock_unlock_internal(pSpinlock.getPointer()));
    }

    public static native int ma_spinlock_unlock_internal(long pSpinlock);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_spinlock_unlock((volatile ma_spinlock *)pSpinlock);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_mutex_init(VoidPointer pMutex) {
        return ma_result.getByIndex((int) ma_mutex_init_internal(pMutex.getPointer()));
    }

    public static native int ma_mutex_init_internal(long pMutex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_mutex_init((ma_mutex *)pMutex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_mutex_uninit(VoidPointer pMutex) {
        ma_mutex_uninit_internal(pMutex.getPointer());
    }

    public static native void ma_mutex_uninit_internal(long pMutex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_mutex_uninit((ma_mutex *)pMutex);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_mutex_lock(VoidPointer pMutex) {
        ma_mutex_lock_internal(pMutex.getPointer());
    }

    public static native void ma_mutex_lock_internal(long pMutex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_mutex_lock((ma_mutex *)pMutex);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_mutex_unlock(VoidPointer pMutex) {
        ma_mutex_unlock_internal(pMutex.getPointer());
    }

    public static native void ma_mutex_unlock_internal(long pMutex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_mutex_unlock((ma_mutex *)pMutex);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_event_init(ma_event.ma_eventPointer pEvent) {
        return ma_result.getByIndex((int) ma_event_init_internal(pEvent.getPointer()));
    }

    public static native int ma_event_init_internal(long pEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_event_init((ma_event *)pEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_event_uninit(ma_event.ma_eventPointer pEvent) {
        ma_event_uninit_internal(pEvent.getPointer());
    }

    public static native void ma_event_uninit_internal(long pEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_event_uninit((ma_event *)pEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_event_wait(ma_event.ma_eventPointer pEvent) {
        return ma_result.getByIndex((int) ma_event_wait_internal(pEvent.getPointer()));
    }

    public static native int ma_event_wait_internal(long pEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_event_wait((ma_event *)pEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_event_signal(ma_event.ma_eventPointer pEvent) {
        return ma_result.getByIndex((int) ma_event_signal_internal(pEvent.getPointer()));
    }

    public static native int ma_event_signal_internal(long pEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_event_signal((ma_event *)pEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_semaphore_init(int initialValue, ma_semaphore.ma_semaphorePointer pSemaphore) {
        return ma_result.getByIndex((int) ma_semaphore_init_internal(initialValue, pSemaphore.getPointer()));
    }

    public static native int ma_semaphore_init_internal(int initialValue, long pSemaphore);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, int, initialValue, 0, return 0);
    	return (jint)ma_semaphore_init((int)initialValue, (ma_semaphore *)pSemaphore);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_semaphore_uninit(ma_semaphore.ma_semaphorePointer pSemaphore) {
        ma_semaphore_uninit_internal(pSemaphore.getPointer());
    }

    public static native void ma_semaphore_uninit_internal(long pSemaphore);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_semaphore_uninit((ma_semaphore *)pSemaphore);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_semaphore_wait(ma_semaphore.ma_semaphorePointer pSemaphore) {
        return ma_result.getByIndex((int) ma_semaphore_wait_internal(pSemaphore.getPointer()));
    }

    public static native int ma_semaphore_wait_internal(long pSemaphore);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_semaphore_wait((ma_semaphore *)pSemaphore);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_semaphore_release(ma_semaphore.ma_semaphorePointer pSemaphore) {
        return ma_result.getByIndex((int) ma_semaphore_release_internal(pSemaphore.getPointer()));
    }

    public static native int ma_semaphore_release_internal(long pSemaphore);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_semaphore_release((ma_semaphore *)pSemaphore);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_fence_init(ma_fence.ma_fencePointer pFence) {
        return ma_result.getByIndex((int) ma_fence_init_internal(pFence.getPointer()));
    }

    public static native int ma_fence_init_internal(long pFence);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_fence_init((ma_fence *)pFence);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_fence_uninit(ma_fence.ma_fencePointer pFence) {
        ma_fence_uninit_internal(pFence.getPointer());
    }

    public static native void ma_fence_uninit_internal(long pFence);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_fence_uninit((ma_fence *)pFence);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_fence_acquire(ma_fence.ma_fencePointer pFence) {
        return ma_result.getByIndex((int) ma_fence_acquire_internal(pFence.getPointer()));
    }

    public static native int ma_fence_acquire_internal(long pFence);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_fence_acquire((ma_fence *)pFence);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_fence_release(ma_fence.ma_fencePointer pFence) {
        return ma_result.getByIndex((int) ma_fence_release_internal(pFence.getPointer()));
    }

    public static native int ma_fence_release_internal(long pFence);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_fence_release((ma_fence *)pFence);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_fence_wait(ma_fence.ma_fencePointer pFence) {
        return ma_result.getByIndex((int) ma_fence_wait_internal(pFence.getPointer()));
    }

    public static native int ma_fence_wait_internal(long pFence);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_fence_wait((ma_fence *)pFence);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_signal(VoidPointer pNotification) {
        return ma_result.getByIndex((int) ma_async_notification_signal_internal(pNotification.getPointer()));
    }

    public static native int ma_async_notification_signal_internal(long pNotification);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_signal((ma_async_notification *)pNotification);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_poll_init(ma_async_notification_poll.ma_async_notification_pollPointer pNotificationPoll) {
        return ma_result.getByIndex((int) ma_async_notification_poll_init_internal(pNotificationPoll.getPointer()));
    }

    public static native int ma_async_notification_poll_init_internal(long pNotificationPoll);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_poll_init((ma_async_notification_poll *)pNotificationPoll);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_async_notification_poll_is_signalled(ma_async_notification_poll.ma_async_notification_pollPointer pNotificationPoll) {
        return ma_async_notification_poll_is_signalled_internal(pNotificationPoll.getPointer());
    }

    public static native long ma_async_notification_poll_is_signalled_internal(long pNotificationPoll);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_async_notification_poll_is_signalled((const ma_async_notification_poll *)pNotificationPoll);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_event_init(ma_async_notification_event.ma_async_notification_eventPointer pNotificationEvent) {
        return ma_result.getByIndex((int) ma_async_notification_event_init_internal(pNotificationEvent.getPointer()));
    }

    public static native int ma_async_notification_event_init_internal(long pNotificationEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_event_init((ma_async_notification_event *)pNotificationEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_event_uninit(ma_async_notification_event.ma_async_notification_eventPointer pNotificationEvent) {
        return ma_result.getByIndex((int) ma_async_notification_event_uninit_internal(pNotificationEvent.getPointer()));
    }

    public static native int ma_async_notification_event_uninit_internal(long pNotificationEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_event_uninit((ma_async_notification_event *)pNotificationEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_event_wait(ma_async_notification_event.ma_async_notification_eventPointer pNotificationEvent) {
        return ma_result.getByIndex((int) ma_async_notification_event_wait_internal(pNotificationEvent.getPointer()));
    }

    public static native int ma_async_notification_event_wait_internal(long pNotificationEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_event_wait((ma_async_notification_event *)pNotificationEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_async_notification_event_signal(ma_async_notification_event.ma_async_notification_eventPointer pNotificationEvent) {
        return ma_result.getByIndex((int) ma_async_notification_event_signal_internal(pNotificationEvent.getPointer()));
    }

    public static native int ma_async_notification_event_signal_internal(long pNotificationEvent);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_async_notification_event_signal((ma_async_notification_event *)pNotificationEvent);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_slot_allocator_config ma_slot_allocator_config_init(long capacity) {
        return new ma_slot_allocator_config(ma_slot_allocator_config_init_internal(capacity, 0), true);
    }

    public static void ma_slot_allocator_config_init(long capacity, ma_slot_allocator_config _retPar) {
        ma_slot_allocator_config_init_internal(capacity, _retPar.getPointer());
    }

    public static native long ma_slot_allocator_config_init_internal(long capacity, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, capacity, 0, return 0);
    	ma_slot_allocator_config* _ret = (ma_slot_allocator_config*) (_retPar == 0 ? malloc(sizeof(ma_slot_allocator_config)) : (void*)_retPar);
    	*_ret = ma_slot_allocator_config_init((ma_uint32)capacity);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_slot_allocator_get_heap_size(ma_slot_allocator_config.ma_slot_allocator_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_slot_allocator_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_slot_allocator_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_slot_allocator_get_heap_size((const ma_slot_allocator_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_slot_allocator_init_preallocated(ma_slot_allocator_config.ma_slot_allocator_configPointer pConfig, VoidPointer pHeap, ma_slot_allocator.ma_slot_allocatorPointer pAllocator) {
        return ma_result.getByIndex((int) ma_slot_allocator_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pAllocator.getPointer()));
    }

    public static native int ma_slot_allocator_init_preallocated_internal(long pConfig, long pHeap, long pAllocator);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_slot_allocator_init_preallocated((const ma_slot_allocator_config *)pConfig, (void *)pHeap, (ma_slot_allocator *)pAllocator);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_slot_allocator_init(ma_slot_allocator_config.ma_slot_allocator_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_slot_allocator.ma_slot_allocatorPointer pAllocator) {
        return ma_result.getByIndex((int) ma_slot_allocator_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pAllocator.getPointer()));
    }

    public static native int ma_slot_allocator_init_internal(long pConfig, long pAllocationCallbacks, long pAllocator);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_slot_allocator_init((const ma_slot_allocator_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_slot_allocator *)pAllocator);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_slot_allocator_uninit(ma_slot_allocator.ma_slot_allocatorPointer pAllocator, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_slot_allocator_uninit_internal(pAllocator.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_slot_allocator_uninit_internal(long pAllocator, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_slot_allocator_uninit((ma_slot_allocator *)pAllocator, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_slot_allocator_alloc(ma_slot_allocator.ma_slot_allocatorPointer pAllocator, UInt64Pointer pSlot) {
        return ma_result.getByIndex((int) ma_slot_allocator_alloc_internal(pAllocator.getPointer(), pSlot.getPointer()));
    }

    public static native int ma_slot_allocator_alloc_internal(long pAllocator, long pSlot);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_slot_allocator_alloc((ma_slot_allocator *)pAllocator, (ma_uint64 *)pSlot);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_slot_allocator_free(ma_slot_allocator.ma_slot_allocatorPointer pAllocator, long slot) {
        return ma_result.getByIndex((int) ma_slot_allocator_free_internal(pAllocator.getPointer(), slot));
    }

    public static native int ma_slot_allocator_free_internal(long pAllocator, long slot);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, slot, 1, return 0);
    	return (jint)ma_slot_allocator_free((ma_slot_allocator *)pAllocator, (ma_uint64)slot);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_job ma_job_init(char code) {
        return new ma_job(ma_job_init_internal(code, 0), true);
    }

    public static void ma_job_init(char code, ma_job _retPar) {
        ma_job_init_internal(code, _retPar.getPointer());
    }

    public static native long ma_job_init_internal(char code, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint16, code, 0, return 0);
    	ma_job* _ret = (ma_job*) (_retPar == 0 ? malloc(sizeof(ma_job)) : (void*)_retPar);
    	*_ret = ma_job_init((ma_uint16)code);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_job_process(ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_job_process_internal(pJob.getPointer()));
    }

    public static native int ma_job_process_internal(long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_process((ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_job_queue_config ma_job_queue_config_init(long flags, long capacity) {
        return new ma_job_queue_config(ma_job_queue_config_init_internal(flags, capacity, 0), true);
    }

    public static void ma_job_queue_config_init(long flags, long capacity, ma_job_queue_config _retPar) {
        ma_job_queue_config_init_internal(flags, capacity, _retPar.getPointer());
    }

    public static native long ma_job_queue_config_init_internal(long flags, long capacity, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, capacity, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 0, return 0);
    	ma_job_queue_config* _ret = (ma_job_queue_config*) (_retPar == 0 ? malloc(sizeof(ma_job_queue_config)) : (void*)_retPar);
    	*_ret = ma_job_queue_config_init((ma_uint32)flags, (ma_uint32)capacity);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_job_queue_get_heap_size(ma_job_queue_config.ma_job_queue_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_job_queue_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_job_queue_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_queue_get_heap_size((const ma_job_queue_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_job_queue_init_preallocated(ma_job_queue_config.ma_job_queue_configPointer pConfig, VoidPointer pHeap, ma_job_queue.ma_job_queuePointer pQueue) {
        return ma_result.getByIndex((int) ma_job_queue_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pQueue.getPointer()));
    }

    public static native int ma_job_queue_init_preallocated_internal(long pConfig, long pHeap, long pQueue);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_queue_init_preallocated((const ma_job_queue_config *)pConfig, (void *)pHeap, (ma_job_queue *)pQueue);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_job_queue_init(ma_job_queue_config.ma_job_queue_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_job_queue.ma_job_queuePointer pQueue) {
        return ma_result.getByIndex((int) ma_job_queue_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pQueue.getPointer()));
    }

    public static native int ma_job_queue_init_internal(long pConfig, long pAllocationCallbacks, long pQueue);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_queue_init((const ma_job_queue_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_job_queue *)pQueue);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_job_queue_uninit(ma_job_queue.ma_job_queuePointer pQueue, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_job_queue_uninit_internal(pQueue.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_job_queue_uninit_internal(long pQueue, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_job_queue_uninit((ma_job_queue *)pQueue, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_job_queue_post(ma_job_queue.ma_job_queuePointer pQueue, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_job_queue_post_internal(pQueue.getPointer(), pJob.getPointer()));
    }

    public static native int ma_job_queue_post_internal(long pQueue, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_queue_post((ma_job_queue *)pQueue, (const ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_job_queue_next(ma_job_queue.ma_job_queuePointer pQueue, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_job_queue_next_internal(pQueue.getPointer(), pJob.getPointer()));
    }

    public static native int ma_job_queue_next_internal(long pQueue, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_job_queue_next((ma_job_queue *)pQueue, (ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_device_job_thread_config ma_device_job_thread_config_init() {
        return new ma_device_job_thread_config(ma_device_job_thread_config_init_internal(0), true);
    }

    public static void ma_device_job_thread_config_init(ma_device_job_thread_config _retPar) {
        ma_device_job_thread_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_device_job_thread_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_device_job_thread_config* _ret = (ma_device_job_thread_config*) (_retPar == 0 ? malloc(sizeof(ma_device_job_thread_config)) : (void*)_retPar);
    	*_ret = ma_device_job_thread_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_job_thread_init(ma_device_job_thread_config.ma_device_job_thread_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_device_job_thread.ma_device_job_threadPointer pJobThread) {
        return ma_result.getByIndex((int) ma_device_job_thread_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pJobThread.getPointer()));
    }

    public static native int ma_device_job_thread_init_internal(long pConfig, long pAllocationCallbacks, long pJobThread);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_job_thread_init((const ma_device_job_thread_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_device_job_thread *)pJobThread);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_device_job_thread_uninit(ma_device_job_thread.ma_device_job_threadPointer pJobThread, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_device_job_thread_uninit_internal(pJobThread.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_device_job_thread_uninit_internal(long pJobThread, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_device_job_thread_uninit((ma_device_job_thread *)pJobThread, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_device_job_thread_post(ma_device_job_thread.ma_device_job_threadPointer pJobThread, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_device_job_thread_post_internal(pJobThread.getPointer(), pJob.getPointer()));
    }

    public static native int ma_device_job_thread_post_internal(long pJobThread, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_job_thread_post((ma_device_job_thread *)pJobThread, (const ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_job_thread_next(ma_device_job_thread.ma_device_job_threadPointer pJobThread, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_device_job_thread_next_internal(pJobThread.getPointer(), pJob.getPointer()));
    }

    public static native int ma_device_job_thread_next_internal(long pJobThread, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_job_thread_next((ma_device_job_thread *)pJobThread, (ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_device_id_equal(ma_device_id.ma_device_idPointer pA, ma_device_id.ma_device_idPointer pB) {
        return ma_device_id_equal_internal(pA.getPointer(), pB.getPointer());
    }

    public static native long ma_device_id_equal_internal(long pA, long pB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_device_id_equal((const ma_device_id *)pA, (const ma_device_id *)pB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_context_config ma_context_config_init() {
        return new ma_context_config(ma_context_config_init_internal(0), true);
    }

    public static void ma_context_config_init(ma_context_config _retPar) {
        ma_context_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_context_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_context_config* _ret = (ma_context_config*) (_retPar == 0 ? malloc(sizeof(ma_context_config)) : (void*)_retPar);
    	*_ret = ma_context_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_context_init(ma_backend.ma_backendPointer backends, long backendCount, ma_context_config.ma_context_configPointer pConfig, ma_context.ma_contextPointer pContext) {
        return ma_result.getByIndex((int) ma_context_init_internal(backends.getPointer(), backendCount, pConfig.getPointer(), pContext.getPointer()));
    }

    public static native int ma_context_init_internal(long backends, long backendCount, long pConfig, long pContext);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, backendCount, 1, return 0);
    	return (jint)ma_context_init((const ma_backend*)backends, (ma_uint32)backendCount, (const ma_context_config *)pConfig, (ma_context *)pContext);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_context_uninit(ma_context.ma_contextPointer pContext) {
        return ma_result.getByIndex((int) ma_context_uninit_internal(pContext.getPointer()));
    }

    public static native int ma_context_uninit_internal(long pContext);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_context_uninit((ma_context *)pContext);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_context_sizeof() {
        return ma_context_sizeof_internal();
    }

    public static native long ma_context_sizeof_internal();/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_context_sizeof();
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_log.ma_logPointer ma_context_get_log(ma_context.ma_contextPointer pContext) {
        return new ma_log.ma_logPointer(ma_context_get_log_internal(pContext.getPointer()), false);
    }

    public static void ma_context_get_log(ma_context.ma_contextPointer pContext, ma_log.ma_logPointer _retPar) {
        _retPar.setPointer(ma_context_get_log_internal(pContext.getPointer()));
    }

    public static native long ma_context_get_log_internal(long pContext);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_context_get_log((ma_context *)pContext);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_context_enumerate_devices(ma_context.ma_contextPointer pContext, ClosureObject<GdxMiniaudio.ma_enum_devices_callback_proc> callback, VoidPointer pUserData) {
        return ma_result.getByIndex((int) ma_context_enumerate_devices_internal(pContext.getPointer(), callback.getPointer(), pUserData.getPointer()));
    }

    public static native int ma_context_enumerate_devices_internal(long pContext, long callback, long pUserData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_context_enumerate_devices((ma_context *)pContext, (ma_enum_devices_callback_proc)callback, (void *)pUserData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_context_get_devices(ma_context.ma_contextPointer pContext, PointerPointer<ma_device_info.ma_device_infoPointer> ppPlaybackDeviceInfos, UIntPointer pPlaybackDeviceCount, PointerPointer<ma_device_info.ma_device_infoPointer> ppCaptureDeviceInfos, UIntPointer pCaptureDeviceCount) {
        return ma_result.getByIndex((int) ma_context_get_devices_internal(pContext.getPointer(), ppPlaybackDeviceInfos.getPointer(), pPlaybackDeviceCount.getPointer(), ppCaptureDeviceInfos.getPointer(), pCaptureDeviceCount.getPointer()));
    }

    public static native int ma_context_get_devices_internal(long pContext, long ppPlaybackDeviceInfos, long pPlaybackDeviceCount, long ppCaptureDeviceInfos, long pCaptureDeviceCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_context_get_devices((ma_context *)pContext, (ma_device_info **)ppPlaybackDeviceInfos, (ma_uint32 *)pPlaybackDeviceCount, (ma_device_info **)ppCaptureDeviceInfos, (ma_uint32 *)pCaptureDeviceCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_context_get_device_info(ma_context.ma_contextPointer pContext, ma_device_type deviceType, ma_device_id.ma_device_idPointer pDeviceID, ma_device_info.ma_device_infoPointer pDeviceInfo) {
        return ma_result.getByIndex((int) ma_context_get_device_info_internal(pContext.getPointer(), deviceType.getIndex(), pDeviceID.getPointer(), pDeviceInfo.getPointer()));
    }

    public static native int ma_context_get_device_info_internal(long pContext, int deviceType, long pDeviceID, long pDeviceInfo);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_context_get_device_info((ma_context *)pContext, (ma_device_type)deviceType, (const ma_device_id *)pDeviceID, (ma_device_info *)pDeviceInfo);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_context_is_loopback_supported(ma_context.ma_contextPointer pContext) {
        return ma_context_is_loopback_supported_internal(pContext.getPointer());
    }

    public static native long ma_context_is_loopback_supported_internal(long pContext);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_context_is_loopback_supported((ma_context *)pContext);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_device_config ma_device_config_init(ma_device_type deviceType) {
        return new ma_device_config(ma_device_config_init_internal(deviceType.getIndex(), 0), true);
    }

    public static void ma_device_config_init(ma_device_type deviceType, ma_device_config _retPar) {
        ma_device_config_init_internal(deviceType.getIndex(), _retPar.getPointer());
    }

    public static native long ma_device_config_init_internal(int deviceType, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_device_config* _ret = (ma_device_config*) (_retPar == 0 ? malloc(sizeof(ma_device_config)) : (void*)_retPar);
    	*_ret = ma_device_config_init((ma_device_type)deviceType);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_init(ma_context.ma_contextPointer pContext, ma_device_config.ma_device_configPointer pConfig, ma_device.ma_devicePointer pDevice) {
        return ma_result.getByIndex((int) ma_device_init_internal(pContext.getPointer(), pConfig.getPointer(), pDevice.getPointer()));
    }

    public static native int ma_device_init_internal(long pContext, long pConfig, long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_init((ma_context *)pContext, (const ma_device_config *)pConfig, (ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_init_ex(ma_backend.ma_backendPointer backends, long backendCount, ma_context_config.ma_context_configPointer pContextConfig, ma_device_config.ma_device_configPointer pConfig, ma_device.ma_devicePointer pDevice) {
        return ma_result.getByIndex((int) ma_device_init_ex_internal(backends.getPointer(), backendCount, pContextConfig.getPointer(), pConfig.getPointer(), pDevice.getPointer()));
    }

    public static native int ma_device_init_ex_internal(long backends, long backendCount, long pContextConfig, long pConfig, long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, backendCount, 1, return 0);
    	return (jint)ma_device_init_ex((const ma_backend*)backends, (ma_uint32)backendCount, (const ma_context_config *)pContextConfig, (const ma_device_config *)pConfig, (ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_device_uninit(ma_device.ma_devicePointer pDevice) {
        ma_device_uninit_internal(pDevice.getPointer());
    }

    public static native void ma_device_uninit_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_device_uninit((ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_context.ma_contextPointer ma_device_get_context(ma_device.ma_devicePointer pDevice) {
        return new ma_context.ma_contextPointer(ma_device_get_context_internal(pDevice.getPointer()), false);
    }

    public static void ma_device_get_context(ma_device.ma_devicePointer pDevice, ma_context.ma_contextPointer _retPar) {
        _retPar.setPointer(ma_device_get_context_internal(pDevice.getPointer()));
    }

    public static native long ma_device_get_context_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_device_get_context((ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_log.ma_logPointer ma_device_get_log(ma_device.ma_devicePointer pDevice) {
        return new ma_log.ma_logPointer(ma_device_get_log_internal(pDevice.getPointer()), false);
    }

    public static void ma_device_get_log(ma_device.ma_devicePointer pDevice, ma_log.ma_logPointer _retPar) {
        _retPar.setPointer(ma_device_get_log_internal(pDevice.getPointer()));
    }

    public static native long ma_device_get_log_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_device_get_log((ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_get_info(ma_device.ma_devicePointer pDevice, ma_device_type type, ma_device_info.ma_device_infoPointer pDeviceInfo) {
        return ma_result.getByIndex((int) ma_device_get_info_internal(pDevice.getPointer(), type.getIndex(), pDeviceInfo.getPointer()));
    }

    public static native int ma_device_get_info_internal(long pDevice, int type, long pDeviceInfo);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_get_info((ma_device *)pDevice, (ma_device_type)type, (ma_device_info *)pDeviceInfo);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_get_name(ma_device.ma_devicePointer pDevice, ma_device_type type, BytePointer pName, long nameCap, ULongPointer pLengthNotIncludingNullTerminator) {
        return ma_result.getByIndex((int) ma_device_get_name_internal(pDevice.getPointer(), type.getIndex(), pName.getPointer(), nameCap, pLengthNotIncludingNullTerminator.getPointer()));
    }

    public static native int ma_device_get_name_internal(long pDevice, int type, long pName, long nameCap, long pLengthNotIncludingNullTerminator);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, nameCap, 3, return 0);
    	return (jint)ma_device_get_name((ma_device *)pDevice, (ma_device_type)type, (char *)pName, (size_t)nameCap, (size_t *)pLengthNotIncludingNullTerminator);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_start(ma_device.ma_devicePointer pDevice) {
        return ma_result.getByIndex((int) ma_device_start_internal(pDevice.getPointer()));
    }

    public static native int ma_device_start_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_start((ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_stop(ma_device.ma_devicePointer pDevice) {
        return ma_result.getByIndex((int) ma_device_stop_internal(pDevice.getPointer()));
    }

    public static native int ma_device_stop_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_stop((ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_device_is_started(ma_device.ma_devicePointer pDevice) {
        return ma_device_is_started_internal(pDevice.getPointer());
    }

    public static native long ma_device_is_started_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_device_is_started((const ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_device_state ma_device_get_state(ma_device.ma_devicePointer pDevice) {
        return ma_device_state.getByIndex((int) ma_device_get_state_internal(pDevice.getPointer()));
    }

    public static native int ma_device_get_state_internal(long pDevice);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_get_state((const ma_device *)pDevice);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_post_init(ma_device.ma_devicePointer pDevice, ma_device_type deviceType, ma_device_descriptor.ma_device_descriptorPointer pPlaybackDescriptor, ma_device_descriptor.ma_device_descriptorPointer pCaptureDescriptor) {
        return ma_result.getByIndex((int) ma_device_post_init_internal(pDevice.getPointer(), deviceType.getIndex(), pPlaybackDescriptor.getPointer(), pCaptureDescriptor.getPointer()));
    }

    public static native int ma_device_post_init_internal(long pDevice, int deviceType, long pPlaybackDescriptor, long pCaptureDescriptor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_post_init((ma_device *)pDevice, (ma_device_type)deviceType, (const ma_device_descriptor *)pPlaybackDescriptor, (const ma_device_descriptor *)pCaptureDescriptor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_set_master_volume(ma_device.ma_devicePointer pDevice, float volume) {
        return ma_result.getByIndex((int) ma_device_set_master_volume_internal(pDevice.getPointer(), volume));
    }

    public static native int ma_device_set_master_volume_internal(long pDevice, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_set_master_volume((ma_device *)pDevice, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_get_master_volume(ma_device.ma_devicePointer pDevice, FloatPointer pVolume) {
        return ma_result.getByIndex((int) ma_device_get_master_volume_internal(pDevice.getPointer(), pVolume.getPointer()));
    }

    public static native int ma_device_get_master_volume_internal(long pDevice, long pVolume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_get_master_volume((ma_device *)pDevice, (float *)pVolume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_set_master_volume_db(ma_device.ma_devicePointer pDevice, float gainDB) {
        return ma_result.getByIndex((int) ma_device_set_master_volume_db_internal(pDevice.getPointer(), gainDB));
    }

    public static native int ma_device_set_master_volume_db_internal(long pDevice, float gainDB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_set_master_volume_db((ma_device *)pDevice, (float)gainDB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_get_master_volume_db(ma_device.ma_devicePointer pDevice, FloatPointer pGainDB) {
        return ma_result.getByIndex((int) ma_device_get_master_volume_db_internal(pDevice.getPointer(), pGainDB.getPointer()));
    }

    public static native int ma_device_get_master_volume_db_internal(long pDevice, long pGainDB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_device_get_master_volume_db((ma_device *)pDevice, (float *)pGainDB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_device_handle_backend_data_callback(ma_device.ma_devicePointer pDevice, VoidPointer pOutput, VoidPointer pInput, long frameCount) {
        return ma_result.getByIndex((int) ma_device_handle_backend_data_callback_internal(pDevice.getPointer(), pOutput.getPointer(), pInput.getPointer(), frameCount));
    }

    public static native int ma_device_handle_backend_data_callback_internal(long pDevice, long pOutput, long pInput, long frameCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, frameCount, 3, return 0);
    	return (jint)ma_device_handle_backend_data_callback((ma_device *)pDevice, (void *)pOutput, (const void *)pInput, (ma_uint32)frameCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_calculate_buffer_size_in_frames_from_descriptor(ma_device_descriptor.ma_device_descriptorPointer pDescriptor, long nativeSampleRate, ma_performance_profile performanceProfile) {
        return ma_calculate_buffer_size_in_frames_from_descriptor_internal(pDescriptor.getPointer(), nativeSampleRate, performanceProfile.getIndex());
    }

    public static native long ma_calculate_buffer_size_in_frames_from_descriptor_internal(long pDescriptor, long nativeSampleRate, int performanceProfile);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, nativeSampleRate, 1, return 0);
    	return (jlong)ma_calculate_buffer_size_in_frames_from_descriptor((const ma_device_descriptor *)pDescriptor, (ma_uint32)nativeSampleRate, (ma_performance_profile)performanceProfile);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static BytePointer ma_get_backend_name(ma_backend backend) {
        return new BytePointer(ma_get_backend_name_internal(backend.getIndex()), false);
    }

    public static void ma_get_backend_name(ma_backend backend, BytePointer _retPar) {
        _retPar.setPointer(ma_get_backend_name_internal(backend.getIndex()));
    }

    public static native long ma_get_backend_name_internal(int backend);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_get_backend_name((ma_backend)backend);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_get_backend_from_name(BytePointer pBackendName, ma_backend.ma_backendPointer pBackend) {
        return ma_result.getByIndex((int) ma_get_backend_from_name_internal(pBackendName.getPointer(), pBackend.getPointer()));
    }

    public static native int ma_get_backend_from_name_internal(long pBackendName, long pBackend);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_get_backend_from_name((const char *)pBackendName, (ma_backend *)pBackend);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_is_backend_enabled(ma_backend backend) {
        return ma_is_backend_enabled_internal(backend.getIndex());
    }

    public static native long ma_is_backend_enabled_internal(int backend);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_is_backend_enabled((ma_backend)backend);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_get_enabled_backends(ma_backend.ma_backendPointer pBackends, long backendCap, ULongPointer pBackendCount) {
        return ma_result.getByIndex((int) ma_get_enabled_backends_internal(pBackends.getPointer(), backendCap, pBackendCount.getPointer()));
    }

    public static native int ma_get_enabled_backends_internal(long pBackends, long backendCap, long pBackendCount);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, backendCap, 1, return 0);
    	return (jint)ma_get_enabled_backends((ma_backend *)pBackends, (size_t)backendCap, (size_t *)pBackendCount);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_is_loopback_supported(ma_backend backend) {
        return ma_is_loopback_supported_internal(backend.getIndex());
    }

    public static native long ma_is_loopback_supported_internal(int backend);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_is_loopback_supported((ma_backend)backend);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    /**
     * ********************************************************************************************************************************************************
     * Utilities
     * *********************************************************************************************************************************************************
     */
    public static long ma_calculate_buffer_size_in_milliseconds_from_frames(long bufferSizeInFrames, long sampleRate) {
        return ma_calculate_buffer_size_in_milliseconds_from_frames_internal(bufferSizeInFrames, sampleRate);
    }

    public static native long ma_calculate_buffer_size_in_milliseconds_from_frames_internal(long bufferSizeInFrames, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, bufferSizeInFrames, 0, return 0);
    	return (jlong)ma_calculate_buffer_size_in_milliseconds_from_frames((ma_uint32)bufferSizeInFrames, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_calculate_buffer_size_in_frames_from_milliseconds(long bufferSizeInMilliseconds, long sampleRate) {
        return ma_calculate_buffer_size_in_frames_from_milliseconds_internal(bufferSizeInMilliseconds, sampleRate);
    }

    public static native long ma_calculate_buffer_size_in_frames_from_milliseconds_internal(long bufferSizeInMilliseconds, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, bufferSizeInMilliseconds, 0, return 0);
    	return (jlong)ma_calculate_buffer_size_in_frames_from_milliseconds((ma_uint32)bufferSizeInMilliseconds, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_copy_pcm_frames(VoidPointer dst, VoidPointer src, long frameCount, ma_format format, long channels) {
        ma_copy_pcm_frames_internal(dst.getPointer(), src.getPointer(), frameCount, format.getIndex(), channels);
    }

    public static native void ma_copy_pcm_frames_internal(long dst, long src, long frameCount, int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_pcm_frames((void *)dst, (const void *)src, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_silence_pcm_frames(VoidPointer p, long frameCount, ma_format format, long channels) {
        ma_silence_pcm_frames_internal(p.getPointer(), frameCount, format.getIndex(), channels);
    }

    public static native void ma_silence_pcm_frames_internal(long p, long frameCount, int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_silence_pcm_frames((void *)p, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static VoidPointer ma_offset_pcm_frames_ptr(VoidPointer p, long offsetInFrames, ma_format format, long channels) {
        return new VoidPointer(ma_offset_pcm_frames_ptr_internal(p.getPointer(), offsetInFrames, format.getIndex(), channels), false);
    }

    public static void ma_offset_pcm_frames_ptr(VoidPointer p, long offsetInFrames, ma_format format, long channels, VoidPointer _retPar) {
        _retPar.setPointer(ma_offset_pcm_frames_ptr_internal(p.getPointer(), offsetInFrames, format.getIndex(), channels));
    }

    public static native long ma_offset_pcm_frames_ptr_internal(long p, long offsetInFrames, int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, offsetInFrames, 1, return 0);
    	return (jlong)ma_offset_pcm_frames_ptr((void *)p, (ma_uint64)offsetInFrames, (ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_offset_pcm_frames_const_ptr(VoidPointer p, long offsetInFrames, ma_format format, long channels) {
        return new VoidPointer(ma_offset_pcm_frames_const_ptr_internal(p.getPointer(), offsetInFrames, format.getIndex(), channels), false);
    }

    public static void ma_offset_pcm_frames_const_ptr(VoidPointer p, long offsetInFrames, ma_format format, long channels, VoidPointer _retPar) {
        _retPar.setPointer(ma_offset_pcm_frames_const_ptr_internal(p.getPointer(), offsetInFrames, format.getIndex(), channels));
    }

    public static native long ma_offset_pcm_frames_const_ptr_internal(long p, long offsetInFrames, int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, offsetInFrames, 1, return 0);
    	return (jlong)ma_offset_pcm_frames_const_ptr((const void *)p, (ma_uint64)offsetInFrames, (ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static FloatPointer ma_offset_pcm_frames_ptr_f32(FloatPointer p, long offsetInFrames, long channels) {
        return new FloatPointer(ma_offset_pcm_frames_ptr_f32_internal(p.getPointer(), offsetInFrames, channels), false);
    }

    public static void ma_offset_pcm_frames_ptr_f32(FloatPointer p, long offsetInFrames, long channels, FloatPointer _retPar) {
        _retPar.setPointer(ma_offset_pcm_frames_ptr_f32_internal(p.getPointer(), offsetInFrames, channels));
    }

    public static native long ma_offset_pcm_frames_ptr_f32_internal(long p, long offsetInFrames, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, offsetInFrames, 1, return 0);
    	return (jlong)ma_offset_pcm_frames_ptr_f32((float *)p, (ma_uint64)offsetInFrames, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static FloatPointer ma_offset_pcm_frames_const_ptr_f32(FloatPointer p, long offsetInFrames, long channels) {
        return new FloatPointer(ma_offset_pcm_frames_const_ptr_f32_internal(p.getPointer(), offsetInFrames, channels), false);
    }

    public static void ma_offset_pcm_frames_const_ptr_f32(FloatPointer p, long offsetInFrames, long channels, FloatPointer _retPar) {
        _retPar.setPointer(ma_offset_pcm_frames_const_ptr_f32_internal(p.getPointer(), offsetInFrames, channels));
    }

    public static native long ma_offset_pcm_frames_const_ptr_f32_internal(long p, long offsetInFrames, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, offsetInFrames, 1, return 0);
    	return (jlong)ma_offset_pcm_frames_const_ptr_f32((const float *)p, (ma_uint64)offsetInFrames, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_clip_samples_u8(UBytePointer pDst, SShortPointer pSrc, long count) {
        ma_clip_samples_u8_internal(pDst.getPointer(), pSrc.getPointer(), count);
    }

    public static native void ma_clip_samples_u8_internal(long pDst, long pSrc, long count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_clip_samples_u8((ma_uint8 *)pDst, (const ma_int16 *)pSrc, (ma_uint64)count);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_clip_samples_s16(SShortPointer pDst, SIntPointer pSrc, long count) {
        ma_clip_samples_s16_internal(pDst.getPointer(), pSrc.getPointer(), count);
    }

    public static native void ma_clip_samples_s16_internal(long pDst, long pSrc, long count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_clip_samples_s16((ma_int16 *)pDst, (const ma_int32 *)pSrc, (ma_uint64)count);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_clip_samples_s24(UBytePointer pDst, SInt64Pointer pSrc, long count) {
        ma_clip_samples_s24_internal(pDst.getPointer(), pSrc.getPointer(), count);
    }

    public static native void ma_clip_samples_s24_internal(long pDst, long pSrc, long count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_clip_samples_s24((ma_uint8 *)pDst, (const ma_int64 *)pSrc, (ma_uint64)count);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_clip_samples_s32(SIntPointer pDst, SInt64Pointer pSrc, long count) {
        ma_clip_samples_s32_internal(pDst.getPointer(), pSrc.getPointer(), count);
    }

    public static native void ma_clip_samples_s32_internal(long pDst, long pSrc, long count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_clip_samples_s32((ma_int32 *)pDst, (const ma_int64 *)pSrc, (ma_uint64)count);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_clip_samples_f32(FloatPointer pDst, FloatPointer pSrc, long count) {
        ma_clip_samples_f32_internal(pDst.getPointer(), pSrc.getPointer(), count);
    }

    public static native void ma_clip_samples_f32_internal(long pDst, long pSrc, long count);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_clip_samples_f32((float *)pDst, (const float *)pSrc, (ma_uint64)count);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_clip_pcm_frames(VoidPointer pDst, VoidPointer pSrc, long frameCount, ma_format format, long channels) {
        ma_clip_pcm_frames_internal(pDst.getPointer(), pSrc.getPointer(), frameCount, format.getIndex(), channels);
    }

    public static native void ma_clip_pcm_frames_internal(long pDst, long pSrc, long frameCount, int format, long channels);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_clip_pcm_frames((void *)pDst, (const void *)pSrc, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_u8(UBytePointer pSamplesOut, UBytePointer pSamplesIn, long sampleCount, float factor) {
        ma_copy_and_apply_volume_factor_u8_internal(pSamplesOut.getPointer(), pSamplesIn.getPointer(), sampleCount, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_u8_internal(long pSamplesOut, long pSamplesIn, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 2, return);
    	ma_copy_and_apply_volume_factor_u8((ma_uint8 *)pSamplesOut, (const ma_uint8 *)pSamplesIn, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_s16(SShortPointer pSamplesOut, SShortPointer pSamplesIn, long sampleCount, float factor) {
        ma_copy_and_apply_volume_factor_s16_internal(pSamplesOut.getPointer(), pSamplesIn.getPointer(), sampleCount, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_s16_internal(long pSamplesOut, long pSamplesIn, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 2, return);
    	ma_copy_and_apply_volume_factor_s16((ma_int16 *)pSamplesOut, (const ma_int16 *)pSamplesIn, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_s24(VoidPointer pSamplesOut, VoidPointer pSamplesIn, long sampleCount, float factor) {
        ma_copy_and_apply_volume_factor_s24_internal(pSamplesOut.getPointer(), pSamplesIn.getPointer(), sampleCount, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_s24_internal(long pSamplesOut, long pSamplesIn, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 2, return);
    	ma_copy_and_apply_volume_factor_s24((void *)pSamplesOut, (const void *)pSamplesIn, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_s32(SIntPointer pSamplesOut, SIntPointer pSamplesIn, long sampleCount, float factor) {
        ma_copy_and_apply_volume_factor_s32_internal(pSamplesOut.getPointer(), pSamplesIn.getPointer(), sampleCount, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_s32_internal(long pSamplesOut, long pSamplesIn, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 2, return);
    	ma_copy_and_apply_volume_factor_s32((ma_int32 *)pSamplesOut, (const ma_int32 *)pSamplesIn, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_f32(FloatPointer pSamplesOut, FloatPointer pSamplesIn, long sampleCount, float factor) {
        ma_copy_and_apply_volume_factor_f32_internal(pSamplesOut.getPointer(), pSamplesIn.getPointer(), sampleCount, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_f32_internal(long pSamplesOut, long pSamplesIn, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 2, return);
    	ma_copy_and_apply_volume_factor_f32((float *)pSamplesOut, (const float *)pSamplesIn, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_u8(UBytePointer pSamples, long sampleCount, float factor) {
        ma_apply_volume_factor_u8_internal(pSamples.getPointer(), sampleCount, factor);
    }

    public static native void ma_apply_volume_factor_u8_internal(long pSamples, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 1, return);
    	ma_apply_volume_factor_u8((ma_uint8 *)pSamples, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_s16(SShortPointer pSamples, long sampleCount, float factor) {
        ma_apply_volume_factor_s16_internal(pSamples.getPointer(), sampleCount, factor);
    }

    public static native void ma_apply_volume_factor_s16_internal(long pSamples, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 1, return);
    	ma_apply_volume_factor_s16((ma_int16 *)pSamples, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_s24(VoidPointer pSamples, long sampleCount, float factor) {
        ma_apply_volume_factor_s24_internal(pSamples.getPointer(), sampleCount, factor);
    }

    public static native void ma_apply_volume_factor_s24_internal(long pSamples, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 1, return);
    	ma_apply_volume_factor_s24((void *)pSamples, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_s32(SIntPointer pSamples, long sampleCount, float factor) {
        ma_apply_volume_factor_s32_internal(pSamples.getPointer(), sampleCount, factor);
    }

    public static native void ma_apply_volume_factor_s32_internal(long pSamples, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 1, return);
    	ma_apply_volume_factor_s32((ma_int32 *)pSamples, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_f32(FloatPointer pSamples, long sampleCount, float factor) {
        ma_apply_volume_factor_f32_internal(pSamples.getPointer(), sampleCount, factor);
    }

    public static native void ma_apply_volume_factor_f32_internal(long pSamples, long sampleCount, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, sampleCount, 1, return);
    	ma_apply_volume_factor_f32((float *)pSamples, (ma_uint64)sampleCount, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames_u8(UBytePointer pFramesOut, UBytePointer pFramesIn, long frameCount, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_u8_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_u8_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames_u8((ma_uint8 *)pFramesOut, (const ma_uint8 *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames_s16(SShortPointer pFramesOut, SShortPointer pFramesIn, long frameCount, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_s16_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_s16_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames_s16((ma_int16 *)pFramesOut, (const ma_int16 *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames_s24(VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_s24_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_s24_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames_s24((void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames_s32(SIntPointer pFramesOut, SIntPointer pFramesIn, long frameCount, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_s32_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_s32_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames_s32((ma_int32 *)pFramesOut, (const ma_int32 *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames_f32(FloatPointer pFramesOut, FloatPointer pFramesIn, long frameCount, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_f32_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_f32_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames_f32((float *)pFramesOut, (const float *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_pcm_frames(VoidPointer pFramesOut, VoidPointer pFramesIn, long frameCount, ma_format format, long channels, float factor) {
        ma_copy_and_apply_volume_factor_pcm_frames_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, format.getIndex(), channels, factor);
    }

    public static native void ma_copy_and_apply_volume_factor_pcm_frames_internal(long pFramesOut, long pFramesIn, long frameCount, int format, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_pcm_frames((void *)pFramesOut, (const void *)pFramesIn, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames_u8(UBytePointer pFrames, long frameCount, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_u8_internal(pFrames.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_u8_internal(long pFrames, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames_u8((ma_uint8 *)pFrames, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames_s16(SShortPointer pFrames, long frameCount, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_s16_internal(pFrames.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_s16_internal(long pFrames, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames_s16((ma_int16 *)pFrames, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames_s24(VoidPointer pFrames, long frameCount, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_s24_internal(pFrames.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_s24_internal(long pFrames, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames_s24((void *)pFrames, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames_s32(SIntPointer pFrames, long frameCount, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_s32_internal(pFrames.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_s32_internal(long pFrames, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames_s32((ma_int32 *)pFrames, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames_f32(FloatPointer pFrames, long frameCount, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_f32_internal(pFrames.getPointer(), frameCount, channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_f32_internal(long pFrames, long frameCount, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames_f32((float *)pFrames, (ma_uint64)frameCount, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_apply_volume_factor_pcm_frames(VoidPointer pFrames, long frameCount, ma_format format, long channels, float factor) {
        ma_apply_volume_factor_pcm_frames_internal(pFrames.getPointer(), frameCount, format.getIndex(), channels, factor);
    }

    public static native void ma_apply_volume_factor_pcm_frames_internal(long pFrames, long frameCount, int format, long channels, float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 1, return);
    	ma_apply_volume_factor_pcm_frames((void *)pFrames, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels, (float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_factor_per_channel_f32(FloatPointer pFramesOut, FloatPointer pFramesIn, long frameCount, long channels, FloatPointer pChannelGains) {
        ma_copy_and_apply_volume_factor_per_channel_f32_internal(pFramesOut.getPointer(), pFramesIn.getPointer(), frameCount, channels, pChannelGains.getPointer());
    }

    public static native void ma_copy_and_apply_volume_factor_per_channel_f32_internal(long pFramesOut, long pFramesIn, long frameCount, long channels, long pChannelGains);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_factor_per_channel_f32((float *)pFramesOut, (const float *)pFramesIn, (ma_uint64)frameCount, (ma_uint32)channels, (float *)pChannelGains);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_samples_u8(UBytePointer pDst, SShortPointer pSrc, long count, float volume) {
        ma_copy_and_apply_volume_and_clip_samples_u8_internal(pDst.getPointer(), pSrc.getPointer(), count, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_samples_u8_internal(long pDst, long pSrc, long count, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_copy_and_apply_volume_and_clip_samples_u8((ma_uint8 *)pDst, (const ma_int16 *)pSrc, (ma_uint64)count, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_samples_s16(SShortPointer pDst, SIntPointer pSrc, long count, float volume) {
        ma_copy_and_apply_volume_and_clip_samples_s16_internal(pDst.getPointer(), pSrc.getPointer(), count, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_samples_s16_internal(long pDst, long pSrc, long count, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_copy_and_apply_volume_and_clip_samples_s16((ma_int16 *)pDst, (const ma_int32 *)pSrc, (ma_uint64)count, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_samples_s24(UBytePointer pDst, SInt64Pointer pSrc, long count, float volume) {
        ma_copy_and_apply_volume_and_clip_samples_s24_internal(pDst.getPointer(), pSrc.getPointer(), count, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_samples_s24_internal(long pDst, long pSrc, long count, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_copy_and_apply_volume_and_clip_samples_s24((ma_uint8 *)pDst, (const ma_int64 *)pSrc, (ma_uint64)count, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_samples_s32(SIntPointer pDst, SInt64Pointer pSrc, long count, float volume) {
        ma_copy_and_apply_volume_and_clip_samples_s32_internal(pDst.getPointer(), pSrc.getPointer(), count, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_samples_s32_internal(long pDst, long pSrc, long count, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_copy_and_apply_volume_and_clip_samples_s32((ma_int32 *)pDst, (const ma_int64 *)pSrc, (ma_uint64)count, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_samples_f32(FloatPointer pDst, FloatPointer pSrc, long count, float volume) {
        ma_copy_and_apply_volume_and_clip_samples_f32_internal(pDst.getPointer(), pSrc.getPointer(), count, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_samples_f32_internal(long pDst, long pSrc, long count, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, count, 2, return);
    	ma_copy_and_apply_volume_and_clip_samples_f32((float *)pDst, (const float *)pSrc, (ma_uint64)count, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_copy_and_apply_volume_and_clip_pcm_frames(VoidPointer pDst, VoidPointer pSrc, long frameCount, ma_format format, long channels, float volume) {
        ma_copy_and_apply_volume_and_clip_pcm_frames_internal(pDst.getPointer(), pSrc.getPointer(), frameCount, format.getIndex(), channels, volume);
    }

    public static native void ma_copy_and_apply_volume_and_clip_pcm_frames_internal(long pDst, long pSrc, long frameCount, int format, long channels, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return);
    	ma_copy_and_apply_volume_and_clip_pcm_frames((void *)pDst, (const void *)pSrc, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_volume_linear_to_db(float factor) {
        return ma_volume_linear_to_db_internal(factor);
    }

    public static native float ma_volume_linear_to_db_internal(float factor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_volume_linear_to_db((float)factor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static float ma_volume_db_to_linear(float gain) {
        return ma_volume_db_to_linear_internal(gain);
    }

    public static native float ma_volume_db_to_linear_internal(float gain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_volume_db_to_linear((float)gain);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_mix_pcm_frames_f32(FloatPointer pDst, FloatPointer pSrc, long frameCount, long channels, float volume) {
        return ma_result.getByIndex((int) ma_mix_pcm_frames_f32_internal(pDst.getPointer(), pSrc.getPointer(), frameCount, channels, volume));
    }

    public static native int ma_mix_pcm_frames_f32_internal(long pDst, long pSrc, long frameCount, long channels, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_mix_pcm_frames_f32((float *)pDst, (const float *)pSrc, (ma_uint64)frameCount, (ma_uint32)channels, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_open(VoidPointer pVFS, BytePointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile) {
        return ma_result.getByIndex((int) ma_vfs_open_internal(pVFS.getPointer(), pFilePath.getPointer(), openMode, pFile.getPointer()));
    }

    public static native int ma_vfs_open_internal(long pVFS, long pFilePath, long openMode, long pFile);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, openMode, 2, return 0);
    	return (jint)ma_vfs_open((ma_vfs *)pVFS, (const char *)pFilePath, (ma_uint32)openMode, (ma_vfs_file *)pFile);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_open_w(VoidPointer pVFS, SIntPointer pFilePath, long openMode, PointerPointer<VoidPointer> pFile) {
        return ma_result.getByIndex((int) ma_vfs_open_w_internal(pVFS.getPointer(), pFilePath.getPointer(), openMode, pFile.getPointer()));
    }

    public static native int ma_vfs_open_w_internal(long pVFS, long pFilePath, long openMode, long pFile);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, openMode, 2, return 0);
    	return (jint)ma_vfs_open_w((ma_vfs *)pVFS, (const wchar_t *)pFilePath, (ma_uint32)openMode, (ma_vfs_file *)pFile);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_close(VoidPointer pVFS, VoidPointer file) {
        return ma_result.getByIndex((int) ma_vfs_close_internal(pVFS.getPointer(), file.getPointer()));
    }

    public static native int ma_vfs_close_internal(long pVFS, long file);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_vfs_close((ma_vfs *)pVFS, (ma_vfs_file)file);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_read(VoidPointer pVFS, VoidPointer file, VoidPointer pDst, long sizeInBytes, ULongPointer pBytesRead) {
        return ma_result.getByIndex((int) ma_vfs_read_internal(pVFS.getPointer(), file.getPointer(), pDst.getPointer(), sizeInBytes, pBytesRead.getPointer()));
    }

    public static native int ma_vfs_read_internal(long pVFS, long file, long pDst, long sizeInBytes, long pBytesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 3, return 0);
    	return (jint)ma_vfs_read((ma_vfs *)pVFS, (ma_vfs_file)file, (void *)pDst, (size_t)sizeInBytes, (size_t *)pBytesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_write(VoidPointer pVFS, VoidPointer file, VoidPointer pSrc, long sizeInBytes, ULongPointer pBytesWritten) {
        return ma_result.getByIndex((int) ma_vfs_write_internal(pVFS.getPointer(), file.getPointer(), pSrc.getPointer(), sizeInBytes, pBytesWritten.getPointer()));
    }

    public static native int ma_vfs_write_internal(long pVFS, long file, long pSrc, long sizeInBytes, long pBytesWritten);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 3, return 0);
    	return (jint)ma_vfs_write((ma_vfs *)pVFS, (ma_vfs_file)file, (const void *)pSrc, (size_t)sizeInBytes, (size_t *)pBytesWritten);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_seek(VoidPointer pVFS, VoidPointer file, long offset, ma_seek_origin origin) {
        return ma_result.getByIndex((int) ma_vfs_seek_internal(pVFS.getPointer(), file.getPointer(), offset, origin.getIndex()));
    }

    public static native int ma_vfs_seek_internal(long pVFS, long file, long offset, int origin);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_int64, offset, 2, return 0);
    	return (jint)ma_vfs_seek((ma_vfs *)pVFS, (ma_vfs_file)file, (ma_int64)offset, (ma_seek_origin)origin);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_tell(VoidPointer pVFS, VoidPointer file, SInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_vfs_tell_internal(pVFS.getPointer(), file.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_vfs_tell_internal(long pVFS, long file, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_vfs_tell((ma_vfs *)pVFS, (ma_vfs_file)file, (ma_int64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_info(VoidPointer pVFS, VoidPointer file, ma_file_info.ma_file_infoPointer pInfo) {
        return ma_result.getByIndex((int) ma_vfs_info_internal(pVFS.getPointer(), file.getPointer(), pInfo.getPointer()));
    }

    public static native int ma_vfs_info_internal(long pVFS, long file, long pInfo);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_vfs_info((ma_vfs *)pVFS, (ma_vfs_file)file, (ma_file_info *)pInfo);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_vfs_open_and_read_file(VoidPointer pVFS, BytePointer pFilePath, PointerPointer<VoidPointer> ppData, ULongPointer pSize, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return ma_result.getByIndex((int) ma_vfs_open_and_read_file_internal(pVFS.getPointer(), pFilePath.getPointer(), ppData.getPointer(), pSize.getPointer(), pAllocationCallbacks.getPointer()));
    }

    public static native int ma_vfs_open_and_read_file_internal(long pVFS, long pFilePath, long ppData, long pSize, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_vfs_open_and_read_file((ma_vfs *)pVFS, (const char *)pFilePath, (void **)ppData, (size_t *)pSize, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_default_vfs_init(ma_default_vfs.ma_default_vfsPointer pVFS, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        return ma_result.getByIndex((int) ma_default_vfs_init_internal(pVFS.getPointer(), pAllocationCallbacks.getPointer()));
    }

    public static native int ma_default_vfs_init_internal(long pVFS, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_default_vfs_init((ma_default_vfs *)pVFS, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_decoding_backend_config ma_decoding_backend_config_init(ma_format preferredFormat, long seekPointCount) {
        return new ma_decoding_backend_config(ma_decoding_backend_config_init_internal(preferredFormat.getIndex(), seekPointCount, 0), true);
    }

    public static void ma_decoding_backend_config_init(ma_format preferredFormat, long seekPointCount, ma_decoding_backend_config _retPar) {
        ma_decoding_backend_config_init_internal(preferredFormat.getIndex(), seekPointCount, _retPar.getPointer());
    }

    public static native long ma_decoding_backend_config_init_internal(int preferredFormat, long seekPointCount, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, seekPointCount, 1, return 0);
    	ma_decoding_backend_config* _ret = (ma_decoding_backend_config*) (_retPar == 0 ? malloc(sizeof(ma_decoding_backend_config)) : (void*)_retPar);
    	*_ret = ma_decoding_backend_config_init((ma_format)preferredFormat, (ma_uint32)seekPointCount);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_decoder_config ma_decoder_config_init(ma_format outputFormat, long outputChannels, long outputSampleRate) {
        return new ma_decoder_config(ma_decoder_config_init_internal(outputFormat.getIndex(), outputChannels, outputSampleRate, 0), true);
    }

    public static void ma_decoder_config_init(ma_format outputFormat, long outputChannels, long outputSampleRate, ma_decoder_config _retPar) {
        ma_decoder_config_init_internal(outputFormat.getIndex(), outputChannels, outputSampleRate, _retPar.getPointer());
    }

    public static native long ma_decoder_config_init_internal(int outputFormat, long outputChannels, long outputSampleRate, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputSampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputChannels, 1, return 0);
    	ma_decoder_config* _ret = (ma_decoder_config*) (_retPar == 0 ? malloc(sizeof(ma_decoder_config)) : (void*)_retPar);
    	*_ret = ma_decoder_config_init((ma_format)outputFormat, (ma_uint32)outputChannels, (ma_uint32)outputSampleRate);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_decoder_config ma_decoder_config_init_default() {
        return new ma_decoder_config(ma_decoder_config_init_default_internal(0), true);
    }

    public static void ma_decoder_config_init_default(ma_decoder_config _retPar) {
        ma_decoder_config_init_default_internal(_retPar.getPointer());
    }

    public static native long ma_decoder_config_init_default_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_decoder_config* _ret = (ma_decoder_config*) (_retPar == 0 ? malloc(sizeof(ma_decoder_config)) : (void*)_retPar);
    	*_ret = ma_decoder_config_init_default();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init(ClosureObject<GdxMiniaudio.ma_decoder_read_proc> onRead, ClosureObject<GdxMiniaudio.ma_decoder_seek_proc> onSeek, VoidPointer pUserData, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_internal(onRead.getPointer(), onSeek.getPointer(), pUserData.getPointer(), pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_internal(long onRead, long onSeek, long pUserData, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_init((ma_decoder_read_proc)onRead, (ma_decoder_seek_proc)onSeek, (void *)pUserData, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init_memory(VoidPointer pData, long dataSize, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_memory_internal(pData.getPointer(), dataSize, pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_memory_internal(long pData, long dataSize, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, dataSize, 1, return 0);
    	return (jint)ma_decoder_init_memory((const void *)pData, (size_t)dataSize, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init_vfs(VoidPointer pVFS, BytePointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_vfs_internal(pVFS.getPointer(), pFilePath.getPointer(), pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_vfs_internal(long pVFS, long pFilePath, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_init_vfs((ma_vfs *)pVFS, (const char *)pFilePath, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init_vfs_w(VoidPointer pVFS, SIntPointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_vfs_w_internal(pVFS.getPointer(), pFilePath.getPointer(), pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_vfs_w_internal(long pVFS, long pFilePath, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_init_vfs_w((ma_vfs *)pVFS, (const wchar_t *)pFilePath, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init_file(BytePointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_file_internal(pFilePath.getPointer(), pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_file_internal(long pFilePath, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_init_file((const char *)pFilePath, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_init_file_w(SIntPointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_init_file_w_internal(pFilePath.getPointer(), pConfig.getPointer(), pDecoder.getPointer()));
    }

    public static native int ma_decoder_init_file_w_internal(long pFilePath, long pConfig, long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_init_file_w((const wchar_t *)pFilePath, (const ma_decoder_config *)pConfig, (ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_uninit(ma_decoder.ma_decoderPointer pDecoder) {
        return ma_result.getByIndex((int) ma_decoder_uninit_internal(pDecoder.getPointer()));
    }

    public static native int ma_decoder_uninit_internal(long pDecoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_uninit((ma_decoder *)pDecoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_read_pcm_frames(ma_decoder.ma_decoderPointer pDecoder, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_decoder_read_pcm_frames_internal(pDecoder.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_decoder_read_pcm_frames_internal(long pDecoder, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_decoder_read_pcm_frames((ma_decoder *)pDecoder, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_seek_to_pcm_frame(ma_decoder.ma_decoderPointer pDecoder, long frameIndex) {
        return ma_result.getByIndex((int) ma_decoder_seek_to_pcm_frame_internal(pDecoder.getPointer(), frameIndex));
    }

    public static native int ma_decoder_seek_to_pcm_frame_internal(long pDecoder, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_decoder_seek_to_pcm_frame((ma_decoder *)pDecoder, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_get_data_format(ma_decoder.ma_decoderPointer pDecoder, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_decoder_get_data_format_internal(pDecoder.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_decoder_get_data_format_internal(long pDecoder, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_decoder_get_data_format((ma_decoder *)pDecoder, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_get_cursor_in_pcm_frames(ma_decoder.ma_decoderPointer pDecoder, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_decoder_get_cursor_in_pcm_frames_internal(pDecoder.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_decoder_get_cursor_in_pcm_frames_internal(long pDecoder, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_get_cursor_in_pcm_frames((ma_decoder *)pDecoder, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_get_length_in_pcm_frames(ma_decoder.ma_decoderPointer pDecoder, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_decoder_get_length_in_pcm_frames_internal(pDecoder.getPointer(), pLength.getPointer()));
    }

    public static native int ma_decoder_get_length_in_pcm_frames_internal(long pDecoder, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_get_length_in_pcm_frames((ma_decoder *)pDecoder, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decoder_get_available_frames(ma_decoder.ma_decoderPointer pDecoder, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_decoder_get_available_frames_internal(pDecoder.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_decoder_get_available_frames_internal(long pDecoder, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decoder_get_available_frames((ma_decoder *)pDecoder, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decode_from_vfs(VoidPointer pVFS, BytePointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, UInt64Pointer pFrameCountOut, PointerPointer<VoidPointer> ppPCMFramesOut) {
        return ma_result.getByIndex((int) ma_decode_from_vfs_internal(pVFS.getPointer(), pFilePath.getPointer(), pConfig.getPointer(), pFrameCountOut.getPointer(), ppPCMFramesOut.getPointer()));
    }

    public static native int ma_decode_from_vfs_internal(long pVFS, long pFilePath, long pConfig, long pFrameCountOut, long ppPCMFramesOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decode_from_vfs((ma_vfs *)pVFS, (const char *)pFilePath, (ma_decoder_config *)pConfig, (ma_uint64 *)pFrameCountOut, (void **)ppPCMFramesOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decode_file(BytePointer pFilePath, ma_decoder_config.ma_decoder_configPointer pConfig, UInt64Pointer pFrameCountOut, PointerPointer<VoidPointer> ppPCMFramesOut) {
        return ma_result.getByIndex((int) ma_decode_file_internal(pFilePath.getPointer(), pConfig.getPointer(), pFrameCountOut.getPointer(), ppPCMFramesOut.getPointer()));
    }

    public static native int ma_decode_file_internal(long pFilePath, long pConfig, long pFrameCountOut, long ppPCMFramesOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_decode_file((const char *)pFilePath, (ma_decoder_config *)pConfig, (ma_uint64 *)pFrameCountOut, (void **)ppPCMFramesOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_decode_memory(VoidPointer pData, long dataSize, ma_decoder_config.ma_decoder_configPointer pConfig, UInt64Pointer pFrameCountOut, PointerPointer<VoidPointer> ppPCMFramesOut) {
        return ma_result.getByIndex((int) ma_decode_memory_internal(pData.getPointer(), dataSize, pConfig.getPointer(), pFrameCountOut.getPointer(), ppPCMFramesOut.getPointer()));
    }

    public static native int ma_decode_memory_internal(long pData, long dataSize, long pConfig, long pFrameCountOut, long ppPCMFramesOut);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, dataSize, 1, return 0);
    	return (jint)ma_decode_memory((const void *)pData, (size_t)dataSize, (ma_decoder_config *)pConfig, (ma_uint64 *)pFrameCountOut, (void **)ppPCMFramesOut);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_encoder_config ma_encoder_config_init(ma_encoding_format encodingFormat, ma_format format, long channels, long sampleRate) {
        return new ma_encoder_config(ma_encoder_config_init_internal(encodingFormat.getIndex(), format.getIndex(), channels, sampleRate, 0), true);
    }

    public static void ma_encoder_config_init(ma_encoding_format encodingFormat, ma_format format, long channels, long sampleRate, ma_encoder_config _retPar) {
        ma_encoder_config_init_internal(encodingFormat.getIndex(), format.getIndex(), channels, sampleRate, _retPar.getPointer());
    }

    public static native long ma_encoder_config_init_internal(int encodingFormat, int format, long channels, long sampleRate, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 2, return 0);
    	ma_encoder_config* _ret = (ma_encoder_config*) (_retPar == 0 ? malloc(sizeof(ma_encoder_config)) : (void*)_retPar);
    	*_ret = ma_encoder_config_init((ma_encoding_format)encodingFormat, (ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_encoder_init(ClosureObject<GdxMiniaudio.ma_encoder_write_proc> onWrite, ClosureObject<GdxMiniaudio.ma_encoder_seek_proc> onSeek, VoidPointer pUserData, ma_encoder_config.ma_encoder_configPointer pConfig, ma_encoder.ma_encoderPointer pEncoder) {
        return ma_result.getByIndex((int) ma_encoder_init_internal(onWrite.getPointer(), onSeek.getPointer(), pUserData.getPointer(), pConfig.getPointer(), pEncoder.getPointer()));
    }

    public static native int ma_encoder_init_internal(long onWrite, long onSeek, long pUserData, long pConfig, long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_encoder_init((ma_encoder_write_proc)onWrite, (ma_encoder_seek_proc)onSeek, (void *)pUserData, (const ma_encoder_config *)pConfig, (ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_encoder_init_vfs(VoidPointer pVFS, BytePointer pFilePath, ma_encoder_config.ma_encoder_configPointer pConfig, ma_encoder.ma_encoderPointer pEncoder) {
        return ma_result.getByIndex((int) ma_encoder_init_vfs_internal(pVFS.getPointer(), pFilePath.getPointer(), pConfig.getPointer(), pEncoder.getPointer()));
    }

    public static native int ma_encoder_init_vfs_internal(long pVFS, long pFilePath, long pConfig, long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_encoder_init_vfs((ma_vfs *)pVFS, (const char *)pFilePath, (const ma_encoder_config *)pConfig, (ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_encoder_init_vfs_w(VoidPointer pVFS, SIntPointer pFilePath, ma_encoder_config.ma_encoder_configPointer pConfig, ma_encoder.ma_encoderPointer pEncoder) {
        return ma_result.getByIndex((int) ma_encoder_init_vfs_w_internal(pVFS.getPointer(), pFilePath.getPointer(), pConfig.getPointer(), pEncoder.getPointer()));
    }

    public static native int ma_encoder_init_vfs_w_internal(long pVFS, long pFilePath, long pConfig, long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_encoder_init_vfs_w((ma_vfs *)pVFS, (const wchar_t *)pFilePath, (const ma_encoder_config *)pConfig, (ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_encoder_init_file(BytePointer pFilePath, ma_encoder_config.ma_encoder_configPointer pConfig, ma_encoder.ma_encoderPointer pEncoder) {
        return ma_result.getByIndex((int) ma_encoder_init_file_internal(pFilePath.getPointer(), pConfig.getPointer(), pEncoder.getPointer()));
    }

    public static native int ma_encoder_init_file_internal(long pFilePath, long pConfig, long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_encoder_init_file((const char *)pFilePath, (const ma_encoder_config *)pConfig, (ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_encoder_init_file_w(SIntPointer pFilePath, ma_encoder_config.ma_encoder_configPointer pConfig, ma_encoder.ma_encoderPointer pEncoder) {
        return ma_result.getByIndex((int) ma_encoder_init_file_w_internal(pFilePath.getPointer(), pConfig.getPointer(), pEncoder.getPointer()));
    }

    public static native int ma_encoder_init_file_w_internal(long pFilePath, long pConfig, long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_encoder_init_file_w((const wchar_t *)pFilePath, (const ma_encoder_config *)pConfig, (ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_encoder_uninit(ma_encoder.ma_encoderPointer pEncoder) {
        ma_encoder_uninit_internal(pEncoder.getPointer());
    }

    public static native void ma_encoder_uninit_internal(long pEncoder);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_encoder_uninit((ma_encoder *)pEncoder);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_encoder_write_pcm_frames(ma_encoder.ma_encoderPointer pEncoder, VoidPointer pFramesIn, long frameCount, UInt64Pointer pFramesWritten) {
        return ma_result.getByIndex((int) ma_encoder_write_pcm_frames_internal(pEncoder.getPointer(), pFramesIn.getPointer(), frameCount, pFramesWritten.getPointer()));
    }

    public static native int ma_encoder_write_pcm_frames_internal(long pEncoder, long pFramesIn, long frameCount, long pFramesWritten);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_encoder_write_pcm_frames((ma_encoder *)pEncoder, (const void *)pFramesIn, (ma_uint64)frameCount, (ma_uint64 *)pFramesWritten);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_waveform_config ma_waveform_config_init(ma_format format, long channels, long sampleRate, ma_waveform_type type, double amplitude, double frequency) {
        return new ma_waveform_config(ma_waveform_config_init_internal(format.getIndex(), channels, sampleRate, type.getIndex(), amplitude, frequency, 0), true);
    }

    public static void ma_waveform_config_init(ma_format format, long channels, long sampleRate, ma_waveform_type type, double amplitude, double frequency, ma_waveform_config _retPar) {
        ma_waveform_config_init_internal(format.getIndex(), channels, sampleRate, type.getIndex(), amplitude, frequency, _retPar.getPointer());
    }

    public static native long ma_waveform_config_init_internal(int format, long channels, long sampleRate, int type, double amplitude, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_waveform_config* _ret = (ma_waveform_config*) (_retPar == 0 ? malloc(sizeof(ma_waveform_config)) : (void*)_retPar);
    	*_ret = ma_waveform_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (ma_waveform_type)type, (double)amplitude, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_init(ma_waveform_config.ma_waveform_configPointer pConfig, ma_waveform.ma_waveformPointer pWaveform) {
        return ma_result.getByIndex((int) ma_waveform_init_internal(pConfig.getPointer(), pWaveform.getPointer()));
    }

    public static native int ma_waveform_init_internal(long pConfig, long pWaveform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_waveform_init((const ma_waveform_config *)pConfig, (ma_waveform *)pWaveform);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_waveform_uninit(ma_waveform.ma_waveformPointer pWaveform) {
        ma_waveform_uninit_internal(pWaveform.getPointer());
    }

    public static native void ma_waveform_uninit_internal(long pWaveform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_waveform_uninit((ma_waveform *)pWaveform);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_waveform_read_pcm_frames(ma_waveform.ma_waveformPointer pWaveform, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_waveform_read_pcm_frames_internal(pWaveform.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_waveform_read_pcm_frames_internal(long pWaveform, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_waveform_read_pcm_frames((ma_waveform *)pWaveform, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_seek_to_pcm_frame(ma_waveform.ma_waveformPointer pWaveform, long frameIndex) {
        return ma_result.getByIndex((int) ma_waveform_seek_to_pcm_frame_internal(pWaveform.getPointer(), frameIndex));
    }

    public static native int ma_waveform_seek_to_pcm_frame_internal(long pWaveform, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_waveform_seek_to_pcm_frame((ma_waveform *)pWaveform, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_set_amplitude(ma_waveform.ma_waveformPointer pWaveform, double amplitude) {
        return ma_result.getByIndex((int) ma_waveform_set_amplitude_internal(pWaveform.getPointer(), amplitude));
    }

    public static native int ma_waveform_set_amplitude_internal(long pWaveform, double amplitude);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_waveform_set_amplitude((ma_waveform *)pWaveform, (double)amplitude);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_set_frequency(ma_waveform.ma_waveformPointer pWaveform, double frequency) {
        return ma_result.getByIndex((int) ma_waveform_set_frequency_internal(pWaveform.getPointer(), frequency));
    }

    public static native int ma_waveform_set_frequency_internal(long pWaveform, double frequency);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_waveform_set_frequency((ma_waveform *)pWaveform, (double)frequency);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_set_type(ma_waveform.ma_waveformPointer pWaveform, ma_waveform_type type) {
        return ma_result.getByIndex((int) ma_waveform_set_type_internal(pWaveform.getPointer(), type.getIndex()));
    }

    public static native int ma_waveform_set_type_internal(long pWaveform, int type);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_waveform_set_type((ma_waveform *)pWaveform, (ma_waveform_type)type);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_waveform_set_sample_rate(ma_waveform.ma_waveformPointer pWaveform, long sampleRate) {
        return ma_result.getByIndex((int) ma_waveform_set_sample_rate_internal(pWaveform.getPointer(), sampleRate));
    }

    public static native int ma_waveform_set_sample_rate_internal(long pWaveform, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	return (jint)ma_waveform_set_sample_rate((ma_waveform *)pWaveform, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_pulsewave_config ma_pulsewave_config_init(ma_format format, long channels, long sampleRate, double dutyCycle, double amplitude, double frequency) {
        return new ma_pulsewave_config(ma_pulsewave_config_init_internal(format.getIndex(), channels, sampleRate, dutyCycle, amplitude, frequency, 0), true);
    }

    public static void ma_pulsewave_config_init(ma_format format, long channels, long sampleRate, double dutyCycle, double amplitude, double frequency, ma_pulsewave_config _retPar) {
        ma_pulsewave_config_init_internal(format.getIndex(), channels, sampleRate, dutyCycle, amplitude, frequency, _retPar.getPointer());
    }

    public static native long ma_pulsewave_config_init_internal(int format, long channels, long sampleRate, double dutyCycle, double amplitude, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_pulsewave_config* _ret = (ma_pulsewave_config*) (_retPar == 0 ? malloc(sizeof(ma_pulsewave_config)) : (void*)_retPar);
    	*_ret = ma_pulsewave_config_init((ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate, (double)dutyCycle, (double)amplitude, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_init(ma_pulsewave_config.ma_pulsewave_configPointer pConfig, ma_pulsewave.ma_pulsewavePointer pWaveform) {
        return ma_result.getByIndex((int) ma_pulsewave_init_internal(pConfig.getPointer(), pWaveform.getPointer()));
    }

    public static native int ma_pulsewave_init_internal(long pConfig, long pWaveform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pulsewave_init((const ma_pulsewave_config *)pConfig, (ma_pulsewave *)pWaveform);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_pulsewave_uninit(ma_pulsewave.ma_pulsewavePointer pWaveform) {
        ma_pulsewave_uninit_internal(pWaveform.getPointer());
    }

    public static native void ma_pulsewave_uninit_internal(long pWaveform);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_pulsewave_uninit((ma_pulsewave *)pWaveform);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_pulsewave_read_pcm_frames(ma_pulsewave.ma_pulsewavePointer pWaveform, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_pulsewave_read_pcm_frames_internal(pWaveform.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_pulsewave_read_pcm_frames_internal(long pWaveform, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_pulsewave_read_pcm_frames((ma_pulsewave *)pWaveform, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_seek_to_pcm_frame(ma_pulsewave.ma_pulsewavePointer pWaveform, long frameIndex) {
        return ma_result.getByIndex((int) ma_pulsewave_seek_to_pcm_frame_internal(pWaveform.getPointer(), frameIndex));
    }

    public static native int ma_pulsewave_seek_to_pcm_frame_internal(long pWaveform, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_pulsewave_seek_to_pcm_frame((ma_pulsewave *)pWaveform, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_set_amplitude(ma_pulsewave.ma_pulsewavePointer pWaveform, double amplitude) {
        return ma_result.getByIndex((int) ma_pulsewave_set_amplitude_internal(pWaveform.getPointer(), amplitude));
    }

    public static native int ma_pulsewave_set_amplitude_internal(long pWaveform, double amplitude);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pulsewave_set_amplitude((ma_pulsewave *)pWaveform, (double)amplitude);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_set_frequency(ma_pulsewave.ma_pulsewavePointer pWaveform, double frequency) {
        return ma_result.getByIndex((int) ma_pulsewave_set_frequency_internal(pWaveform.getPointer(), frequency));
    }

    public static native int ma_pulsewave_set_frequency_internal(long pWaveform, double frequency);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pulsewave_set_frequency((ma_pulsewave *)pWaveform, (double)frequency);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_set_sample_rate(ma_pulsewave.ma_pulsewavePointer pWaveform, long sampleRate) {
        return ma_result.getByIndex((int) ma_pulsewave_set_sample_rate_internal(pWaveform.getPointer(), sampleRate));
    }

    public static native int ma_pulsewave_set_sample_rate_internal(long pWaveform, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	return (jint)ma_pulsewave_set_sample_rate((ma_pulsewave *)pWaveform, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_pulsewave_set_duty_cycle(ma_pulsewave.ma_pulsewavePointer pWaveform, double dutyCycle) {
        return ma_result.getByIndex((int) ma_pulsewave_set_duty_cycle_internal(pWaveform.getPointer(), dutyCycle));
    }

    public static native int ma_pulsewave_set_duty_cycle_internal(long pWaveform, double dutyCycle);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_pulsewave_set_duty_cycle((ma_pulsewave *)pWaveform, (double)dutyCycle);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_noise_config ma_noise_config_init(ma_format format, long channels, ma_noise_type type, int seed, double amplitude) {
        return new ma_noise_config(ma_noise_config_init_internal(format.getIndex(), channels, type.getIndex(), seed, amplitude, 0), true);
    }

    public static void ma_noise_config_init(ma_format format, long channels, ma_noise_type type, int seed, double amplitude, ma_noise_config _retPar) {
        ma_noise_config_init_internal(format.getIndex(), channels, type.getIndex(), seed, amplitude, _retPar.getPointer());
    }

    public static native long ma_noise_config_init_internal(int format, long channels, int type, int seed, double amplitude, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_int32, seed, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 1, return 0);
    	ma_noise_config* _ret = (ma_noise_config*) (_retPar == 0 ? malloc(sizeof(ma_noise_config)) : (void*)_retPar);
    	*_ret = ma_noise_config_init((ma_format)format, (ma_uint32)channels, (ma_noise_type)type, (ma_int32)seed, (double)amplitude);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_get_heap_size(ma_noise_config.ma_noise_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_noise_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_noise_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_noise_get_heap_size((const ma_noise_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_init_preallocated(ma_noise_config.ma_noise_configPointer pConfig, VoidPointer pHeap, ma_noise.ma_noisePointer pNoise) {
        return ma_result.getByIndex((int) ma_noise_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pNoise.getPointer()));
    }

    public static native int ma_noise_init_preallocated_internal(long pConfig, long pHeap, long pNoise);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_noise_init_preallocated((const ma_noise_config *)pConfig, (void *)pHeap, (ma_noise *)pNoise);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_init(ma_noise_config.ma_noise_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_noise.ma_noisePointer pNoise) {
        return ma_result.getByIndex((int) ma_noise_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNoise.getPointer()));
    }

    public static native int ma_noise_init_internal(long pConfig, long pAllocationCallbacks, long pNoise);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_noise_init((const ma_noise_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_noise *)pNoise);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_noise_uninit(ma_noise.ma_noisePointer pNoise, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_noise_uninit_internal(pNoise.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_noise_uninit_internal(long pNoise, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_noise_uninit((ma_noise *)pNoise, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_noise_read_pcm_frames(ma_noise.ma_noisePointer pNoise, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_noise_read_pcm_frames_internal(pNoise.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_noise_read_pcm_frames_internal(long pNoise, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_noise_read_pcm_frames((ma_noise *)pNoise, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_set_amplitude(ma_noise.ma_noisePointer pNoise, double amplitude) {
        return ma_result.getByIndex((int) ma_noise_set_amplitude_internal(pNoise.getPointer(), amplitude));
    }

    public static native int ma_noise_set_amplitude_internal(long pNoise, double amplitude);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_noise_set_amplitude((ma_noise *)pNoise, (double)amplitude);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_set_seed(ma_noise.ma_noisePointer pNoise, int seed) {
        return ma_result.getByIndex((int) ma_noise_set_seed_internal(pNoise.getPointer(), seed));
    }

    public static native int ma_noise_set_seed_internal(long pNoise, int seed);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_int32, seed, 1, return 0);
    	return (jint)ma_noise_set_seed((ma_noise *)pNoise, (ma_int32)seed);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_noise_set_type(ma_noise.ma_noisePointer pNoise, ma_noise_type type) {
        return ma_result.getByIndex((int) ma_noise_set_type_internal(pNoise.getPointer(), type.getIndex()));
    }

    public static native int ma_noise_set_type_internal(long pNoise, int type);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_noise_set_type((ma_noise *)pNoise, (ma_noise_type)type);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_resource_manager_pipeline_notifications ma_resource_manager_pipeline_notifications_init() {
        return new ma_resource_manager_pipeline_notifications(ma_resource_manager_pipeline_notifications_init_internal(0), true);
    }

    public static void ma_resource_manager_pipeline_notifications_init(ma_resource_manager_pipeline_notifications _retPar) {
        ma_resource_manager_pipeline_notifications_init_internal(_retPar.getPointer());
    }

    public static native long ma_resource_manager_pipeline_notifications_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_resource_manager_pipeline_notifications* _ret = (ma_resource_manager_pipeline_notifications*) (_retPar == 0 ? malloc(sizeof(ma_resource_manager_pipeline_notifications)) : (void*)_retPar);
    	*_ret = ma_resource_manager_pipeline_notifications_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_resource_manager_data_source_config ma_resource_manager_data_source_config_init() {
        return new ma_resource_manager_data_source_config(ma_resource_manager_data_source_config_init_internal(0), true);
    }

    public static void ma_resource_manager_data_source_config_init(ma_resource_manager_data_source_config _retPar) {
        ma_resource_manager_data_source_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_resource_manager_data_source_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_resource_manager_data_source_config* _ret = (ma_resource_manager_data_source_config*) (_retPar == 0 ? malloc(sizeof(ma_resource_manager_data_source_config)) : (void*)_retPar);
    	*_ret = ma_resource_manager_data_source_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_resource_manager_config ma_resource_manager_config_init() {
        return new ma_resource_manager_config(ma_resource_manager_config_init_internal(0), true);
    }

    public static void ma_resource_manager_config_init(ma_resource_manager_config _retPar) {
        ma_resource_manager_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_resource_manager_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_resource_manager_config* _ret = (ma_resource_manager_config*) (_retPar == 0 ? malloc(sizeof(ma_resource_manager_config)) : (void*)_retPar);
    	*_ret = ma_resource_manager_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_init(ma_resource_manager_config.ma_resource_manager_configPointer pConfig, ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        return ma_result.getByIndex((int) ma_resource_manager_init_internal(pConfig.getPointer(), pResourceManager.getPointer()));
    }

    public static native int ma_resource_manager_init_internal(long pConfig, long pResourceManager);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_init((const ma_resource_manager_config *)pConfig, (ma_resource_manager *)pResourceManager);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_resource_manager_uninit(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        ma_resource_manager_uninit_internal(pResourceManager.getPointer());
    }

    public static native void ma_resource_manager_uninit_internal(long pResourceManager);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_resource_manager_uninit((ma_resource_manager *)pResourceManager);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_log.ma_logPointer ma_resource_manager_get_log(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        return new ma_log.ma_logPointer(ma_resource_manager_get_log_internal(pResourceManager.getPointer()), false);
    }

    public static void ma_resource_manager_get_log(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_log.ma_logPointer _retPar) {
        _retPar.setPointer(ma_resource_manager_get_log_internal(pResourceManager.getPointer()));
    }

    public static native long ma_resource_manager_get_log_internal(long pResourceManager);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resource_manager_get_log((ma_resource_manager *)pResourceManager);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_file(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pFilePath, long flags) {
        return ma_result.getByIndex((int) ma_resource_manager_register_file_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags));
    }

    public static native int ma_resource_manager_register_file_internal(long pResourceManager, long pFilePath, long flags);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_register_file((ma_resource_manager *)pResourceManager, (const char *)pFilePath, (ma_uint32)flags);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_file_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pFilePath, long flags) {
        return ma_result.getByIndex((int) ma_resource_manager_register_file_w_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags));
    }

    public static native int ma_resource_manager_register_file_w_internal(long pResourceManager, long pFilePath, long flags);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_register_file_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pFilePath, (ma_uint32)flags);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_decoded_data(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pName, VoidPointer pData, long frameCount, ma_format format, long channels, long sampleRate) {
        return ma_result.getByIndex((int) ma_resource_manager_register_decoded_data_internal(pResourceManager.getPointer(), pName.getPointer(), pData.getPointer(), frameCount, format.getIndex(), channels, sampleRate));
    }

    public static native int ma_resource_manager_register_decoded_data_internal(long pResourceManager, long pName, long pData, long frameCount, int format, long channels, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 6, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 5, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_resource_manager_register_decoded_data((ma_resource_manager *)pResourceManager, (const char *)pName, (const void *)pData, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_decoded_data_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pName, VoidPointer pData, long frameCount, ma_format format, long channels, long sampleRate) {
        return ma_result.getByIndex((int) ma_resource_manager_register_decoded_data_w_internal(pResourceManager.getPointer(), pName.getPointer(), pData.getPointer(), frameCount, format.getIndex(), channels, sampleRate));
    }

    public static native int ma_resource_manager_register_decoded_data_w_internal(long pResourceManager, long pName, long pData, long frameCount, int format, long channels, long sampleRate);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 6, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 5, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 3, return 0);
    	return (jint)ma_resource_manager_register_decoded_data_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pName, (const void *)pData, (ma_uint64)frameCount, (ma_format)format, (ma_uint32)channels, (ma_uint32)sampleRate);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_encoded_data(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pName, VoidPointer pData, long sizeInBytes) {
        return ma_result.getByIndex((int) ma_resource_manager_register_encoded_data_internal(pResourceManager.getPointer(), pName.getPointer(), pData.getPointer(), sizeInBytes));
    }

    public static native int ma_resource_manager_register_encoded_data_internal(long pResourceManager, long pName, long pData, long sizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 3, return 0);
    	return (jint)ma_resource_manager_register_encoded_data((ma_resource_manager *)pResourceManager, (const char *)pName, (const void *)pData, (size_t)sizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_register_encoded_data_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pName, VoidPointer pData, long sizeInBytes) {
        return ma_result.getByIndex((int) ma_resource_manager_register_encoded_data_w_internal(pResourceManager.getPointer(), pName.getPointer(), pData.getPointer(), sizeInBytes));
    }

    public static native int ma_resource_manager_register_encoded_data_w_internal(long pResourceManager, long pName, long pData, long sizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, sizeInBytes, 3, return 0);
    	return (jint)ma_resource_manager_register_encoded_data_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pName, (const void *)pData, (size_t)sizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_unregister_file(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pFilePath) {
        return ma_result.getByIndex((int) ma_resource_manager_unregister_file_internal(pResourceManager.getPointer(), pFilePath.getPointer()));
    }

    public static native int ma_resource_manager_unregister_file_internal(long pResourceManager, long pFilePath);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_unregister_file((ma_resource_manager *)pResourceManager, (const char *)pFilePath);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_unregister_file_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pFilePath) {
        return ma_result.getByIndex((int) ma_resource_manager_unregister_file_w_internal(pResourceManager.getPointer(), pFilePath.getPointer()));
    }

    public static native int ma_resource_manager_unregister_file_w_internal(long pResourceManager, long pFilePath);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_unregister_file_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pFilePath);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_unregister_data(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pName) {
        return ma_result.getByIndex((int) ma_resource_manager_unregister_data_internal(pResourceManager.getPointer(), pName.getPointer()));
    }

    public static native int ma_resource_manager_unregister_data_internal(long pResourceManager, long pName);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_unregister_data((ma_resource_manager *)pResourceManager, (const char *)pName);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_unregister_data_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pName) {
        return ma_result.getByIndex((int) ma_resource_manager_unregister_data_w_internal(pResourceManager.getPointer(), pName.getPointer()));
    }

    public static native int ma_resource_manager_unregister_data_w_internal(long pResourceManager, long pName);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_unregister_data_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pName);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_init_ex(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer pConfig, ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_init_ex_internal(pResourceManager.getPointer(), pConfig.getPointer(), pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_init_ex_internal(long pResourceManager, long pConfig, long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_init_ex((ma_resource_manager *)pResourceManager, (const ma_resource_manager_data_source_config *)pConfig, (ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_init(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pFilePath, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_init_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags, pNotifications.getPointer(), pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_init_internal(long pResourceManager, long pFilePath, long flags, long pNotifications, long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_buffer_init((ma_resource_manager *)pResourceManager, (const char *)pFilePath, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_init_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pFilePath, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_init_w_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags, pNotifications.getPointer(), pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_init_w_internal(long pResourceManager, long pFilePath, long flags, long pNotifications, long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_buffer_init_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pFilePath, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_init_copy(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pExistingDataBuffer, ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_init_copy_internal(pResourceManager.getPointer(), pExistingDataBuffer.getPointer(), pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_init_copy_internal(long pResourceManager, long pExistingDataBuffer, long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_init_copy((ma_resource_manager *)pResourceManager, (const ma_resource_manager_data_buffer *)pExistingDataBuffer, (ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_uninit(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_uninit_internal(pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_uninit_internal(long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_uninit((ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_read_pcm_frames(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_read_pcm_frames_internal(pDataBuffer.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_read_pcm_frames_internal(long pDataBuffer, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_resource_manager_data_buffer_read_pcm_frames((ma_resource_manager_data_buffer *)pDataBuffer, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_seek_to_pcm_frame(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, long frameIndex) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_seek_to_pcm_frame_internal(pDataBuffer.getPointer(), frameIndex));
    }

    public static native int ma_resource_manager_data_buffer_seek_to_pcm_frame_internal(long pDataBuffer, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_resource_manager_data_buffer_seek_to_pcm_frame((ma_resource_manager_data_buffer *)pDataBuffer, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_get_data_format(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_get_data_format_internal(pDataBuffer.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_resource_manager_data_buffer_get_data_format_internal(long pDataBuffer, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_resource_manager_data_buffer_get_data_format((ma_resource_manager_data_buffer *)pDataBuffer, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_get_cursor_in_pcm_frames(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_get_cursor_in_pcm_frames_internal(pDataBuffer.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_get_cursor_in_pcm_frames_internal(long pDataBuffer, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_get_cursor_in_pcm_frames((ma_resource_manager_data_buffer *)pDataBuffer, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_get_length_in_pcm_frames(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_get_length_in_pcm_frames_internal(pDataBuffer.getPointer(), pLength.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_get_length_in_pcm_frames_internal(long pDataBuffer, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_get_length_in_pcm_frames((ma_resource_manager_data_buffer *)pDataBuffer, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_result(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_result_internal(pDataBuffer.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_result_internal(long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_result((const ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_set_looping(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, long isLooping) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_set_looping_internal(pDataBuffer.getPointer(), isLooping));
    }

    public static native int ma_resource_manager_data_buffer_set_looping_internal(long pDataBuffer, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return 0);
    	return (jint)ma_resource_manager_data_buffer_set_looping((ma_resource_manager_data_buffer *)pDataBuffer, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_resource_manager_data_buffer_is_looping(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer) {
        return ma_resource_manager_data_buffer_is_looping_internal(pDataBuffer.getPointer());
    }

    public static native long ma_resource_manager_data_buffer_is_looping_internal(long pDataBuffer);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resource_manager_data_buffer_is_looping((const ma_resource_manager_data_buffer *)pDataBuffer);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_buffer_get_available_frames(ma_resource_manager_data_buffer.ma_resource_manager_data_bufferPointer pDataBuffer, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_resource_manager_data_buffer_get_available_frames_internal(pDataBuffer.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_resource_manager_data_buffer_get_available_frames_internal(long pDataBuffer, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_buffer_get_available_frames((ma_resource_manager_data_buffer *)pDataBuffer, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_init_ex(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer pConfig, ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_init_ex_internal(pResourceManager.getPointer(), pConfig.getPointer(), pDataStream.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_init_ex_internal(long pResourceManager, long pConfig, long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_init_ex((ma_resource_manager *)pResourceManager, (const ma_resource_manager_data_source_config *)pConfig, (ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_init(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pFilePath, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_init_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags, pNotifications.getPointer(), pDataStream.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_init_internal(long pResourceManager, long pFilePath, long flags, long pNotifications, long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_stream_init((ma_resource_manager *)pResourceManager, (const char *)pFilePath, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_init_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pFilePath, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_init_w_internal(pResourceManager.getPointer(), pFilePath.getPointer(), flags, pNotifications.getPointer(), pDataStream.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_init_w_internal(long pResourceManager, long pFilePath, long flags, long pNotifications, long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_stream_init_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pFilePath, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_uninit(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_uninit_internal(pDataStream.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_uninit_internal(long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_uninit((ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_read_pcm_frames(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_read_pcm_frames_internal(pDataStream.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_read_pcm_frames_internal(long pDataStream, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_resource_manager_data_stream_read_pcm_frames((ma_resource_manager_data_stream *)pDataStream, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_seek_to_pcm_frame(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, long frameIndex) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_seek_to_pcm_frame_internal(pDataStream.getPointer(), frameIndex));
    }

    public static native int ma_resource_manager_data_stream_seek_to_pcm_frame_internal(long pDataStream, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_resource_manager_data_stream_seek_to_pcm_frame((ma_resource_manager_data_stream *)pDataStream, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_get_data_format(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_get_data_format_internal(pDataStream.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_resource_manager_data_stream_get_data_format_internal(long pDataStream, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_resource_manager_data_stream_get_data_format((ma_resource_manager_data_stream *)pDataStream, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_get_cursor_in_pcm_frames(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_get_cursor_in_pcm_frames_internal(pDataStream.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_get_cursor_in_pcm_frames_internal(long pDataStream, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_get_cursor_in_pcm_frames((ma_resource_manager_data_stream *)pDataStream, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_get_length_in_pcm_frames(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_get_length_in_pcm_frames_internal(pDataStream.getPointer(), pLength.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_get_length_in_pcm_frames_internal(long pDataStream, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_get_length_in_pcm_frames((ma_resource_manager_data_stream *)pDataStream, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_result(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_result_internal(pDataStream.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_result_internal(long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_result((const ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_set_looping(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, long isLooping) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_set_looping_internal(pDataStream.getPointer(), isLooping));
    }

    public static native int ma_resource_manager_data_stream_set_looping_internal(long pDataStream, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return 0);
    	return (jint)ma_resource_manager_data_stream_set_looping((ma_resource_manager_data_stream *)pDataStream, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_resource_manager_data_stream_is_looping(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream) {
        return ma_resource_manager_data_stream_is_looping_internal(pDataStream.getPointer());
    }

    public static native long ma_resource_manager_data_stream_is_looping_internal(long pDataStream);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resource_manager_data_stream_is_looping((const ma_resource_manager_data_stream *)pDataStream);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_stream_get_available_frames(ma_resource_manager_data_stream.ma_resource_manager_data_streamPointer pDataStream, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_resource_manager_data_stream_get_available_frames_internal(pDataStream.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_resource_manager_data_stream_get_available_frames_internal(long pDataStream, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_stream_get_available_frames((ma_resource_manager_data_stream *)pDataStream, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_init_ex(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_resource_manager_data_source_config.ma_resource_manager_data_source_configPointer pConfig, ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_init_ex_internal(pResourceManager.getPointer(), pConfig.getPointer(), pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_init_ex_internal(long pResourceManager, long pConfig, long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_init_ex((ma_resource_manager *)pResourceManager, (const ma_resource_manager_data_source_config *)pConfig, (ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_init(ma_resource_manager.ma_resource_managerPointer pResourceManager, BytePointer pName, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_init_internal(pResourceManager.getPointer(), pName.getPointer(), flags, pNotifications.getPointer(), pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_init_internal(long pResourceManager, long pName, long flags, long pNotifications, long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_source_init((ma_resource_manager *)pResourceManager, (const char *)pName, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_init_w(ma_resource_manager.ma_resource_managerPointer pResourceManager, SIntPointer pName, long flags, ma_resource_manager_pipeline_notifications.ma_resource_manager_pipeline_notificationsPointer pNotifications, ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_init_w_internal(pResourceManager.getPointer(), pName.getPointer(), flags, pNotifications.getPointer(), pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_init_w_internal(long pResourceManager, long pName, long flags, long pNotifications, long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_resource_manager_data_source_init_w((ma_resource_manager *)pResourceManager, (const wchar_t *)pName, (ma_uint32)flags, (const ma_resource_manager_pipeline_notifications *)pNotifications, (ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_init_copy(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pExistingDataSource, ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_init_copy_internal(pResourceManager.getPointer(), pExistingDataSource.getPointer(), pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_init_copy_internal(long pResourceManager, long pExistingDataSource, long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_init_copy((ma_resource_manager *)pResourceManager, (const ma_resource_manager_data_source *)pExistingDataSource, (ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_uninit(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_uninit_internal(pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_uninit_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_uninit((ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_read_pcm_frames(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_read_pcm_frames_internal(pDataSource.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_resource_manager_data_source_read_pcm_frames_internal(long pDataSource, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_resource_manager_data_source_read_pcm_frames((ma_resource_manager_data_source *)pDataSource, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_seek_to_pcm_frame(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, long frameIndex) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_seek_to_pcm_frame_internal(pDataSource.getPointer(), frameIndex));
    }

    public static native int ma_resource_manager_data_source_seek_to_pcm_frame_internal(long pDataSource, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_resource_manager_data_source_seek_to_pcm_frame((ma_resource_manager_data_source *)pDataSource, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_get_data_format(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_get_data_format_internal(pDataSource.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_resource_manager_data_source_get_data_format_internal(long pDataSource, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_resource_manager_data_source_get_data_format((ma_resource_manager_data_source *)pDataSource, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_get_cursor_in_pcm_frames(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_get_cursor_in_pcm_frames_internal(pDataSource.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_resource_manager_data_source_get_cursor_in_pcm_frames_internal(long pDataSource, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_get_cursor_in_pcm_frames((ma_resource_manager_data_source *)pDataSource, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_get_length_in_pcm_frames(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_get_length_in_pcm_frames_internal(pDataSource.getPointer(), pLength.getPointer()));
    }

    public static native int ma_resource_manager_data_source_get_length_in_pcm_frames_internal(long pDataSource, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_get_length_in_pcm_frames((ma_resource_manager_data_source *)pDataSource, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_result(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_result_internal(pDataSource.getPointer()));
    }

    public static native int ma_resource_manager_data_source_result_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_result((const ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_set_looping(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, long isLooping) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_set_looping_internal(pDataSource.getPointer(), isLooping));
    }

    public static native int ma_resource_manager_data_source_set_looping_internal(long pDataSource, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return 0);
    	return (jint)ma_resource_manager_data_source_set_looping((ma_resource_manager_data_source *)pDataSource, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_resource_manager_data_source_is_looping(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource) {
        return ma_resource_manager_data_source_is_looping_internal(pDataSource.getPointer());
    }

    public static native long ma_resource_manager_data_source_is_looping_internal(long pDataSource);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_resource_manager_data_source_is_looping((const ma_resource_manager_data_source *)pDataSource);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_data_source_get_available_frames(ma_resource_manager_data_source.ma_resource_manager_data_sourcePointer pDataSource, UInt64Pointer pAvailableFrames) {
        return ma_result.getByIndex((int) ma_resource_manager_data_source_get_available_frames_internal(pDataSource.getPointer(), pAvailableFrames.getPointer()));
    }

    public static native int ma_resource_manager_data_source_get_available_frames_internal(long pDataSource, long pAvailableFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_data_source_get_available_frames((ma_resource_manager_data_source *)pDataSource, (ma_uint64 *)pAvailableFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_post_job(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_resource_manager_post_job_internal(pResourceManager.getPointer(), pJob.getPointer()));
    }

    public static native int ma_resource_manager_post_job_internal(long pResourceManager, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_post_job((ma_resource_manager *)pResourceManager, (const ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_post_job_quit(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        return ma_result.getByIndex((int) ma_resource_manager_post_job_quit_internal(pResourceManager.getPointer()));
    }

    public static native int ma_resource_manager_post_job_quit_internal(long pResourceManager);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_post_job_quit((ma_resource_manager *)pResourceManager);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_next_job(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_resource_manager_next_job_internal(pResourceManager.getPointer(), pJob.getPointer()));
    }

    public static native int ma_resource_manager_next_job_internal(long pResourceManager, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_next_job((ma_resource_manager *)pResourceManager, (ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_process_job(ma_resource_manager.ma_resource_managerPointer pResourceManager, ma_job.ma_jobPointer pJob) {
        return ma_result.getByIndex((int) ma_resource_manager_process_job_internal(pResourceManager.getPointer(), pJob.getPointer()));
    }

    public static native int ma_resource_manager_process_job_internal(long pResourceManager, long pJob);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_process_job((ma_resource_manager *)pResourceManager, (ma_job *)pJob);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_resource_manager_process_next_job(ma_resource_manager.ma_resource_managerPointer pResourceManager) {
        return ma_result.getByIndex((int) ma_resource_manager_process_next_job_internal(pResourceManager.getPointer()));
    }

    public static native int ma_resource_manager_process_next_job_internal(long pResourceManager);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_resource_manager_process_next_job((ma_resource_manager *)pResourceManager);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_config ma_node_config_init() {
        return new ma_node_config(ma_node_config_init_internal(0), true);
    }

    public static void ma_node_config_init(ma_node_config _retPar) {
        ma_node_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_node_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_node_config* _ret = (ma_node_config*) (_retPar == 0 ? malloc(sizeof(ma_node_config)) : (void*)_retPar);
    	*_ret = ma_node_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_get_heap_size(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_node_config.ma_node_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_node_get_heap_size_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_node_get_heap_size_internal(long pNodeGraph, long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_get_heap_size((ma_node_graph *)pNodeGraph, (const ma_node_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_init_preallocated(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_node_config.ma_node_configPointer pConfig, VoidPointer pHeap, VoidPointer pNode) {
        return ma_result.getByIndex((int) ma_node_init_preallocated_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pHeap.getPointer(), pNode.getPointer()));
    }

    public static native int ma_node_init_preallocated_internal(long pNodeGraph, long pConfig, long pHeap, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_init_preallocated((ma_node_graph *)pNodeGraph, (const ma_node_config *)pConfig, (void *)pHeap, (ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_node_config.ma_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, VoidPointer pNode) {
        return ma_result.getByIndex((int) ma_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_init((ma_node_graph *)pNodeGraph, (const ma_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_node_uninit(VoidPointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_node_uninit((ma_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_node_graph.ma_node_graphPointer ma_node_get_node_graph(VoidPointer pNode) {
        return new ma_node_graph.ma_node_graphPointer(ma_node_get_node_graph_internal(pNode.getPointer()), false);
    }

    public static void ma_node_get_node_graph(VoidPointer pNode, ma_node_graph.ma_node_graphPointer _retPar) {
        _retPar.setPointer(ma_node_get_node_graph_internal(pNode.getPointer()));
    }

    public static native long ma_node_get_node_graph_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_get_node_graph((const ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_input_bus_count(VoidPointer pNode) {
        return ma_node_get_input_bus_count_internal(pNode.getPointer());
    }

    public static native long ma_node_get_input_bus_count_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_get_input_bus_count((const ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_output_bus_count(VoidPointer pNode) {
        return ma_node_get_output_bus_count_internal(pNode.getPointer());
    }

    public static native long ma_node_get_output_bus_count_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_get_output_bus_count((const ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_input_channels(VoidPointer pNode, long inputBusIndex) {
        return ma_node_get_input_channels_internal(pNode.getPointer(), inputBusIndex);
    }

    public static native long ma_node_get_input_channels_internal(long pNode, long inputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, inputBusIndex, 1, return 0);
    	return (jlong)ma_node_get_input_channels((const ma_node *)pNode, (ma_uint32)inputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_output_channels(VoidPointer pNode, long outputBusIndex) {
        return ma_node_get_output_channels_internal(pNode.getPointer(), outputBusIndex);
    }

    public static native long ma_node_get_output_channels_internal(long pNode, long outputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputBusIndex, 1, return 0);
    	return (jlong)ma_node_get_output_channels((const ma_node *)pNode, (ma_uint32)outputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_attach_output_bus(VoidPointer pNode, long outputBusIndex, VoidPointer pOtherNode, long otherNodeInputBusIndex) {
        return ma_result.getByIndex((int) ma_node_attach_output_bus_internal(pNode.getPointer(), outputBusIndex, pOtherNode.getPointer(), otherNodeInputBusIndex));
    }

    public static native int ma_node_attach_output_bus_internal(long pNode, long outputBusIndex, long pOtherNode, long otherNodeInputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, otherNodeInputBusIndex, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputBusIndex, 1, return 0);
    	return (jint)ma_node_attach_output_bus((ma_node *)pNode, (ma_uint32)outputBusIndex, (ma_node *)pOtherNode, (ma_uint32)otherNodeInputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_detach_output_bus(VoidPointer pNode, long outputBusIndex) {
        return ma_result.getByIndex((int) ma_node_detach_output_bus_internal(pNode.getPointer(), outputBusIndex));
    }

    public static native int ma_node_detach_output_bus_internal(long pNode, long outputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputBusIndex, 1, return 0);
    	return (jint)ma_node_detach_output_bus((ma_node *)pNode, (ma_uint32)outputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_detach_all_output_buses(VoidPointer pNode) {
        return ma_result.getByIndex((int) ma_node_detach_all_output_buses_internal(pNode.getPointer()));
    }

    public static native int ma_node_detach_all_output_buses_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_detach_all_output_buses((ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_set_output_bus_volume(VoidPointer pNode, long outputBusIndex, float volume) {
        return ma_result.getByIndex((int) ma_node_set_output_bus_volume_internal(pNode.getPointer(), outputBusIndex, volume));
    }

    public static native int ma_node_set_output_bus_volume_internal(long pNode, long outputBusIndex, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputBusIndex, 1, return 0);
    	return (jint)ma_node_set_output_bus_volume((ma_node *)pNode, (ma_uint32)outputBusIndex, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static float ma_node_get_output_bus_volume(VoidPointer pNode, long outputBusIndex) {
        return ma_node_get_output_bus_volume_internal(pNode.getPointer(), outputBusIndex);
    }

    public static native float ma_node_get_output_bus_volume_internal(long pNode, long outputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, outputBusIndex, 1, return 0);
    	return (jfloat)ma_node_get_output_bus_volume((const ma_node *)pNode, (ma_uint32)outputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_set_state(VoidPointer pNode, ma_node_state state) {
        return ma_result.getByIndex((int) ma_node_set_state_internal(pNode.getPointer(), state.getIndex()));
    }

    public static native int ma_node_set_state_internal(long pNode, int state);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_set_state((ma_node *)pNode, (ma_node_state)state);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_state ma_node_get_state(VoidPointer pNode) {
        return ma_node_state.getByIndex((int) ma_node_get_state_internal(pNode.getPointer()));
    }

    public static native int ma_node_get_state_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_get_state((const ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_set_state_time(VoidPointer pNode, ma_node_state state, long globalTime) {
        return ma_result.getByIndex((int) ma_node_set_state_time_internal(pNode.getPointer(), state.getIndex(), globalTime));
    }

    public static native int ma_node_set_state_time_internal(long pNode, int state, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 2, return 0);
    	return (jint)ma_node_set_state_time((ma_node *)pNode, (ma_node_state)state, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_state_time(VoidPointer pNode, ma_node_state state) {
        return ma_node_get_state_time_internal(pNode.getPointer(), state.getIndex());
    }

    public static native long ma_node_get_state_time_internal(long pNode, int state);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_get_state_time((const ma_node *)pNode, (ma_node_state)state);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_state ma_node_get_state_by_time(VoidPointer pNode, long globalTime) {
        return ma_node_state.getByIndex((int) ma_node_get_state_by_time_internal(pNode.getPointer(), globalTime));
    }

    public static native int ma_node_get_state_by_time_internal(long pNode, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 1, return 0);
    	return (jint)ma_node_get_state_by_time((const ma_node *)pNode, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_state ma_node_get_state_by_time_range(VoidPointer pNode, long globalTimeBeg, long globalTimeEnd) {
        return ma_node_state.getByIndex((int) ma_node_get_state_by_time_range_internal(pNode.getPointer(), globalTimeBeg, globalTimeEnd));
    }

    public static native int ma_node_get_state_by_time_range_internal(long pNode, long globalTimeBeg, long globalTimeEnd);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTimeEnd, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTimeBeg, 1, return 0);
    	return (jint)ma_node_get_state_by_time_range((const ma_node *)pNode, (ma_uint64)globalTimeBeg, (ma_uint64)globalTimeEnd);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_get_time(VoidPointer pNode) {
        return ma_node_get_time_internal(pNode.getPointer());
    }

    public static native long ma_node_get_time_internal(long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_get_time((const ma_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_set_time(VoidPointer pNode, long localTime) {
        return ma_result.getByIndex((int) ma_node_set_time_internal(pNode.getPointer(), localTime));
    }

    public static native int ma_node_set_time_internal(long pNode, long localTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, localTime, 1, return 0);
    	return (jint)ma_node_set_time((ma_node *)pNode, (ma_uint64)localTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_graph_config ma_node_graph_config_init(long channels) {
        return new ma_node_graph_config(ma_node_graph_config_init_internal(channels, 0), true);
    }

    public static void ma_node_graph_config_init(long channels, ma_node_graph_config _retPar) {
        ma_node_graph_config_init_internal(channels, _retPar.getPointer());
    }

    public static native long ma_node_graph_config_init_internal(long channels, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_node_graph_config* _ret = (ma_node_graph_config*) (_retPar == 0 ? malloc(sizeof(ma_node_graph_config)) : (void*)_retPar);
    	*_ret = ma_node_graph_config_init((ma_uint32)channels);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_graph_init(ma_node_graph_config.ma_node_graph_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_node_graph.ma_node_graphPointer pNodeGraph) {
        return ma_result.getByIndex((int) ma_node_graph_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNodeGraph.getPointer()));
    }

    public static native int ma_node_graph_init_internal(long pConfig, long pAllocationCallbacks, long pNodeGraph);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_node_graph_init((const ma_node_graph_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_node_graph *)pNodeGraph);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_node_graph_uninit(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_node_graph_uninit_internal(pNodeGraph.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_node_graph_uninit_internal(long pNodeGraph, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_node_graph_uninit((ma_node_graph *)pNodeGraph, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static VoidPointer ma_node_graph_get_endpoint(ma_node_graph.ma_node_graphPointer pNodeGraph) {
        return new VoidPointer(ma_node_graph_get_endpoint_internal(pNodeGraph.getPointer()), false);
    }

    public static void ma_node_graph_get_endpoint(ma_node_graph.ma_node_graphPointer pNodeGraph, VoidPointer _retPar) {
        _retPar.setPointer(ma_node_graph_get_endpoint_internal(pNodeGraph.getPointer()));
    }

    public static native long ma_node_graph_get_endpoint_internal(long pNodeGraph);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_graph_get_endpoint((ma_node_graph *)pNodeGraph);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_graph_read_pcm_frames(ma_node_graph.ma_node_graphPointer pNodeGraph, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_node_graph_read_pcm_frames_internal(pNodeGraph.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_node_graph_read_pcm_frames_internal(long pNodeGraph, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_node_graph_read_pcm_frames((ma_node_graph *)pNodeGraph, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_graph_get_channels(ma_node_graph.ma_node_graphPointer pNodeGraph) {
        return ma_node_graph_get_channels_internal(pNodeGraph.getPointer());
    }

    public static native long ma_node_graph_get_channels_internal(long pNodeGraph);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_graph_get_channels((const ma_node_graph *)pNodeGraph);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_node_graph_get_time(ma_node_graph.ma_node_graphPointer pNodeGraph) {
        return ma_node_graph_get_time_internal(pNodeGraph.getPointer());
    }

    public static native long ma_node_graph_get_time_internal(long pNodeGraph);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_node_graph_get_time((const ma_node_graph *)pNodeGraph);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_node_graph_set_time(ma_node_graph.ma_node_graphPointer pNodeGraph, long globalTime) {
        return ma_result.getByIndex((int) ma_node_graph_set_time_internal(pNodeGraph.getPointer(), globalTime));
    }

    public static native int ma_node_graph_set_time_internal(long pNodeGraph, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 1, return 0);
    	return (jint)ma_node_graph_set_time((ma_node_graph *)pNodeGraph, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_data_source_node_config ma_data_source_node_config_init(VoidPointer pDataSource) {
        return new ma_data_source_node_config(ma_data_source_node_config_init_internal(pDataSource.getPointer(), 0), true);
    }

    public static void ma_data_source_node_config_init(VoidPointer pDataSource, ma_data_source_node_config _retPar) {
        ma_data_source_node_config_init_internal(pDataSource.getPointer(), _retPar.getPointer());
    }

    public static native long ma_data_source_node_config_init_internal(long pDataSource, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_node_config* _ret = (ma_data_source_node_config*) (_retPar == 0 ? malloc(sizeof(ma_data_source_node_config)) : (void*)_retPar);
    	*_ret = ma_data_source_node_config_init((ma_data_source *)pDataSource);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_data_source_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_data_source_node_config.ma_data_source_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_data_source_node.ma_data_source_nodePointer pDataSourceNode) {
        return ma_result.getByIndex((int) ma_data_source_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pDataSourceNode.getPointer()));
    }

    public static native int ma_data_source_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pDataSourceNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_data_source_node_init((ma_node_graph *)pNodeGraph, (const ma_data_source_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_data_source_node *)pDataSourceNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_data_source_node_uninit(ma_data_source_node.ma_data_source_nodePointer pDataSourceNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_data_source_node_uninit_internal(pDataSourceNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_data_source_node_uninit_internal(long pDataSourceNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_data_source_node_uninit((ma_data_source_node *)pDataSourceNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_data_source_node_set_looping(ma_data_source_node.ma_data_source_nodePointer pDataSourceNode, long isLooping) {
        return ma_result.getByIndex((int) ma_data_source_node_set_looping_internal(pDataSourceNode.getPointer(), isLooping));
    }

    public static native int ma_data_source_node_set_looping_internal(long pDataSourceNode, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return 0);
    	return (jint)ma_data_source_node_set_looping((ma_data_source_node *)pDataSourceNode, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_data_source_node_is_looping(ma_data_source_node.ma_data_source_nodePointer pDataSourceNode) {
        return ma_data_source_node_is_looping_internal(pDataSourceNode.getPointer());
    }

    public static native long ma_data_source_node_is_looping_internal(long pDataSourceNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_data_source_node_is_looping((ma_data_source_node *)pDataSourceNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_splitter_node_config ma_splitter_node_config_init(long channels) {
        return new ma_splitter_node_config(ma_splitter_node_config_init_internal(channels, 0), true);
    }

    public static void ma_splitter_node_config_init(long channels, ma_splitter_node_config _retPar) {
        ma_splitter_node_config_init_internal(channels, _retPar.getPointer());
    }

    public static native long ma_splitter_node_config_init_internal(long channels, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_splitter_node_config* _ret = (ma_splitter_node_config*) (_retPar == 0 ? malloc(sizeof(ma_splitter_node_config)) : (void*)_retPar);
    	*_ret = ma_splitter_node_config_init((ma_uint32)channels);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_splitter_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_splitter_node_config.ma_splitter_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_splitter_node.ma_splitter_nodePointer pSplitterNode) {
        return ma_result.getByIndex((int) ma_splitter_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pSplitterNode.getPointer()));
    }

    public static native int ma_splitter_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pSplitterNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_splitter_node_init((ma_node_graph *)pNodeGraph, (const ma_splitter_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_splitter_node *)pSplitterNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_splitter_node_uninit(ma_splitter_node.ma_splitter_nodePointer pSplitterNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_splitter_node_uninit_internal(pSplitterNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_splitter_node_uninit_internal(long pSplitterNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_splitter_node_uninit((ma_splitter_node *)pSplitterNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_biquad_node_config ma_biquad_node_config_init(long channels, float b0, float b1, float b2, float a0, float a1, float a2) {
        return new ma_biquad_node_config(ma_biquad_node_config_init_internal(channels, b0, b1, b2, a0, a1, a2, 0), true);
    }

    public static void ma_biquad_node_config_init(long channels, float b0, float b1, float b2, float a0, float a1, float a2, ma_biquad_node_config _retPar) {
        ma_biquad_node_config_init_internal(channels, b0, b1, b2, a0, a1, a2, _retPar.getPointer());
    }

    public static native long ma_biquad_node_config_init_internal(long channels, float b0, float b1, float b2, float a0, float a1, float a2, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_biquad_node_config* _ret = (ma_biquad_node_config*) (_retPar == 0 ? malloc(sizeof(ma_biquad_node_config)) : (void*)_retPar);
    	*_ret = ma_biquad_node_config_init((ma_uint32)channels, (float)b0, (float)b1, (float)b2, (float)a0, (float)a1, (float)a2);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_biquad_node_config.ma_biquad_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_biquad_node.ma_biquad_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_biquad_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_biquad_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_node_init((ma_node_graph *)pNodeGraph, (const ma_biquad_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_biquad_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_biquad_node_reinit(ma_biquad_config.ma_biquad_configPointer pConfig, ma_biquad_node.ma_biquad_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_biquad_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_biquad_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_biquad_node_reinit((const ma_biquad_config *)pConfig, (ma_biquad_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_biquad_node_uninit(ma_biquad_node.ma_biquad_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_biquad_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_biquad_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_biquad_node_uninit((ma_biquad_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_lpf_node_config ma_lpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_lpf_node_config(ma_lpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_lpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order, ma_lpf_node_config _retPar) {
        ma_lpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_lpf_node_config_init_internal(long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_lpf_node_config* _ret = (ma_lpf_node_config*) (_retPar == 0 ? malloc(sizeof(ma_lpf_node_config)) : (void*)_retPar);
    	*_ret = ma_lpf_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_lpf_node_config.ma_lpf_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_lpf_node.ma_lpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_lpf_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_lpf_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_node_init((ma_node_graph *)pNodeGraph, (const ma_lpf_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_lpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_lpf_node_reinit(ma_lpf_config.ma_lpf_configPointer pConfig, ma_lpf_node.ma_lpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_lpf_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_lpf_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_lpf_node_reinit((const ma_lpf_config *)pConfig, (ma_lpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_lpf_node_uninit(ma_lpf_node.ma_lpf_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_lpf_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_lpf_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_lpf_node_uninit((ma_lpf_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_hpf_node_config ma_hpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_hpf_node_config(ma_hpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_hpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order, ma_hpf_node_config _retPar) {
        ma_hpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_hpf_node_config_init_internal(long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_hpf_node_config* _ret = (ma_hpf_node_config*) (_retPar == 0 ? malloc(sizeof(ma_hpf_node_config)) : (void*)_retPar);
    	*_ret = ma_hpf_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_hpf_node_config.ma_hpf_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hpf_node.ma_hpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_hpf_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_hpf_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_node_init((ma_node_graph *)pNodeGraph, (const ma_hpf_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hpf_node_reinit(ma_hpf_config.ma_hpf_configPointer pConfig, ma_hpf_node.ma_hpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_hpf_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_hpf_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hpf_node_reinit((const ma_hpf_config *)pConfig, (ma_hpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hpf_node_uninit(ma_hpf_node.ma_hpf_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hpf_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hpf_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hpf_node_uninit((ma_hpf_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_bpf_node_config ma_bpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order) {
        return new ma_bpf_node_config(ma_bpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, 0), true);
    }

    public static void ma_bpf_node_config_init(long channels, long sampleRate, double cutoffFrequency, long order, ma_bpf_node_config _retPar) {
        ma_bpf_node_config_init_internal(channels, sampleRate, cutoffFrequency, order, _retPar.getPointer());
    }

    public static native long ma_bpf_node_config_init_internal(long channels, long sampleRate, double cutoffFrequency, long order, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, order, 3, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_bpf_node_config* _ret = (ma_bpf_node_config*) (_retPar == 0 ? malloc(sizeof(ma_bpf_node_config)) : (void*)_retPar);
    	*_ret = ma_bpf_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)cutoffFrequency, (ma_uint32)order);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_bpf_node_config.ma_bpf_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_bpf_node.ma_bpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_bpf_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_bpf_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_node_init((ma_node_graph *)pNodeGraph, (const ma_bpf_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_bpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_bpf_node_reinit(ma_bpf_config.ma_bpf_configPointer pConfig, ma_bpf_node.ma_bpf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_bpf_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_bpf_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_bpf_node_reinit((const ma_bpf_config *)pConfig, (ma_bpf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_bpf_node_uninit(ma_bpf_node.ma_bpf_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_bpf_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_bpf_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_bpf_node_uninit((ma_bpf_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_notch_node_config ma_notch_node_config_init(long channels, long sampleRate, double q, double frequency) {
        return new ma_notch_node_config(ma_notch_node_config_init_internal(channels, sampleRate, q, frequency, 0), true);
    }

    public static void ma_notch_node_config_init(long channels, long sampleRate, double q, double frequency, ma_notch_node_config _retPar) {
        ma_notch_node_config_init_internal(channels, sampleRate, q, frequency, _retPar.getPointer());
    }

    public static native long ma_notch_node_config_init_internal(long channels, long sampleRate, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_notch_node_config* _ret = (ma_notch_node_config*) (_retPar == 0 ? malloc(sizeof(ma_notch_node_config)) : (void*)_retPar);
    	*_ret = ma_notch_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_notch_node_config.ma_notch_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_notch_node.ma_notch_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_notch_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_notch_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch_node_init((ma_node_graph *)pNodeGraph, (const ma_notch_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_notch_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_notch_node_reinit(ma_notch2_config.ma_notch2_configPointer pConfig, ma_notch_node.ma_notch_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_notch_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_notch_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_notch_node_reinit((const ma_notch_config *)pConfig, (ma_notch_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_notch_node_uninit(ma_notch_node.ma_notch_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_notch_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_notch_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_notch_node_uninit((ma_notch_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_peak_node_config ma_peak_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency) {
        return new ma_peak_node_config(ma_peak_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, 0), true);
    }

    public static void ma_peak_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency, ma_peak_node_config _retPar) {
        ma_peak_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, _retPar.getPointer());
    }

    public static native long ma_peak_node_config_init_internal(long channels, long sampleRate, double gainDB, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_peak_node_config* _ret = (ma_peak_node_config*) (_retPar == 0 ? malloc(sizeof(ma_peak_node_config)) : (void*)_retPar);
    	*_ret = ma_peak_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_peak_node_config.ma_peak_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_peak_node.ma_peak_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_peak_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_peak_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak_node_init((ma_node_graph *)pNodeGraph, (const ma_peak_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_peak_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_peak_node_reinit(ma_peak2_config.ma_peak2_configPointer pConfig, ma_peak_node.ma_peak_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_peak_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_peak_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_peak_node_reinit((const ma_peak_config *)pConfig, (ma_peak_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_peak_node_uninit(ma_peak_node.ma_peak_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_peak_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_peak_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_peak_node_uninit((ma_peak_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_loshelf_node_config ma_loshelf_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency) {
        return new ma_loshelf_node_config(ma_loshelf_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, 0), true);
    }

    public static void ma_loshelf_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency, ma_loshelf_node_config _retPar) {
        ma_loshelf_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, _retPar.getPointer());
    }

    public static native long ma_loshelf_node_config_init_internal(long channels, long sampleRate, double gainDB, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_loshelf_node_config* _ret = (ma_loshelf_node_config*) (_retPar == 0 ? malloc(sizeof(ma_loshelf_node_config)) : (void*)_retPar);
    	*_ret = ma_loshelf_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_loshelf_node_config.ma_loshelf_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_loshelf_node.ma_loshelf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_loshelf_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_loshelf_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf_node_init((ma_node_graph *)pNodeGraph, (const ma_loshelf_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_loshelf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_loshelf_node_reinit(ma_loshelf2_config.ma_loshelf2_configPointer pConfig, ma_loshelf_node.ma_loshelf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_loshelf_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_loshelf_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_loshelf_node_reinit((const ma_loshelf_config *)pConfig, (ma_loshelf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_loshelf_node_uninit(ma_loshelf_node.ma_loshelf_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_loshelf_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_loshelf_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_loshelf_node_uninit((ma_loshelf_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_hishelf_node_config ma_hishelf_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency) {
        return new ma_hishelf_node_config(ma_hishelf_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, 0), true);
    }

    public static void ma_hishelf_node_config_init(long channels, long sampleRate, double gainDB, double q, double frequency, ma_hishelf_node_config _retPar) {
        ma_hishelf_node_config_init_internal(channels, sampleRate, gainDB, q, frequency, _retPar.getPointer());
    }

    public static native long ma_hishelf_node_config_init_internal(long channels, long sampleRate, double gainDB, double q, double frequency, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_hishelf_node_config* _ret = (ma_hishelf_node_config*) (_retPar == 0 ? malloc(sizeof(ma_hishelf_node_config)) : (void*)_retPar);
    	*_ret = ma_hishelf_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (double)gainDB, (double)q, (double)frequency);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_hishelf_node_config.ma_hishelf_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_hishelf_node.ma_hishelf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_hishelf_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pNode.getPointer()));
    }

    public static native int ma_hishelf_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf_node_init((ma_node_graph *)pNodeGraph, (const ma_hishelf_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_hishelf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_hishelf_node_reinit(ma_hishelf2_config.ma_hishelf2_configPointer pConfig, ma_hishelf_node.ma_hishelf_nodePointer pNode) {
        return ma_result.getByIndex((int) ma_hishelf_node_reinit_internal(pConfig.getPointer(), pNode.getPointer()));
    }

    public static native int ma_hishelf_node_reinit_internal(long pConfig, long pNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_hishelf_node_reinit((const ma_hishelf_config *)pConfig, (ma_hishelf_node *)pNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_hishelf_node_uninit(ma_hishelf_node.ma_hishelf_nodePointer pNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_hishelf_node_uninit_internal(pNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_hishelf_node_uninit_internal(long pNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_hishelf_node_uninit((ma_hishelf_node *)pNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_delay_node_config ma_delay_node_config_init(long channels, long sampleRate, long delayInFrames, float decay) {
        return new ma_delay_node_config(ma_delay_node_config_init_internal(channels, sampleRate, delayInFrames, decay, 0), true);
    }

    public static void ma_delay_node_config_init(long channels, long sampleRate, long delayInFrames, float decay, ma_delay_node_config _retPar) {
        ma_delay_node_config_init_internal(channels, sampleRate, delayInFrames, decay, _retPar.getPointer());
    }

    public static native long ma_delay_node_config_init_internal(long channels, long sampleRate, long delayInFrames, float decay, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, delayInFrames, 2, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, sampleRate, 1, return 0);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, channels, 0, return 0);
    	ma_delay_node_config* _ret = (ma_delay_node_config*) (_retPar == 0 ? malloc(sizeof(ma_delay_node_config)) : (void*)_retPar);
    	*_ret = ma_delay_node_config_init((ma_uint32)channels, (ma_uint32)sampleRate, (ma_uint32)delayInFrames, (float)decay);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_delay_node_init(ma_node_graph.ma_node_graphPointer pNodeGraph, ma_delay_node_config.ma_delay_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_delay_node.ma_delay_nodePointer pDelayNode) {
        return ma_result.getByIndex((int) ma_delay_node_init_internal(pNodeGraph.getPointer(), pConfig.getPointer(), pAllocationCallbacks.getPointer(), pDelayNode.getPointer()));
    }

    public static native int ma_delay_node_init_internal(long pNodeGraph, long pConfig, long pAllocationCallbacks, long pDelayNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_delay_node_init((ma_node_graph *)pNodeGraph, (const ma_delay_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_delay_node *)pDelayNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_node_uninit(ma_delay_node.ma_delay_nodePointer pDelayNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_delay_node_uninit_internal(pDelayNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_delay_node_uninit_internal(long pDelayNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_node_uninit((ma_delay_node *)pDelayNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_delay_node_set_wet(ma_delay_node.ma_delay_nodePointer pDelayNode, float value) {
        ma_delay_node_set_wet_internal(pDelayNode.getPointer(), value);
    }

    public static native void ma_delay_node_set_wet_internal(long pDelayNode, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_node_set_wet((ma_delay_node *)pDelayNode, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_node_get_wet(ma_delay_node.ma_delay_nodePointer pDelayNode) {
        return ma_delay_node_get_wet_internal(pDelayNode.getPointer());
    }

    public static native float ma_delay_node_get_wet_internal(long pDelayNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_node_get_wet((const ma_delay_node *)pDelayNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_node_set_dry(ma_delay_node.ma_delay_nodePointer pDelayNode, float value) {
        ma_delay_node_set_dry_internal(pDelayNode.getPointer(), value);
    }

    public static native void ma_delay_node_set_dry_internal(long pDelayNode, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_node_set_dry((ma_delay_node *)pDelayNode, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_node_get_dry(ma_delay_node.ma_delay_nodePointer pDelayNode) {
        return ma_delay_node_get_dry_internal(pDelayNode.getPointer());
    }

    public static native float ma_delay_node_get_dry_internal(long pDelayNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_node_get_dry((const ma_delay_node *)pDelayNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_delay_node_set_decay(ma_delay_node.ma_delay_nodePointer pDelayNode, float value) {
        ma_delay_node_set_decay_internal(pDelayNode.getPointer(), value);
    }

    public static native void ma_delay_node_set_decay_internal(long pDelayNode, float value);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_delay_node_set_decay((ma_delay_node *)pDelayNode, (float)value);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_delay_node_get_decay(ma_delay_node.ma_delay_nodePointer pDelayNode) {
        return ma_delay_node_get_decay_internal(pDelayNode.getPointer());
    }

    public static native float ma_delay_node_get_decay_internal(long pDelayNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_delay_node_get_decay((const ma_delay_node *)pDelayNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_engine_node_config ma_engine_node_config_init(ma_engine.ma_enginePointer pEngine, ma_engine_node_type type, long flags) {
        return new ma_engine_node_config(ma_engine_node_config_init_internal(pEngine.getPointer(), type.getIndex(), flags, 0), true);
    }

    public static void ma_engine_node_config_init(ma_engine.ma_enginePointer pEngine, ma_engine_node_type type, long flags, ma_engine_node_config _retPar) {
        ma_engine_node_config_init_internal(pEngine.getPointer(), type.getIndex(), flags, _retPar.getPointer());
    }

    public static native long ma_engine_node_config_init_internal(long pEngine, int type, long flags, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	ma_engine_node_config* _ret = (ma_engine_node_config*) (_retPar == 0 ? malloc(sizeof(ma_engine_node_config)) : (void*)_retPar);
    	*_ret = ma_engine_node_config_init((ma_engine *)pEngine, (ma_engine_node_type)type, (ma_uint32)flags);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_node_get_heap_size(ma_engine_node_config.ma_engine_node_configPointer pConfig, ULongPointer pHeapSizeInBytes) {
        return ma_result.getByIndex((int) ma_engine_node_get_heap_size_internal(pConfig.getPointer(), pHeapSizeInBytes.getPointer()));
    }

    public static native int ma_engine_node_get_heap_size_internal(long pConfig, long pHeapSizeInBytes);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_node_get_heap_size((const ma_engine_node_config *)pConfig, (size_t *)pHeapSizeInBytes);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_node_init_preallocated(ma_engine_node_config.ma_engine_node_configPointer pConfig, VoidPointer pHeap, ma_engine_node.ma_engine_nodePointer pEngineNode) {
        return ma_result.getByIndex((int) ma_engine_node_init_preallocated_internal(pConfig.getPointer(), pHeap.getPointer(), pEngineNode.getPointer()));
    }

    public static native int ma_engine_node_init_preallocated_internal(long pConfig, long pHeap, long pEngineNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_node_init_preallocated((const ma_engine_node_config *)pConfig, (void *)pHeap, (ma_engine_node *)pEngineNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_node_init(ma_engine_node_config.ma_engine_node_configPointer pConfig, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks, ma_engine_node.ma_engine_nodePointer pEngineNode) {
        return ma_result.getByIndex((int) ma_engine_node_init_internal(pConfig.getPointer(), pAllocationCallbacks.getPointer(), pEngineNode.getPointer()));
    }

    public static native int ma_engine_node_init_internal(long pConfig, long pAllocationCallbacks, long pEngineNode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_node_init((const ma_engine_node_config *)pConfig, (const ma_allocation_callbacks *)pAllocationCallbacks, (ma_engine_node *)pEngineNode);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_node_uninit(ma_engine_node.ma_engine_nodePointer pEngineNode, ma_allocation_callbacks.ma_allocation_callbacksPointer pAllocationCallbacks) {
        ma_engine_node_uninit_internal(pEngineNode.getPointer(), pAllocationCallbacks.getPointer());
    }

    public static native void ma_engine_node_uninit_internal(long pEngineNode, long pAllocationCallbacks);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_engine_node_uninit((ma_engine_node *)pEngineNode, (const ma_allocation_callbacks *)pAllocationCallbacks);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_sound_config ma_sound_config_init() {
        return new ma_sound_config(ma_sound_config_init_internal(0), true);
    }

    public static void ma_sound_config_init(ma_sound_config _retPar) {
        ma_sound_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_sound_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_config* _ret = (ma_sound_config*) (_retPar == 0 ? malloc(sizeof(ma_sound_config)) : (void*)_retPar);
    	*_ret = ma_sound_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_sound_config ma_sound_config_init_2(ma_engine.ma_enginePointer pEngine) {
        return new ma_sound_config(ma_sound_config_init_2_internal(pEngine.getPointer(), 0), true);
    }

    public static void ma_sound_config_init_2(ma_engine.ma_enginePointer pEngine, ma_sound_config _retPar) {
        ma_sound_config_init_2_internal(pEngine.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_config_init_2_internal(long pEngine, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_config* _ret = (ma_sound_config*) (_retPar == 0 ? malloc(sizeof(ma_sound_config)) : (void*)_retPar);
    	*_ret = ma_sound_config_init_2((ma_engine *)pEngine);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_sound_config ma_sound_group_config_init() {
        return new ma_sound_config(ma_sound_group_config_init_internal(0), true);
    }

    public static void ma_sound_group_config_init(ma_sound_config _retPar) {
        ma_sound_group_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_sound_group_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_config* _ret = (ma_sound_group_config*) (_retPar == 0 ? malloc(sizeof(ma_sound_group_config)) : (void*)_retPar);
    	*_ret = ma_sound_group_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_sound_config ma_sound_group_config_init_2(ma_engine.ma_enginePointer pEngine) {
        return new ma_sound_config(ma_sound_group_config_init_2_internal(pEngine.getPointer(), 0), true);
    }

    public static void ma_sound_group_config_init_2(ma_engine.ma_enginePointer pEngine, ma_sound_config _retPar) {
        ma_sound_group_config_init_2_internal(pEngine.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_group_config_init_2_internal(long pEngine, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_config* _ret = (ma_sound_group_config*) (_retPar == 0 ? malloc(sizeof(ma_sound_group_config)) : (void*)_retPar);
    	*_ret = ma_sound_group_config_init_2((ma_engine *)pEngine);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_engine_config ma_engine_config_init() {
        return new ma_engine_config(ma_engine_config_init_internal(0), true);
    }

    public static void ma_engine_config_init(ma_engine_config _retPar) {
        ma_engine_config_init_internal(_retPar.getPointer());
    }

    public static native long ma_engine_config_init_internal(long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_engine_config* _ret = (ma_engine_config*) (_retPar == 0 ? malloc(sizeof(ma_engine_config)) : (void*)_retPar);
    	*_ret = ma_engine_config_init();
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_init(ma_engine_config.ma_engine_configPointer pConfig, ma_engine.ma_enginePointer pEngine) {
        return ma_result.getByIndex((int) ma_engine_init_internal(pConfig.getPointer(), pEngine.getPointer()));
    }

    public static native int ma_engine_init_internal(long pConfig, long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_init((const ma_engine_config *)pConfig, (ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_uninit(ma_engine.ma_enginePointer pEngine) {
        ma_engine_uninit_internal(pEngine.getPointer());
    }

    public static native void ma_engine_uninit_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_engine_uninit((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_result ma_engine_read_pcm_frames(ma_engine.ma_enginePointer pEngine, VoidPointer pFramesOut, long frameCount, UInt64Pointer pFramesRead) {
        return ma_result.getByIndex((int) ma_engine_read_pcm_frames_internal(pEngine.getPointer(), pFramesOut.getPointer(), frameCount, pFramesRead.getPointer()));
    }

    public static native int ma_engine_read_pcm_frames_internal(long pEngine, long pFramesOut, long frameCount, long pFramesRead);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameCount, 2, return 0);
    	return (jint)ma_engine_read_pcm_frames((ma_engine *)pEngine, (void *)pFramesOut, (ma_uint64)frameCount, (ma_uint64 *)pFramesRead);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_node_graph.ma_node_graphPointer ma_engine_get_node_graph(ma_engine.ma_enginePointer pEngine) {
        return new ma_node_graph.ma_node_graphPointer(ma_engine_get_node_graph_internal(pEngine.getPointer()), false);
    }

    public static void ma_engine_get_node_graph(ma_engine.ma_enginePointer pEngine, ma_node_graph.ma_node_graphPointer _retPar) {
        _retPar.setPointer(ma_engine_get_node_graph_internal(pEngine.getPointer()));
    }

    public static native long ma_engine_get_node_graph_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_node_graph((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_resource_manager.ma_resource_managerPointer ma_engine_get_resource_manager(ma_engine.ma_enginePointer pEngine) {
        return new ma_resource_manager.ma_resource_managerPointer(ma_engine_get_resource_manager_internal(pEngine.getPointer()), false);
    }

    public static void ma_engine_get_resource_manager(ma_engine.ma_enginePointer pEngine, ma_resource_manager.ma_resource_managerPointer _retPar) {
        _retPar.setPointer(ma_engine_get_resource_manager_internal(pEngine.getPointer()));
    }

    public static native long ma_engine_get_resource_manager_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_resource_manager((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_device.ma_devicePointer ma_engine_get_device(ma_engine.ma_enginePointer pEngine) {
        return new ma_device.ma_devicePointer(ma_engine_get_device_internal(pEngine.getPointer()), false);
    }

    public static void ma_engine_get_device(ma_engine.ma_enginePointer pEngine, ma_device.ma_devicePointer _retPar) {
        _retPar.setPointer(ma_engine_get_device_internal(pEngine.getPointer()));
    }

    public static native long ma_engine_get_device_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_device((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_log.ma_logPointer ma_engine_get_log(ma_engine.ma_enginePointer pEngine) {
        return new ma_log.ma_logPointer(ma_engine_get_log_internal(pEngine.getPointer()), false);
    }

    public static void ma_engine_get_log(ma_engine.ma_enginePointer pEngine, ma_log.ma_logPointer _retPar) {
        _retPar.setPointer(ma_engine_get_log_internal(pEngine.getPointer()));
    }

    public static native long ma_engine_get_log_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_log((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_engine_get_endpoint(ma_engine.ma_enginePointer pEngine) {
        return new VoidPointer(ma_engine_get_endpoint_internal(pEngine.getPointer()), false);
    }

    public static void ma_engine_get_endpoint(ma_engine.ma_enginePointer pEngine, VoidPointer _retPar) {
        _retPar.setPointer(ma_engine_get_endpoint_internal(pEngine.getPointer()));
    }

    public static native long ma_engine_get_endpoint_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_endpoint((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_time_in_pcm_frames(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_time_in_pcm_frames_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_time_in_pcm_frames_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_time_in_pcm_frames((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_time_in_milliseconds(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_time_in_milliseconds_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_time_in_milliseconds_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_time_in_milliseconds((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_set_time_in_pcm_frames(ma_engine.ma_enginePointer pEngine, long globalTime) {
        return ma_result.getByIndex((int) ma_engine_set_time_in_pcm_frames_internal(pEngine.getPointer(), globalTime));
    }

    public static native int ma_engine_set_time_in_pcm_frames_internal(long pEngine, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 1, return 0);
    	return (jint)ma_engine_set_time_in_pcm_frames((ma_engine *)pEngine, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_set_time_in_milliseconds(ma_engine.ma_enginePointer pEngine, long globalTime) {
        return ma_result.getByIndex((int) ma_engine_set_time_in_milliseconds_internal(pEngine.getPointer(), globalTime));
    }

    public static native int ma_engine_set_time_in_milliseconds_internal(long pEngine, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 1, return 0);
    	return (jint)ma_engine_set_time_in_milliseconds((ma_engine *)pEngine, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_time(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_time_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_time_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_time((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_set_time(ma_engine.ma_enginePointer pEngine, long globalTime) {
        return ma_result.getByIndex((int) ma_engine_set_time_internal(pEngine.getPointer(), globalTime));
    }

    public static native int ma_engine_set_time_internal(long pEngine, long globalTime);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, globalTime, 1, return 0);
    	return (jint)ma_engine_set_time((ma_engine *)pEngine, (ma_uint64)globalTime);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_channels(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_channels_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_channels_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_channels((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_sample_rate(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_sample_rate_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_sample_rate_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_sample_rate((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_start(ma_engine.ma_enginePointer pEngine) {
        return ma_result.getByIndex((int) ma_engine_start_internal(pEngine.getPointer()));
    }

    public static native int ma_engine_start_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_start((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_stop(ma_engine.ma_enginePointer pEngine) {
        return ma_result.getByIndex((int) ma_engine_stop_internal(pEngine.getPointer()));
    }

    public static native int ma_engine_stop_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_stop((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_set_volume(ma_engine.ma_enginePointer pEngine, float volume) {
        return ma_result.getByIndex((int) ma_engine_set_volume_internal(pEngine.getPointer(), volume));
    }

    public static native int ma_engine_set_volume_internal(long pEngine, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_set_volume((ma_engine *)pEngine, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static float ma_engine_get_volume(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_volume_internal(pEngine.getPointer());
    }

    public static native float ma_engine_get_volume_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_engine_get_volume((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_set_gain_db(ma_engine.ma_enginePointer pEngine, float gainDB) {
        return ma_result.getByIndex((int) ma_engine_set_gain_db_internal(pEngine.getPointer(), gainDB));
    }

    public static native int ma_engine_set_gain_db_internal(long pEngine, float gainDB);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_set_gain_db((ma_engine *)pEngine, (float)gainDB);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static float ma_engine_get_gain_db(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_gain_db_internal(pEngine.getPointer());
    }

    public static native float ma_engine_get_gain_db_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_engine_get_gain_db((ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_get_listener_count(ma_engine.ma_enginePointer pEngine) {
        return ma_engine_get_listener_count_internal(pEngine.getPointer());
    }

    public static native long ma_engine_get_listener_count_internal(long pEngine);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_get_listener_count((const ma_engine *)pEngine);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_engine_find_closest_listener(ma_engine.ma_enginePointer pEngine, float absolutePosX, float absolutePosY, float absolutePosZ) {
        return ma_engine_find_closest_listener_internal(pEngine.getPointer(), absolutePosX, absolutePosY, absolutePosZ);
    }

    public static native long ma_engine_find_closest_listener_internal(long pEngine, float absolutePosX, float absolutePosY, float absolutePosZ);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_engine_find_closest_listener((const ma_engine *)pEngine, (float)absolutePosX, (float)absolutePosY, (float)absolutePosZ);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_listener_set_position(ma_engine.ma_enginePointer pEngine, long listenerIndex, float x, float y, float z) {
        ma_engine_listener_set_position_internal(pEngine.getPointer(), listenerIndex, x, y, z);
    }

    public static native void ma_engine_listener_set_position_internal(long pEngine, long listenerIndex, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_position((ma_engine *)pEngine, (ma_uint32)listenerIndex, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_engine_listener_get_position(ma_engine.ma_enginePointer pEngine, long listenerIndex) {
        return new ma_vec3f(ma_engine_listener_get_position_internal(pEngine.getPointer(), listenerIndex, 0), true);
    }

    public static void ma_engine_listener_get_position(ma_engine.ma_enginePointer pEngine, long listenerIndex, ma_vec3f _retPar) {
        ma_engine_listener_get_position_internal(pEngine.getPointer(), listenerIndex, _retPar.getPointer());
    }

    public static native long ma_engine_listener_get_position_internal(long pEngine, long listenerIndex, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return 0);
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_engine_listener_get_position((const ma_engine *)pEngine, (ma_uint32)listenerIndex);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_listener_set_direction(ma_engine.ma_enginePointer pEngine, long listenerIndex, float x, float y, float z) {
        ma_engine_listener_set_direction_internal(pEngine.getPointer(), listenerIndex, x, y, z);
    }

    public static native void ma_engine_listener_set_direction_internal(long pEngine, long listenerIndex, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_direction((ma_engine *)pEngine, (ma_uint32)listenerIndex, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_engine_listener_get_direction(ma_engine.ma_enginePointer pEngine, long listenerIndex) {
        return new ma_vec3f(ma_engine_listener_get_direction_internal(pEngine.getPointer(), listenerIndex, 0), true);
    }

    public static void ma_engine_listener_get_direction(ma_engine.ma_enginePointer pEngine, long listenerIndex, ma_vec3f _retPar) {
        ma_engine_listener_get_direction_internal(pEngine.getPointer(), listenerIndex, _retPar.getPointer());
    }

    public static native long ma_engine_listener_get_direction_internal(long pEngine, long listenerIndex, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return 0);
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_engine_listener_get_direction((const ma_engine *)pEngine, (ma_uint32)listenerIndex);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_listener_set_velocity(ma_engine.ma_enginePointer pEngine, long listenerIndex, float x, float y, float z) {
        ma_engine_listener_set_velocity_internal(pEngine.getPointer(), listenerIndex, x, y, z);
    }

    public static native void ma_engine_listener_set_velocity_internal(long pEngine, long listenerIndex, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_velocity((ma_engine *)pEngine, (ma_uint32)listenerIndex, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_engine_listener_get_velocity(ma_engine.ma_enginePointer pEngine, long listenerIndex) {
        return new ma_vec3f(ma_engine_listener_get_velocity_internal(pEngine.getPointer(), listenerIndex, 0), true);
    }

    public static void ma_engine_listener_get_velocity(ma_engine.ma_enginePointer pEngine, long listenerIndex, ma_vec3f _retPar) {
        ma_engine_listener_get_velocity_internal(pEngine.getPointer(), listenerIndex, _retPar.getPointer());
    }

    public static native long ma_engine_listener_get_velocity_internal(long pEngine, long listenerIndex, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return 0);
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_engine_listener_get_velocity((const ma_engine *)pEngine, (ma_uint32)listenerIndex);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_listener_set_cone(ma_engine.ma_enginePointer pEngine, long listenerIndex, float innerAngleInRadians, float outerAngleInRadians, float outerGain) {
        ma_engine_listener_set_cone_internal(pEngine.getPointer(), listenerIndex, innerAngleInRadians, outerAngleInRadians, outerGain);
    }

    public static native void ma_engine_listener_set_cone_internal(long pEngine, long listenerIndex, float innerAngleInRadians, float outerAngleInRadians, float outerGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_cone((ma_engine *)pEngine, (ma_uint32)listenerIndex, (float)innerAngleInRadians, (float)outerAngleInRadians, (float)outerGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_engine_listener_get_cone(ma_engine.ma_enginePointer pEngine, long listenerIndex, FloatPointer pInnerAngleInRadians, FloatPointer pOuterAngleInRadians, FloatPointer pOuterGain) {
        ma_engine_listener_get_cone_internal(pEngine.getPointer(), listenerIndex, pInnerAngleInRadians.getPointer(), pOuterAngleInRadians.getPointer(), pOuterGain.getPointer());
    }

    public static native void ma_engine_listener_get_cone_internal(long pEngine, long listenerIndex, long pInnerAngleInRadians, long pOuterAngleInRadians, long pOuterGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_get_cone((const ma_engine *)pEngine, (ma_uint32)listenerIndex, (float *)pInnerAngleInRadians, (float *)pOuterAngleInRadians, (float *)pOuterGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_engine_listener_set_world_up(ma_engine.ma_enginePointer pEngine, long listenerIndex, float x, float y, float z) {
        ma_engine_listener_set_world_up_internal(pEngine.getPointer(), listenerIndex, x, y, z);
    }

    public static native void ma_engine_listener_set_world_up_internal(long pEngine, long listenerIndex, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_world_up((ma_engine *)pEngine, (ma_uint32)listenerIndex, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_engine_listener_get_world_up(ma_engine.ma_enginePointer pEngine, long listenerIndex) {
        return new ma_vec3f(ma_engine_listener_get_world_up_internal(pEngine.getPointer(), listenerIndex, 0), true);
    }

    public static void ma_engine_listener_get_world_up(ma_engine.ma_enginePointer pEngine, long listenerIndex, ma_vec3f _retPar) {
        ma_engine_listener_get_world_up_internal(pEngine.getPointer(), listenerIndex, _retPar.getPointer());
    }

    public static native long ma_engine_listener_get_world_up_internal(long pEngine, long listenerIndex, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return 0);
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_engine_listener_get_world_up((const ma_engine *)pEngine, (ma_uint32)listenerIndex);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_engine_listener_set_enabled(ma_engine.ma_enginePointer pEngine, long listenerIndex, long isEnabled) {
        ma_engine_listener_set_enabled_internal(pEngine.getPointer(), listenerIndex, isEnabled);
    }

    public static native void ma_engine_listener_set_enabled_internal(long pEngine, long listenerIndex, long isEnabled);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isEnabled, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_engine_listener_set_enabled((ma_engine *)pEngine, (ma_uint32)listenerIndex, (ma_bool32)isEnabled);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_engine_listener_is_enabled(ma_engine.ma_enginePointer pEngine, long listenerIndex) {
        return ma_engine_listener_is_enabled_internal(pEngine.getPointer(), listenerIndex);
    }

    public static native long ma_engine_listener_is_enabled_internal(long pEngine, long listenerIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return 0);
    	return (jlong)ma_engine_listener_is_enabled((const ma_engine *)pEngine, (ma_uint32)listenerIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_play_sound_ex(ma_engine.ma_enginePointer pEngine, BytePointer pFilePath, VoidPointer pNode, long nodeInputBusIndex) {
        return ma_result.getByIndex((int) ma_engine_play_sound_ex_internal(pEngine.getPointer(), pFilePath.getPointer(), pNode.getPointer(), nodeInputBusIndex));
    }

    public static native int ma_engine_play_sound_ex_internal(long pEngine, long pFilePath, long pNode, long nodeInputBusIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, nodeInputBusIndex, 3, return 0);
    	return (jint)ma_engine_play_sound_ex((ma_engine *)pEngine, (const char *)pFilePath, (ma_node *)pNode, (ma_uint32)nodeInputBusIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_engine_play_sound(ma_engine.ma_enginePointer pEngine, BytePointer pFilePath, ma_sound.ma_soundPointer pGroup) {
        return ma_result.getByIndex((int) ma_engine_play_sound_internal(pEngine.getPointer(), pFilePath.getPointer(), pGroup.getPointer()));
    }

    public static native int ma_engine_play_sound_internal(long pEngine, long pFilePath, long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_engine_play_sound((ma_engine *)pEngine, (const char *)pFilePath, (ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_init_from_file(ma_engine.ma_enginePointer pEngine, BytePointer pFilePath, long flags, ma_sound.ma_soundPointer pGroup, ma_fence.ma_fencePointer pDoneFence, ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_init_from_file_internal(pEngine.getPointer(), pFilePath.getPointer(), flags, pGroup.getPointer(), pDoneFence.getPointer(), pSound.getPointer()));
    }

    public static native int ma_sound_init_from_file_internal(long pEngine, long pFilePath, long flags, long pGroup, long pDoneFence, long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_sound_init_from_file((ma_engine *)pEngine, (const char *)pFilePath, (ma_uint32)flags, (ma_sound_group *)pGroup, (ma_fence *)pDoneFence, (ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_init_from_file_w(ma_engine.ma_enginePointer pEngine, SIntPointer pFilePath, long flags, ma_sound.ma_soundPointer pGroup, ma_fence.ma_fencePointer pDoneFence, ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_init_from_file_w_internal(pEngine.getPointer(), pFilePath.getPointer(), flags, pGroup.getPointer(), pDoneFence.getPointer(), pSound.getPointer()));
    }

    public static native int ma_sound_init_from_file_w_internal(long pEngine, long pFilePath, long flags, long pGroup, long pDoneFence, long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_sound_init_from_file_w((ma_engine *)pEngine, (const wchar_t *)pFilePath, (ma_uint32)flags, (ma_sound_group *)pGroup, (ma_fence *)pDoneFence, (ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_init_copy(ma_engine.ma_enginePointer pEngine, ma_sound.ma_soundPointer pExistingSound, long flags, ma_sound.ma_soundPointer pGroup, ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_init_copy_internal(pEngine.getPointer(), pExistingSound.getPointer(), flags, pGroup.getPointer(), pSound.getPointer()));
    }

    public static native int ma_sound_init_copy_internal(long pEngine, long pExistingSound, long flags, long pGroup, long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_sound_init_copy((ma_engine *)pEngine, (const ma_sound *)pExistingSound, (ma_uint32)flags, (ma_sound_group *)pGroup, (ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_init_from_data_source(ma_engine.ma_enginePointer pEngine, VoidPointer pDataSource, long flags, ma_sound.ma_soundPointer pGroup, ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_init_from_data_source_internal(pEngine.getPointer(), pDataSource.getPointer(), flags, pGroup.getPointer(), pSound.getPointer()));
    }

    public static native int ma_sound_init_from_data_source_internal(long pEngine, long pDataSource, long flags, long pGroup, long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 2, return 0);
    	return (jint)ma_sound_init_from_data_source((ma_engine *)pEngine, (ma_data_source *)pDataSource, (ma_uint32)flags, (ma_sound_group *)pGroup, (ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_init_ex(ma_engine.ma_enginePointer pEngine, ma_sound_config.ma_sound_configPointer pConfig, ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_init_ex_internal(pEngine.getPointer(), pConfig.getPointer(), pSound.getPointer()));
    }

    public static native int ma_sound_init_ex_internal(long pEngine, long pConfig, long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_init_ex((ma_engine *)pEngine, (const ma_sound_config *)pConfig, (ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_uninit(ma_sound.ma_soundPointer pSound) {
        ma_sound_uninit_internal(pSound.getPointer());
    }

    public static native void ma_sound_uninit_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_uninit((ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_engine.ma_enginePointer ma_sound_get_engine(ma_sound.ma_soundPointer pSound) {
        return new ma_engine.ma_enginePointer(ma_sound_get_engine_internal(pSound.getPointer()), false);
    }

    public static void ma_sound_get_engine(ma_sound.ma_soundPointer pSound, ma_engine.ma_enginePointer _retPar) {
        _retPar.setPointer(ma_sound_get_engine_internal(pSound.getPointer()));
    }

    public static native long ma_sound_get_engine_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_engine((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static VoidPointer ma_sound_get_data_source(ma_sound.ma_soundPointer pSound) {
        return new VoidPointer(ma_sound_get_data_source_internal(pSound.getPointer()), false);
    }

    public static void ma_sound_get_data_source(ma_sound.ma_soundPointer pSound, VoidPointer _retPar) {
        _retPar.setPointer(ma_sound_get_data_source_internal(pSound.getPointer()));
    }

    public static native long ma_sound_get_data_source_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_data_source((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_start(ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_start_internal(pSound.getPointer()));
    }

    public static native int ma_sound_start_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_start((ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_stop(ma_sound.ma_soundPointer pSound) {
        return ma_result.getByIndex((int) ma_sound_stop_internal(pSound.getPointer()));
    }

    public static native int ma_sound_stop_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_stop((ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_stop_with_fade_in_pcm_frames(ma_sound.ma_soundPointer pSound, long fadeLengthInFrames) {
        return ma_result.getByIndex((int) ma_sound_stop_with_fade_in_pcm_frames_internal(pSound.getPointer(), fadeLengthInFrames));
    }

    public static native int ma_sound_stop_with_fade_in_pcm_frames_internal(long pSound, long fadeLengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 1, return 0);
    	return (jint)ma_sound_stop_with_fade_in_pcm_frames((ma_sound *)pSound, (ma_uint64)fadeLengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_stop_with_fade_in_milliseconds(ma_sound.ma_soundPointer pSound, long fadeLengthInFrames) {
        return ma_result.getByIndex((int) ma_sound_stop_with_fade_in_milliseconds_internal(pSound.getPointer(), fadeLengthInFrames));
    }

    public static native int ma_sound_stop_with_fade_in_milliseconds_internal(long pSound, long fadeLengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 1, return 0);
    	return (jint)ma_sound_stop_with_fade_in_milliseconds((ma_sound *)pSound, (ma_uint64)fadeLengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_volume(ma_sound.ma_soundPointer pSound, float volume) {
        ma_sound_set_volume_internal(pSound.getPointer(), volume);
    }

    public static native void ma_sound_set_volume_internal(long pSound, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_volume((ma_sound *)pSound, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_volume(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_volume_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_volume_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_volume((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_pan(ma_sound.ma_soundPointer pSound, float pan) {
        ma_sound_set_pan_internal(pSound.getPointer(), pan);
    }

    public static native void ma_sound_set_pan_internal(long pSound, float pan);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_pan((ma_sound *)pSound, (float)pan);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_pan(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_pan_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_pan_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_pan((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_pan_mode(ma_sound.ma_soundPointer pSound, ma_pan_mode panMode) {
        ma_sound_set_pan_mode_internal(pSound.getPointer(), panMode.getIndex());
    }

    public static native void ma_sound_set_pan_mode_internal(long pSound, int panMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_pan_mode((ma_sound *)pSound, (ma_pan_mode)panMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_pan_mode ma_sound_get_pan_mode(ma_sound.ma_soundPointer pSound) {
        return ma_pan_mode.getByIndex((int) ma_sound_get_pan_mode_internal(pSound.getPointer()));
    }

    public static native int ma_sound_get_pan_mode_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_pan_mode((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_pitch(ma_sound.ma_soundPointer pSound, float pitch) {
        ma_sound_set_pitch_internal(pSound.getPointer(), pitch);
    }

    public static native void ma_sound_set_pitch_internal(long pSound, float pitch);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_pitch((ma_sound *)pSound, (float)pitch);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_pitch(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_pitch_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_pitch_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_pitch((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_spatialization_enabled(ma_sound.ma_soundPointer pSound, long enabled) {
        ma_sound_set_spatialization_enabled_internal(pSound.getPointer(), enabled);
    }

    public static native void ma_sound_set_spatialization_enabled_internal(long pSound, long enabled);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, enabled, 1, return);
    	ma_sound_set_spatialization_enabled((ma_sound *)pSound, (ma_bool32)enabled);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_is_spatialization_enabled(ma_sound.ma_soundPointer pSound) {
        return ma_sound_is_spatialization_enabled_internal(pSound.getPointer());
    }

    public static native long ma_sound_is_spatialization_enabled_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_is_spatialization_enabled((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_pinned_listener_index(ma_sound.ma_soundPointer pSound, long listenerIndex) {
        ma_sound_set_pinned_listener_index_internal(pSound.getPointer(), listenerIndex);
    }

    public static native void ma_sound_set_pinned_listener_index_internal(long pSound, long listenerIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_sound_set_pinned_listener_index((ma_sound *)pSound, (ma_uint32)listenerIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_get_pinned_listener_index(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_pinned_listener_index_internal(pSound.getPointer());
    }

    public static native long ma_sound_get_pinned_listener_index_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_pinned_listener_index((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_get_listener_index(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_listener_index_internal(pSound.getPointer());
    }

    public static native long ma_sound_get_listener_index_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_listener_index((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_vec3f ma_sound_get_direction_to_listener(ma_sound.ma_soundPointer pSound) {
        return new ma_vec3f(ma_sound_get_direction_to_listener_internal(pSound.getPointer(), 0), true);
    }

    public static void ma_sound_get_direction_to_listener(ma_sound.ma_soundPointer pSound, ma_vec3f _retPar) {
        ma_sound_get_direction_to_listener_internal(pSound.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_get_direction_to_listener_internal(long pSound, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_get_direction_to_listener((const ma_sound *)pSound);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_position(ma_sound.ma_soundPointer pSound, float x, float y, float z) {
        ma_sound_set_position_internal(pSound.getPointer(), x, y, z);
    }

    public static native void ma_sound_set_position_internal(long pSound, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_position((ma_sound *)pSound, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_get_position(ma_sound.ma_soundPointer pSound) {
        return new ma_vec3f(ma_sound_get_position_internal(pSound.getPointer(), 0), true);
    }

    public static void ma_sound_get_position(ma_sound.ma_soundPointer pSound, ma_vec3f _retPar) {
        ma_sound_get_position_internal(pSound.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_get_position_internal(long pSound, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_get_position((const ma_sound *)pSound);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_direction(ma_sound.ma_soundPointer pSound, float x, float y, float z) {
        ma_sound_set_direction_internal(pSound.getPointer(), x, y, z);
    }

    public static native void ma_sound_set_direction_internal(long pSound, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_direction((ma_sound *)pSound, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_get_direction(ma_sound.ma_soundPointer pSound) {
        return new ma_vec3f(ma_sound_get_direction_internal(pSound.getPointer(), 0), true);
    }

    public static void ma_sound_get_direction(ma_sound.ma_soundPointer pSound, ma_vec3f _retPar) {
        ma_sound_get_direction_internal(pSound.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_get_direction_internal(long pSound, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_get_direction((const ma_sound *)pSound);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_velocity(ma_sound.ma_soundPointer pSound, float x, float y, float z) {
        ma_sound_set_velocity_internal(pSound.getPointer(), x, y, z);
    }

    public static native void ma_sound_set_velocity_internal(long pSound, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_velocity((ma_sound *)pSound, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_get_velocity(ma_sound.ma_soundPointer pSound) {
        return new ma_vec3f(ma_sound_get_velocity_internal(pSound.getPointer(), 0), true);
    }

    public static void ma_sound_get_velocity(ma_sound.ma_soundPointer pSound, ma_vec3f _retPar) {
        ma_sound_get_velocity_internal(pSound.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_get_velocity_internal(long pSound, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_get_velocity((const ma_sound *)pSound);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_attenuation_model(ma_sound.ma_soundPointer pSound, ma_attenuation_model attenuationModel) {
        ma_sound_set_attenuation_model_internal(pSound.getPointer(), attenuationModel.getIndex());
    }

    public static native void ma_sound_set_attenuation_model_internal(long pSound, int attenuationModel);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_attenuation_model((ma_sound *)pSound, (ma_attenuation_model)attenuationModel);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_attenuation_model ma_sound_get_attenuation_model(ma_sound.ma_soundPointer pSound) {
        return ma_attenuation_model.getByIndex((int) ma_sound_get_attenuation_model_internal(pSound.getPointer()));
    }

    public static native int ma_sound_get_attenuation_model_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_attenuation_model((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_positioning(ma_sound.ma_soundPointer pSound, ma_positioning positioning) {
        ma_sound_set_positioning_internal(pSound.getPointer(), positioning.getIndex());
    }

    public static native void ma_sound_set_positioning_internal(long pSound, int positioning);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_positioning((ma_sound *)pSound, (ma_positioning)positioning);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_positioning ma_sound_get_positioning(ma_sound.ma_soundPointer pSound) {
        return ma_positioning.getByIndex((int) ma_sound_get_positioning_internal(pSound.getPointer()));
    }

    public static native int ma_sound_get_positioning_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_positioning((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_rolloff(ma_sound.ma_soundPointer pSound, float rolloff) {
        ma_sound_set_rolloff_internal(pSound.getPointer(), rolloff);
    }

    public static native void ma_sound_set_rolloff_internal(long pSound, float rolloff);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_rolloff((ma_sound *)pSound, (float)rolloff);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_rolloff(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_rolloff_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_rolloff_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_rolloff((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_min_gain(ma_sound.ma_soundPointer pSound, float minGain) {
        ma_sound_set_min_gain_internal(pSound.getPointer(), minGain);
    }

    public static native void ma_sound_set_min_gain_internal(long pSound, float minGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_min_gain((ma_sound *)pSound, (float)minGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_min_gain(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_min_gain_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_min_gain_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_min_gain((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_max_gain(ma_sound.ma_soundPointer pSound, float maxGain) {
        ma_sound_set_max_gain_internal(pSound.getPointer(), maxGain);
    }

    public static native void ma_sound_set_max_gain_internal(long pSound, float maxGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_max_gain((ma_sound *)pSound, (float)maxGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_max_gain(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_max_gain_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_max_gain_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_max_gain((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_min_distance(ma_sound.ma_soundPointer pSound, float minDistance) {
        ma_sound_set_min_distance_internal(pSound.getPointer(), minDistance);
    }

    public static native void ma_sound_set_min_distance_internal(long pSound, float minDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_min_distance((ma_sound *)pSound, (float)minDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_min_distance(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_min_distance_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_min_distance_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_min_distance((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_max_distance(ma_sound.ma_soundPointer pSound, float maxDistance) {
        ma_sound_set_max_distance_internal(pSound.getPointer(), maxDistance);
    }

    public static native void ma_sound_set_max_distance_internal(long pSound, float maxDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_max_distance((ma_sound *)pSound, (float)maxDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_max_distance(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_max_distance_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_max_distance_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_max_distance((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_cone(ma_sound.ma_soundPointer pSound, float innerAngleInRadians, float outerAngleInRadians, float outerGain) {
        ma_sound_set_cone_internal(pSound.getPointer(), innerAngleInRadians, outerAngleInRadians, outerGain);
    }

    public static native void ma_sound_set_cone_internal(long pSound, float innerAngleInRadians, float outerAngleInRadians, float outerGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_cone((ma_sound *)pSound, (float)innerAngleInRadians, (float)outerAngleInRadians, (float)outerGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_get_cone(ma_sound.ma_soundPointer pSound, FloatPointer pInnerAngleInRadians, FloatPointer pOuterAngleInRadians, FloatPointer pOuterGain) {
        ma_sound_get_cone_internal(pSound.getPointer(), pInnerAngleInRadians.getPointer(), pOuterAngleInRadians.getPointer(), pOuterGain.getPointer());
    }

    public static native void ma_sound_get_cone_internal(long pSound, long pInnerAngleInRadians, long pOuterAngleInRadians, long pOuterGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_get_cone((const ma_sound *)pSound, (float *)pInnerAngleInRadians, (float *)pOuterAngleInRadians, (float *)pOuterGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_doppler_factor(ma_sound.ma_soundPointer pSound, float dopplerFactor) {
        ma_sound_set_doppler_factor_internal(pSound.getPointer(), dopplerFactor);
    }

    public static native void ma_sound_set_doppler_factor_internal(long pSound, float dopplerFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_doppler_factor((ma_sound *)pSound, (float)dopplerFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_doppler_factor(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_doppler_factor_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_doppler_factor_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_doppler_factor((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_directional_attenuation_factor(ma_sound.ma_soundPointer pSound, float directionalAttenuationFactor) {
        ma_sound_set_directional_attenuation_factor_internal(pSound.getPointer(), directionalAttenuationFactor);
    }

    public static native void ma_sound_set_directional_attenuation_factor_internal(long pSound, float directionalAttenuationFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_set_directional_attenuation_factor((ma_sound *)pSound, (float)directionalAttenuationFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_directional_attenuation_factor(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_directional_attenuation_factor_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_directional_attenuation_factor_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_directional_attenuation_factor((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_fade_in_pcm_frames(ma_sound.ma_soundPointer pSound, float volumeBeg, float volumeEnd, long fadeLengthInFrames) {
        ma_sound_set_fade_in_pcm_frames_internal(pSound.getPointer(), volumeBeg, volumeEnd, fadeLengthInFrames);
    }

    public static native void ma_sound_set_fade_in_pcm_frames_internal(long pSound, float volumeBeg, float volumeEnd, long fadeLengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 3, return);
    	ma_sound_set_fade_in_pcm_frames((ma_sound *)pSound, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_fade_in_milliseconds(ma_sound.ma_soundPointer pSound, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds) {
        ma_sound_set_fade_in_milliseconds_internal(pSound.getPointer(), volumeBeg, volumeEnd, fadeLengthInMilliseconds);
    }

    public static native void ma_sound_set_fade_in_milliseconds_internal(long pSound, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInMilliseconds, 3, return);
    	ma_sound_set_fade_in_milliseconds((ma_sound *)pSound, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_fade_start_in_pcm_frames(ma_sound.ma_soundPointer pSound, float volumeBeg, float volumeEnd, long fadeLengthInFrames, long absoluteGlobalTimeInFrames) {
        ma_sound_set_fade_start_in_pcm_frames_internal(pSound.getPointer(), volumeBeg, volumeEnd, fadeLengthInFrames, absoluteGlobalTimeInFrames);
    }

    public static native void ma_sound_set_fade_start_in_pcm_frames_internal(long pSound, float volumeBeg, float volumeEnd, long fadeLengthInFrames, long absoluteGlobalTimeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInFrames, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 3, return);
    	ma_sound_set_fade_start_in_pcm_frames((ma_sound *)pSound, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInFrames, (ma_uint64)absoluteGlobalTimeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_fade_start_in_milliseconds(ma_sound.ma_soundPointer pSound, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds, long absoluteGlobalTimeInMilliseconds) {
        ma_sound_set_fade_start_in_milliseconds_internal(pSound.getPointer(), volumeBeg, volumeEnd, fadeLengthInMilliseconds, absoluteGlobalTimeInMilliseconds);
    }

    public static native void ma_sound_set_fade_start_in_milliseconds_internal(long pSound, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds, long absoluteGlobalTimeInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInMilliseconds, 4, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInMilliseconds, 3, return);
    	ma_sound_set_fade_start_in_milliseconds((ma_sound *)pSound, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInMilliseconds, (ma_uint64)absoluteGlobalTimeInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_get_current_fade_volume(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_current_fade_volume_internal(pSound.getPointer());
    }

    public static native float ma_sound_get_current_fade_volume_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_get_current_fade_volume((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_start_time_in_pcm_frames(ma_sound.ma_soundPointer pSound, long absoluteGlobalTimeInFrames) {
        ma_sound_set_start_time_in_pcm_frames_internal(pSound.getPointer(), absoluteGlobalTimeInFrames);
    }

    public static native void ma_sound_set_start_time_in_pcm_frames_internal(long pSound, long absoluteGlobalTimeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInFrames, 1, return);
    	ma_sound_set_start_time_in_pcm_frames((ma_sound *)pSound, (ma_uint64)absoluteGlobalTimeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_start_time_in_milliseconds(ma_sound.ma_soundPointer pSound, long absoluteGlobalTimeInMilliseconds) {
        ma_sound_set_start_time_in_milliseconds_internal(pSound.getPointer(), absoluteGlobalTimeInMilliseconds);
    }

    public static native void ma_sound_set_start_time_in_milliseconds_internal(long pSound, long absoluteGlobalTimeInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInMilliseconds, 1, return);
    	ma_sound_set_start_time_in_milliseconds((ma_sound *)pSound, (ma_uint64)absoluteGlobalTimeInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_stop_time_in_pcm_frames(ma_sound.ma_soundPointer pSound, long absoluteGlobalTimeInFrames) {
        ma_sound_set_stop_time_in_pcm_frames_internal(pSound.getPointer(), absoluteGlobalTimeInFrames);
    }

    public static native void ma_sound_set_stop_time_in_pcm_frames_internal(long pSound, long absoluteGlobalTimeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInFrames, 1, return);
    	ma_sound_set_stop_time_in_pcm_frames((ma_sound *)pSound, (ma_uint64)absoluteGlobalTimeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_stop_time_in_milliseconds(ma_sound.ma_soundPointer pSound, long absoluteGlobalTimeInMilliseconds) {
        ma_sound_set_stop_time_in_milliseconds_internal(pSound.getPointer(), absoluteGlobalTimeInMilliseconds);
    }

    public static native void ma_sound_set_stop_time_in_milliseconds_internal(long pSound, long absoluteGlobalTimeInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInMilliseconds, 1, return);
    	ma_sound_set_stop_time_in_milliseconds((ma_sound *)pSound, (ma_uint64)absoluteGlobalTimeInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_stop_time_with_fade_in_pcm_frames(ma_sound.ma_soundPointer pSound, long stopAbsoluteGlobalTimeInFrames, long fadeLengthInFrames) {
        ma_sound_set_stop_time_with_fade_in_pcm_frames_internal(pSound.getPointer(), stopAbsoluteGlobalTimeInFrames, fadeLengthInFrames);
    }

    public static native void ma_sound_set_stop_time_with_fade_in_pcm_frames_internal(long pSound, long stopAbsoluteGlobalTimeInFrames, long fadeLengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, stopAbsoluteGlobalTimeInFrames, 1, return);
    	ma_sound_set_stop_time_with_fade_in_pcm_frames((ma_sound *)pSound, (ma_uint64)stopAbsoluteGlobalTimeInFrames, (ma_uint64)fadeLengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_set_stop_time_with_fade_in_milliseconds(ma_sound.ma_soundPointer pSound, long stopAbsoluteGlobalTimeInMilliseconds, long fadeLengthInMilliseconds) {
        ma_sound_set_stop_time_with_fade_in_milliseconds_internal(pSound.getPointer(), stopAbsoluteGlobalTimeInMilliseconds, fadeLengthInMilliseconds);
    }

    public static native void ma_sound_set_stop_time_with_fade_in_milliseconds_internal(long pSound, long stopAbsoluteGlobalTimeInMilliseconds, long fadeLengthInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInMilliseconds, 2, return);
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, stopAbsoluteGlobalTimeInMilliseconds, 1, return);
    	ma_sound_set_stop_time_with_fade_in_milliseconds((ma_sound *)pSound, (ma_uint64)stopAbsoluteGlobalTimeInMilliseconds, (ma_uint64)fadeLengthInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_is_playing(ma_sound.ma_soundPointer pSound) {
        return ma_sound_is_playing_internal(pSound.getPointer());
    }

    public static native long ma_sound_is_playing_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_is_playing((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_get_time_in_pcm_frames(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_time_in_pcm_frames_internal(pSound.getPointer());
    }

    public static native long ma_sound_get_time_in_pcm_frames_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_time_in_pcm_frames((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_get_time_in_milliseconds(ma_sound.ma_soundPointer pSound) {
        return ma_sound_get_time_in_milliseconds_internal(pSound.getPointer());
    }

    public static native long ma_sound_get_time_in_milliseconds_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_get_time_in_milliseconds((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_set_looping(ma_sound.ma_soundPointer pSound, long isLooping) {
        ma_sound_set_looping_internal(pSound.getPointer(), isLooping);
    }

    public static native void ma_sound_set_looping_internal(long pSound, long isLooping);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, isLooping, 1, return);
    	ma_sound_set_looping((ma_sound *)pSound, (ma_bool32)isLooping);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_is_looping(ma_sound.ma_soundPointer pSound) {
        return ma_sound_is_looping_internal(pSound.getPointer());
    }

    public static native long ma_sound_is_looping_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_is_looping((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_at_end(ma_sound.ma_soundPointer pSound) {
        return ma_sound_at_end_internal(pSound.getPointer());
    }

    public static native long ma_sound_at_end_internal(long pSound);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_at_end((const ma_sound *)pSound);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_seek_to_pcm_frame(ma_sound.ma_soundPointer pSound, long frameIndex) {
        return ma_result.getByIndex((int) ma_sound_seek_to_pcm_frame_internal(pSound.getPointer(), frameIndex));
    }

    public static native int ma_sound_seek_to_pcm_frame_internal(long pSound, long frameIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, frameIndex, 1, return 0);
    	return (jint)ma_sound_seek_to_pcm_frame((ma_sound *)pSound, (ma_uint64)frameIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_seek_to_second(ma_sound.ma_soundPointer pSound, float seekPointInSeconds) {
        return ma_result.getByIndex((int) ma_sound_seek_to_second_internal(pSound.getPointer(), seekPointInSeconds));
    }

    public static native int ma_sound_seek_to_second_internal(long pSound, float seekPointInSeconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_seek_to_second((ma_sound *)pSound, (float)seekPointInSeconds);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_get_data_format(ma_sound.ma_soundPointer pSound, ma_format.ma_formatPointer pFormat, UIntPointer pChannels, UIntPointer pSampleRate, UBytePointer pChannelMap, long channelMapCap) {
        return ma_result.getByIndex((int) ma_sound_get_data_format_internal(pSound.getPointer(), pFormat.getPointer(), pChannels.getPointer(), pSampleRate.getPointer(), pChannelMap.getPointer(), channelMapCap));
    }

    public static native int ma_sound_get_data_format_internal(long pSound, long pFormat, long pChannels, long pSampleRate, long pChannelMap, long channelMapCap);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, size_t, channelMapCap, 5, return 0);
    	return (jint)ma_sound_get_data_format((ma_sound *)pSound, (ma_format *)pFormat, (ma_uint32 *)pChannels, (ma_uint32 *)pSampleRate, (ma_channel *)pChannelMap, (size_t)channelMapCap);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_get_cursor_in_pcm_frames(ma_sound.ma_soundPointer pSound, UInt64Pointer pCursor) {
        return ma_result.getByIndex((int) ma_sound_get_cursor_in_pcm_frames_internal(pSound.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_sound_get_cursor_in_pcm_frames_internal(long pSound, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_cursor_in_pcm_frames((ma_sound *)pSound, (ma_uint64 *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_get_length_in_pcm_frames(ma_sound.ma_soundPointer pSound, UInt64Pointer pLength) {
        return ma_result.getByIndex((int) ma_sound_get_length_in_pcm_frames_internal(pSound.getPointer(), pLength.getPointer()));
    }

    public static native int ma_sound_get_length_in_pcm_frames_internal(long pSound, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_length_in_pcm_frames((ma_sound *)pSound, (ma_uint64 *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_get_cursor_in_seconds(ma_sound.ma_soundPointer pSound, FloatPointer pCursor) {
        return ma_result.getByIndex((int) ma_sound_get_cursor_in_seconds_internal(pSound.getPointer(), pCursor.getPointer()));
    }

    public static native int ma_sound_get_cursor_in_seconds_internal(long pSound, long pCursor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_cursor_in_seconds((ma_sound *)pSound, (float *)pCursor);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_get_length_in_seconds(ma_sound.ma_soundPointer pSound, FloatPointer pLength) {
        return ma_result.getByIndex((int) ma_sound_get_length_in_seconds_internal(pSound.getPointer(), pLength.getPointer()));
    }

    public static native int ma_sound_get_length_in_seconds_internal(long pSound, long pLength);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_get_length_in_seconds((ma_sound *)pSound, (float *)pLength);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_set_end_callback(ma_sound.ma_soundPointer pSound, ClosureObject<GdxMiniaudio.ma_sound_end_proc> callback, VoidPointer pUserData) {
        return ma_result.getByIndex((int) ma_sound_set_end_callback_internal(pSound.getPointer(), callback.getPointer(), pUserData.getPointer()));
    }

    public static native int ma_sound_set_end_callback_internal(long pSound, long callback, long pUserData);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_set_end_callback((ma_sound *)pSound, (ma_sound_end_proc)callback, (void *)pUserData);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_group_init(ma_engine.ma_enginePointer pEngine, long flags, ma_sound.ma_soundPointer pParentGroup, ma_sound.ma_soundPointer pGroup) {
        return ma_result.getByIndex((int) ma_sound_group_init_internal(pEngine.getPointer(), flags, pParentGroup.getPointer(), pGroup.getPointer()));
    }

    public static native int ma_sound_group_init_internal(long pEngine, long flags, long pParentGroup, long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, flags, 1, return 0);
    	return (jint)ma_sound_group_init((ma_engine *)pEngine, (ma_uint32)flags, (ma_sound_group *)pParentGroup, (ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_group_init_ex(ma_engine.ma_enginePointer pEngine, ma_sound_config.ma_sound_configPointer pConfig, ma_sound.ma_soundPointer pGroup) {
        return ma_result.getByIndex((int) ma_sound_group_init_ex_internal(pEngine.getPointer(), pConfig.getPointer(), pGroup.getPointer()));
    }

    public static native int ma_sound_group_init_ex_internal(long pEngine, long pConfig, long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_init_ex((ma_engine *)pEngine, (const ma_sound_group_config *)pConfig, (ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_uninit(ma_sound.ma_soundPointer pGroup) {
        ma_sound_group_uninit_internal(pGroup.getPointer());
    }

    public static native void ma_sound_group_uninit_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_uninit((ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_engine.ma_enginePointer ma_sound_group_get_engine(ma_sound.ma_soundPointer pGroup) {
        return new ma_engine.ma_enginePointer(ma_sound_group_get_engine_internal(pGroup.getPointer()), false);
    }

    public static void ma_sound_group_get_engine(ma_sound.ma_soundPointer pGroup, ma_engine.ma_enginePointer _retPar) {
        _retPar.setPointer(ma_sound_group_get_engine_internal(pGroup.getPointer()));
    }

    public static native long ma_sound_group_get_engine_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_get_engine((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_group_start(ma_sound.ma_soundPointer pGroup) {
        return ma_result.getByIndex((int) ma_sound_group_start_internal(pGroup.getPointer()));
    }

    public static native int ma_sound_group_start_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_start((ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_result ma_sound_group_stop(ma_sound.ma_soundPointer pGroup) {
        return ma_result.getByIndex((int) ma_sound_group_stop_internal(pGroup.getPointer()));
    }

    public static native int ma_sound_group_stop_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_stop((ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_volume(ma_sound.ma_soundPointer pGroup, float volume) {
        ma_sound_group_set_volume_internal(pGroup.getPointer(), volume);
    }

    public static native void ma_sound_group_set_volume_internal(long pGroup, float volume);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_volume((ma_sound_group *)pGroup, (float)volume);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_volume(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_volume_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_volume_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_volume((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_pan(ma_sound.ma_soundPointer pGroup, float pan) {
        ma_sound_group_set_pan_internal(pGroup.getPointer(), pan);
    }

    public static native void ma_sound_group_set_pan_internal(long pGroup, float pan);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_pan((ma_sound_group *)pGroup, (float)pan);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_pan(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_pan_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_pan_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_pan((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_pan_mode(ma_sound.ma_soundPointer pGroup, ma_pan_mode panMode) {
        ma_sound_group_set_pan_mode_internal(pGroup.getPointer(), panMode.getIndex());
    }

    public static native void ma_sound_group_set_pan_mode_internal(long pGroup, int panMode);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_pan_mode((ma_sound_group *)pGroup, (ma_pan_mode)panMode);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_pan_mode ma_sound_group_get_pan_mode(ma_sound.ma_soundPointer pGroup) {
        return ma_pan_mode.getByIndex((int) ma_sound_group_get_pan_mode_internal(pGroup.getPointer()));
    }

    public static native int ma_sound_group_get_pan_mode_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_get_pan_mode((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_pitch(ma_sound.ma_soundPointer pGroup, float pitch) {
        ma_sound_group_set_pitch_internal(pGroup.getPointer(), pitch);
    }

    public static native void ma_sound_group_set_pitch_internal(long pGroup, float pitch);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_pitch((ma_sound_group *)pGroup, (float)pitch);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_pitch(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_pitch_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_pitch_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_pitch((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_spatialization_enabled(ma_sound.ma_soundPointer pGroup, long enabled) {
        ma_sound_group_set_spatialization_enabled_internal(pGroup.getPointer(), enabled);
    }

    public static native void ma_sound_group_set_spatialization_enabled_internal(long pGroup, long enabled);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_bool32, enabled, 1, return);
    	ma_sound_group_set_spatialization_enabled((ma_sound_group *)pGroup, (ma_bool32)enabled);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_group_is_spatialization_enabled(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_is_spatialization_enabled_internal(pGroup.getPointer());
    }

    public static native long ma_sound_group_is_spatialization_enabled_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_is_spatialization_enabled((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_pinned_listener_index(ma_sound.ma_soundPointer pGroup, long listenerIndex) {
        ma_sound_group_set_pinned_listener_index_internal(pGroup.getPointer(), listenerIndex);
    }

    public static native void ma_sound_group_set_pinned_listener_index_internal(long pGroup, long listenerIndex);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint32, listenerIndex, 1, return);
    	ma_sound_group_set_pinned_listener_index((ma_sound_group *)pGroup, (ma_uint32)listenerIndex);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_group_get_pinned_listener_index(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_pinned_listener_index_internal(pGroup.getPointer());
    }

    public static native long ma_sound_group_get_pinned_listener_index_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_get_pinned_listener_index((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_group_get_listener_index(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_listener_index_internal(pGroup.getPointer());
    }

    public static native long ma_sound_group_get_listener_index_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_get_listener_index((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static ma_vec3f ma_sound_group_get_direction_to_listener(ma_sound.ma_soundPointer pGroup) {
        return new ma_vec3f(ma_sound_group_get_direction_to_listener_internal(pGroup.getPointer(), 0), true);
    }

    public static void ma_sound_group_get_direction_to_listener(ma_sound.ma_soundPointer pGroup, ma_vec3f _retPar) {
        ma_sound_group_get_direction_to_listener_internal(pGroup.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_group_get_direction_to_listener_internal(long pGroup, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_group_get_direction_to_listener((const ma_sound_group *)pGroup);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_position(ma_sound.ma_soundPointer pGroup, float x, float y, float z) {
        ma_sound_group_set_position_internal(pGroup.getPointer(), x, y, z);
    }

    public static native void ma_sound_group_set_position_internal(long pGroup, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_position((ma_sound_group *)pGroup, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_group_get_position(ma_sound.ma_soundPointer pGroup) {
        return new ma_vec3f(ma_sound_group_get_position_internal(pGroup.getPointer(), 0), true);
    }

    public static void ma_sound_group_get_position(ma_sound.ma_soundPointer pGroup, ma_vec3f _retPar) {
        ma_sound_group_get_position_internal(pGroup.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_group_get_position_internal(long pGroup, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_group_get_position((const ma_sound_group *)pGroup);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_direction(ma_sound.ma_soundPointer pGroup, float x, float y, float z) {
        ma_sound_group_set_direction_internal(pGroup.getPointer(), x, y, z);
    }

    public static native void ma_sound_group_set_direction_internal(long pGroup, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_direction((ma_sound_group *)pGroup, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_group_get_direction(ma_sound.ma_soundPointer pGroup) {
        return new ma_vec3f(ma_sound_group_get_direction_internal(pGroup.getPointer(), 0), true);
    }

    public static void ma_sound_group_get_direction(ma_sound.ma_soundPointer pGroup, ma_vec3f _retPar) {
        ma_sound_group_get_direction_internal(pGroup.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_group_get_direction_internal(long pGroup, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_group_get_direction((const ma_sound_group *)pGroup);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_velocity(ma_sound.ma_soundPointer pGroup, float x, float y, float z) {
        ma_sound_group_set_velocity_internal(pGroup.getPointer(), x, y, z);
    }

    public static native void ma_sound_group_set_velocity_internal(long pGroup, float x, float y, float z);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_velocity((ma_sound_group *)pGroup, (float)x, (float)y, (float)z);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_vec3f ma_sound_group_get_velocity(ma_sound.ma_soundPointer pGroup) {
        return new ma_vec3f(ma_sound_group_get_velocity_internal(pGroup.getPointer(), 0), true);
    }

    public static void ma_sound_group_get_velocity(ma_sound.ma_soundPointer pGroup, ma_vec3f _retPar) {
        ma_sound_group_get_velocity_internal(pGroup.getPointer(), _retPar.getPointer());
    }

    public static native long ma_sound_group_get_velocity_internal(long pGroup, long _retPar);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_vec3f* _ret = (ma_vec3f*) (_retPar == 0 ? malloc(sizeof(ma_vec3f)) : (void*)_retPar);
    	*_ret = ma_sound_group_get_velocity((const ma_sound_group *)pGroup);
    	return (jlong)_ret;
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_attenuation_model(ma_sound.ma_soundPointer pGroup, ma_attenuation_model attenuationModel) {
        ma_sound_group_set_attenuation_model_internal(pGroup.getPointer(), attenuationModel.getIndex());
    }

    public static native void ma_sound_group_set_attenuation_model_internal(long pGroup, int attenuationModel);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_attenuation_model((ma_sound_group *)pGroup, (ma_attenuation_model)attenuationModel);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_attenuation_model ma_sound_group_get_attenuation_model(ma_sound.ma_soundPointer pGroup) {
        return ma_attenuation_model.getByIndex((int) ma_sound_group_get_attenuation_model_internal(pGroup.getPointer()));
    }

    public static native int ma_sound_group_get_attenuation_model_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_get_attenuation_model((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_positioning(ma_sound.ma_soundPointer pGroup, ma_positioning positioning) {
        ma_sound_group_set_positioning_internal(pGroup.getPointer(), positioning.getIndex());
    }

    public static native void ma_sound_group_set_positioning_internal(long pGroup, int positioning);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_positioning((ma_sound_group *)pGroup, (ma_positioning)positioning);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static ma_positioning ma_sound_group_get_positioning(ma_sound.ma_soundPointer pGroup) {
        return ma_positioning.getByIndex((int) ma_sound_group_get_positioning_internal(pGroup.getPointer()));
    }

    public static native int ma_sound_group_get_positioning_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jint)ma_sound_group_get_positioning((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_rolloff(ma_sound.ma_soundPointer pGroup, float rolloff) {
        ma_sound_group_set_rolloff_internal(pGroup.getPointer(), rolloff);
    }

    public static native void ma_sound_group_set_rolloff_internal(long pGroup, float rolloff);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_rolloff((ma_sound_group *)pGroup, (float)rolloff);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_rolloff(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_rolloff_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_rolloff_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_rolloff((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_min_gain(ma_sound.ma_soundPointer pGroup, float minGain) {
        ma_sound_group_set_min_gain_internal(pGroup.getPointer(), minGain);
    }

    public static native void ma_sound_group_set_min_gain_internal(long pGroup, float minGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_min_gain((ma_sound_group *)pGroup, (float)minGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_min_gain(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_min_gain_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_min_gain_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_min_gain((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_max_gain(ma_sound.ma_soundPointer pGroup, float maxGain) {
        ma_sound_group_set_max_gain_internal(pGroup.getPointer(), maxGain);
    }

    public static native void ma_sound_group_set_max_gain_internal(long pGroup, float maxGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_max_gain((ma_sound_group *)pGroup, (float)maxGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_max_gain(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_max_gain_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_max_gain_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_max_gain((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_min_distance(ma_sound.ma_soundPointer pGroup, float minDistance) {
        ma_sound_group_set_min_distance_internal(pGroup.getPointer(), minDistance);
    }

    public static native void ma_sound_group_set_min_distance_internal(long pGroup, float minDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_min_distance((ma_sound_group *)pGroup, (float)minDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_min_distance(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_min_distance_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_min_distance_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_min_distance((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_max_distance(ma_sound.ma_soundPointer pGroup, float maxDistance) {
        ma_sound_group_set_max_distance_internal(pGroup.getPointer(), maxDistance);
    }

    public static native void ma_sound_group_set_max_distance_internal(long pGroup, float maxDistance);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_max_distance((ma_sound_group *)pGroup, (float)maxDistance);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_max_distance(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_max_distance_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_max_distance_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_max_distance((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_cone(ma_sound.ma_soundPointer pGroup, float innerAngleInRadians, float outerAngleInRadians, float outerGain) {
        ma_sound_group_set_cone_internal(pGroup.getPointer(), innerAngleInRadians, outerAngleInRadians, outerGain);
    }

    public static native void ma_sound_group_set_cone_internal(long pGroup, float innerAngleInRadians, float outerAngleInRadians, float outerGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_cone((ma_sound_group *)pGroup, (float)innerAngleInRadians, (float)outerAngleInRadians, (float)outerGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_get_cone(ma_sound.ma_soundPointer pGroup, FloatPointer pInnerAngleInRadians, FloatPointer pOuterAngleInRadians, FloatPointer pOuterGain) {
        ma_sound_group_get_cone_internal(pGroup.getPointer(), pInnerAngleInRadians.getPointer(), pOuterAngleInRadians.getPointer(), pOuterGain.getPointer());
    }

    public static native void ma_sound_group_get_cone_internal(long pGroup, long pInnerAngleInRadians, long pOuterAngleInRadians, long pOuterGain);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_get_cone((const ma_sound_group *)pGroup, (float *)pInnerAngleInRadians, (float *)pOuterAngleInRadians, (float *)pOuterGain);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_set_doppler_factor(ma_sound.ma_soundPointer pGroup, float dopplerFactor) {
        ma_sound_group_set_doppler_factor_internal(pGroup.getPointer(), dopplerFactor);
    }

    public static native void ma_sound_group_set_doppler_factor_internal(long pGroup, float dopplerFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_doppler_factor((ma_sound_group *)pGroup, (float)dopplerFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_doppler_factor(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_doppler_factor_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_doppler_factor_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_doppler_factor((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_directional_attenuation_factor(ma_sound.ma_soundPointer pGroup, float directionalAttenuationFactor) {
        ma_sound_group_set_directional_attenuation_factor_internal(pGroup.getPointer(), directionalAttenuationFactor);
    }

    public static native void ma_sound_group_set_directional_attenuation_factor_internal(long pGroup, float directionalAttenuationFactor);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	ma_sound_group_set_directional_attenuation_factor((ma_sound_group *)pGroup, (float)directionalAttenuationFactor);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_directional_attenuation_factor(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_directional_attenuation_factor_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_directional_attenuation_factor_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_directional_attenuation_factor((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_fade_in_pcm_frames(ma_sound.ma_soundPointer pGroup, float volumeBeg, float volumeEnd, long fadeLengthInFrames) {
        ma_sound_group_set_fade_in_pcm_frames_internal(pGroup.getPointer(), volumeBeg, volumeEnd, fadeLengthInFrames);
    }

    public static native void ma_sound_group_set_fade_in_pcm_frames_internal(long pGroup, float volumeBeg, float volumeEnd, long fadeLengthInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInFrames, 3, return);
    	ma_sound_group_set_fade_in_pcm_frames((ma_sound_group *)pGroup, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_set_fade_in_milliseconds(ma_sound.ma_soundPointer pGroup, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds) {
        ma_sound_group_set_fade_in_milliseconds_internal(pGroup.getPointer(), volumeBeg, volumeEnd, fadeLengthInMilliseconds);
    }

    public static native void ma_sound_group_set_fade_in_milliseconds_internal(long pGroup, float volumeBeg, float volumeEnd, long fadeLengthInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, fadeLengthInMilliseconds, 3, return);
    	ma_sound_group_set_fade_in_milliseconds((ma_sound_group *)pGroup, (float)volumeBeg, (float)volumeEnd, (ma_uint64)fadeLengthInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static float ma_sound_group_get_current_fade_volume(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_current_fade_volume_internal(pGroup.getPointer());
    }

    public static native float ma_sound_group_get_current_fade_volume_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jfloat)ma_sound_group_get_current_fade_volume((ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static void ma_sound_group_set_start_time_in_pcm_frames(ma_sound.ma_soundPointer pGroup, long absoluteGlobalTimeInFrames) {
        ma_sound_group_set_start_time_in_pcm_frames_internal(pGroup.getPointer(), absoluteGlobalTimeInFrames);
    }

    public static native void ma_sound_group_set_start_time_in_pcm_frames_internal(long pGroup, long absoluteGlobalTimeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInFrames, 1, return);
    	ma_sound_group_set_start_time_in_pcm_frames((ma_sound_group *)pGroup, (ma_uint64)absoluteGlobalTimeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_set_start_time_in_milliseconds(ma_sound.ma_soundPointer pGroup, long absoluteGlobalTimeInMilliseconds) {
        ma_sound_group_set_start_time_in_milliseconds_internal(pGroup.getPointer(), absoluteGlobalTimeInMilliseconds);
    }

    public static native void ma_sound_group_set_start_time_in_milliseconds_internal(long pGroup, long absoluteGlobalTimeInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInMilliseconds, 1, return);
    	ma_sound_group_set_start_time_in_milliseconds((ma_sound_group *)pGroup, (ma_uint64)absoluteGlobalTimeInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_set_stop_time_in_pcm_frames(ma_sound.ma_soundPointer pGroup, long absoluteGlobalTimeInFrames) {
        ma_sound_group_set_stop_time_in_pcm_frames_internal(pGroup.getPointer(), absoluteGlobalTimeInFrames);
    }

    public static native void ma_sound_group_set_stop_time_in_pcm_frames_internal(long pGroup, long absoluteGlobalTimeInFrames);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInFrames, 1, return);
    	ma_sound_group_set_stop_time_in_pcm_frames((ma_sound_group *)pGroup, (ma_uint64)absoluteGlobalTimeInFrames);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static void ma_sound_group_set_stop_time_in_milliseconds(ma_sound.ma_soundPointer pGroup, long absoluteGlobalTimeInMilliseconds) {
        ma_sound_group_set_stop_time_in_milliseconds_internal(pGroup.getPointer(), absoluteGlobalTimeInMilliseconds);
    }

    public static native void ma_sound_group_set_stop_time_in_milliseconds_internal(long pGroup, long absoluteGlobalTimeInMilliseconds);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	CHECK_AND_THROW_C_TYPE(env, ma_uint64, absoluteGlobalTimeInMilliseconds, 1, return);
    	ma_sound_group_set_stop_time_in_milliseconds((ma_sound_group *)pGroup, (ma_uint64)absoluteGlobalTimeInMilliseconds);
    	HANDLE_JAVA_EXCEPTION_END()
    */

    public static long ma_sound_group_is_playing(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_is_playing_internal(pGroup.getPointer());
    }

    public static native long ma_sound_group_is_playing_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_is_playing((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public static long ma_sound_group_get_time_in_pcm_frames(ma_sound.ma_soundPointer pGroup) {
        return ma_sound_group_get_time_in_pcm_frames_internal(pGroup.getPointer());
    }

    public static native long ma_sound_group_get_time_in_pcm_frames_internal(long pGroup);/*
    	HANDLE_JAVA_EXCEPTION_START()
    	return (jlong)ma_sound_group_get_time_in_pcm_frames((const ma_sound_group *)pGroup);
    	HANDLE_JAVA_EXCEPTION_END()
    	return 0;
    */

    public interface ma_encoder_uninit_proc extends Closure, GdxMiniaudio_Internal.ma_encoder_uninit_proc_Internal {

        void ma_encoder_uninit_proc_call(ma_encoder.ma_encoderPointer pEncoder);
    }

    public interface ma_enum_devices_callback_proc extends Closure, GdxMiniaudio_Internal.ma_enum_devices_callback_proc_Internal {

        long ma_enum_devices_callback_proc_call(ma_context.ma_contextPointer pContext, ma_device_type deviceType, ma_device_info.ma_device_infoPointer pInfo, VoidPointer pUserData);
    }

    public interface ma_encoder_write_proc extends Closure, GdxMiniaudio_Internal.ma_encoder_write_proc_Internal {

        ma_result ma_encoder_write_proc_call(ma_encoder.ma_encoderPointer pEncoder, VoidPointer pBufferIn, long bytesToWrite, ULongPointer pBytesWritten);
    }

    public interface ma_decoder_seek_proc extends Closure, GdxMiniaudio_Internal.ma_decoder_seek_proc_Internal {

        ma_result ma_decoder_seek_proc_call(ma_decoder.ma_decoderPointer pDecoder, long byteOffset, ma_seek_origin origin);
    }

    public interface ma_decoder_tell_proc extends Closure, GdxMiniaudio_Internal.ma_decoder_tell_proc_Internal {

        ma_result ma_decoder_tell_proc_call(ma_decoder.ma_decoderPointer pDecoder, SInt64Pointer pCursor);
    }

    public interface ma_engine_process_proc extends Closure, GdxMiniaudio_Internal.ma_engine_process_proc_Internal {

        void ma_engine_process_proc_call(VoidPointer pUserData, FloatPointer pFramesOut, long frameCount);
    }

    public interface ma_encoder_init_proc extends Closure, GdxMiniaudio_Internal.ma_encoder_init_proc_Internal {

        ma_result ma_encoder_init_proc_call(ma_encoder.ma_encoderPointer pEncoder);
    }

    public interface ma_encoder_write_pcm_frames_proc extends Closure, GdxMiniaudio_Internal.ma_encoder_write_pcm_frames_proc_Internal {

        ma_result ma_encoder_write_pcm_frames_proc_call(ma_encoder.ma_encoderPointer pEncoder, VoidPointer pFramesIn, long frameCount, UInt64Pointer pFramesWritten);
    }

    public interface ma_seek_proc extends Closure, GdxMiniaudio_Internal.ma_seek_proc_Internal {

        ma_result ma_seek_proc_call(VoidPointer pUserData, long offset, ma_seek_origin origin);
    }

    public interface ma_sound_end_proc extends Closure, GdxMiniaudio_Internal.ma_sound_end_proc_Internal {

        void ma_sound_end_proc_call(VoidPointer pUserData, ma_sound.ma_soundPointer pSound);
    }

    public interface ma_device_data_proc extends Closure, GdxMiniaudio_Internal.ma_device_data_proc_Internal {

        void ma_device_data_proc_call(ma_device.ma_devicePointer pDevice, VoidPointer pOutput, VoidPointer pInput, long frameCount);
    }

    public interface ma_job_proc extends Closure, GdxMiniaudio_Internal.ma_job_proc_Internal {

        ma_result ma_job_proc_call(ma_job.ma_jobPointer pJob);
    }

    public interface ma_encoder_seek_proc extends Closure, GdxMiniaudio_Internal.ma_encoder_seek_proc_Internal {

        ma_result ma_encoder_seek_proc_call(ma_encoder.ma_encoderPointer pEncoder, long offset, ma_seek_origin origin);
    }

    public interface ma_log_callback_proc extends Closure, GdxMiniaudio_Internal.ma_log_callback_proc_Internal {

        void ma_log_callback_proc_call(VoidPointer pUserData, long level, BytePointer pMessage);
    }

    public interface ma_read_proc extends Closure, GdxMiniaudio_Internal.ma_read_proc_Internal {

        ma_result ma_read_proc_call(VoidPointer pUserData, VoidPointer pBufferOut, long bytesToRead, ULongPointer pBytesRead);
    }

    public interface ma_device_notification_proc extends Closure, GdxMiniaudio_Internal.ma_device_notification_proc_Internal {

        void ma_device_notification_proc_call(ma_device_notification.ma_device_notificationPointer pNotification);
    }

    public interface ma_tell_proc extends Closure, GdxMiniaudio_Internal.ma_tell_proc_Internal {

        ma_result ma_tell_proc_call(VoidPointer pUserData, SInt64Pointer pCursor);
    }

    public interface ma_decoder_read_proc extends Closure, GdxMiniaudio_Internal.ma_decoder_read_proc_Internal {

        ma_result ma_decoder_read_proc_call(ma_decoder.ma_decoderPointer pDecoder, VoidPointer pBufferOut, long bytesToRead, ULongPointer pBytesRead);
    }

    public interface ma_stop_proc extends Closure, GdxMiniaudio_Internal.ma_stop_proc_Internal {

        void ma_stop_proc_call(ma_device.ma_devicePointer pDevice);
    }

    public interface ma_data_source_get_next_proc extends Closure, GdxMiniaudio_Internal.ma_data_source_get_next_proc_Internal {

        VoidPointer ma_data_source_get_next_proc_call(VoidPointer pDataSource);
    }

    public interface ma_proc extends Closure, GdxMiniaudio_Internal.ma_proc_Internal {

        void ma_proc_call();
    }
}
