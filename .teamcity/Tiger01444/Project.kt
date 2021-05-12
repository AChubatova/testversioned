package Tiger01444

import Tiger01444.buildTypes.*
import Tiger01444.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01444")
    name = "Tiger01444"

    vcsRoot(Tiger01444_cVCSroot)

    buildType(Tiger01444_Hi3)
    buildType(Tiger01444_Hi2)
    buildType(Tiger01444_Hi1)
    buildType(Tiger01444_Hi0)
})
