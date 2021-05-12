package Tiger0344

import Tiger0344.buildTypes.*
import Tiger0344.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0344")
    name = "Tiger0344"

    vcsRoot(Tiger0344_cVCSroot)

    buildType(Tiger0344_Hi3)
    buildType(Tiger0344_Hi2)
    buildType(Tiger0344_Hi1)
    buildType(Tiger0344_Hi0)
})
