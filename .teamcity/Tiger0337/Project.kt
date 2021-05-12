package Tiger0337

import Tiger0337.buildTypes.*
import Tiger0337.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0337")
    name = "Tiger0337"

    vcsRoot(Tiger0337_cVCSroot)

    buildType(Tiger0337_Hi0)
    buildType(Tiger0337_Hi1)
    buildType(Tiger0337_Hi2)
    buildType(Tiger0337_Hi3)
})
