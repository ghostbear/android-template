/**
 * This object can be used when you have multiple modules
 *
 * Example
 * ```
 * implementation {
 *   implementation(project(Module.library))
 * }
 * ```
 *
 * or
 *
 * ```
 * implementation {
 *   implementation(project(Module.presentation))
 *   implementation(project(Module.domain))
 *   implementation(project(Module.data))
 * }
 * ```
 */
object Module {

    const val app = ":app"

}