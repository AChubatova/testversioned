package Tiger0715

import Tiger0715.buildTypes.*
import Tiger0715.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0715")
    name = "Tiger0715"

    vcsRoot(Tiger0715_cVCSroot)

    buildType(Tiger0715_Hi3)
    buildType(Tiger0715_Hi2)
    buildType(Tiger0715_Hi1)
    buildType(Tiger0715_Hi0)
})
