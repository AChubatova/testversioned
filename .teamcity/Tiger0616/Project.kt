package Tiger0616

import Tiger0616.buildTypes.*
import Tiger0616.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0616")
    name = "Tiger0616"

    vcsRoot(Tiger0616_cVCSroot)

    buildType(Tiger0616_Hi3)
    buildType(Tiger0616_Hi2)
    buildType(Tiger0616_Hi1)
    buildType(Tiger0616_Hi0)
})
