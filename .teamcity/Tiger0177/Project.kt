package Tiger0177

import Tiger0177.buildTypes.*
import Tiger0177.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0177")
    name = "Tiger0177"

    vcsRoot(Tiger0177_cVCSroot)

    buildType(Tiger0177_Hi1)
    buildType(Tiger0177_Hi0)
    buildType(Tiger0177_Hi3)
    buildType(Tiger0177_Hi2)
})
