package Tiger0024

import Tiger0024.buildTypes.*
import Tiger0024.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0024")
    name = "Tiger0024"

    vcsRoot(Tiger0024_cVCSroot)

    buildType(Tiger0024_Hi0)
    buildType(Tiger0024_Hi1)
    buildType(Tiger0024_Hi2)
    buildType(Tiger0024_Hi3)
})
