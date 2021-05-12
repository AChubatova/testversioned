package Tiger01915

import Tiger01915.buildTypes.*
import Tiger01915.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01915")
    name = "Tiger01915"

    vcsRoot(Tiger01915_cVCSroot)

    buildType(Tiger01915_Hi3)
    buildType(Tiger01915_Hi1)
    buildType(Tiger01915_Hi2)
    buildType(Tiger01915_Hi0)
})
