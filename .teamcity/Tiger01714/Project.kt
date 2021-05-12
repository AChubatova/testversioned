package Tiger01714

import Tiger01714.buildTypes.*
import Tiger01714.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01714")
    name = "Tiger01714"

    vcsRoot(Tiger01714_cVCSroot)

    buildType(Tiger01714_Hi3)
    buildType(Tiger01714_Hi2)
    buildType(Tiger01714_Hi1)
    buildType(Tiger01714_Hi0)
})
