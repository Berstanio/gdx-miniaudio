#include <stdint.h>
#ifdef __JNIGEN_GENERATOR__
// miniaudio defines `ma_uintptr` weirdly, so we just override it with something, that the generator can handle
typedef uintptr_t ma_uintptr;
#endif
#include <miniaudio.h>
