package Tiger0714

import Tiger0714.buildTypes.*
import Tiger0714.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0714")
    name = "Tiger0714"

    vcsRoot(Tiger0714_cVCSroot)

    buildType(Tiger0714_Hi3)
    buildType(Tiger0714_Hi2)
    buildType(Tiger0714_Hi1)
    buildType(Tiger0714_Hi0)
})
