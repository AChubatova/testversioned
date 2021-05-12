package Tiger0811

import Tiger0811.buildTypes.*
import Tiger0811.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0811")
    name = "Tiger0811"

    vcsRoot(Tiger0811_cVCSroot)

    buildType(Tiger0811_Hi0)
    buildType(Tiger0811_Hi3)
    buildType(Tiger0811_Hi2)
    buildType(Tiger0811_Hi1)
})
