package Tiger0197

import Tiger0197.buildTypes.*
import Tiger0197.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0197")
    name = "Tiger0197"

    vcsRoot(Tiger0197_cVCSroot)

    buildType(Tiger0197_Hi3)
    buildType(Tiger0197_Hi2)
    buildType(Tiger0197_Hi1)
    buildType(Tiger0197_Hi0)
})
