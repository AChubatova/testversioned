package Tiger0738

import Tiger0738.buildTypes.*
import Tiger0738.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0738")
    name = "Tiger0738"

    vcsRoot(Tiger0738_cVCSroot)

    buildType(Tiger0738_Hi0)
    buildType(Tiger0738_Hi2)
    buildType(Tiger0738_Hi1)
    buildType(Tiger0738_Hi3)
})
