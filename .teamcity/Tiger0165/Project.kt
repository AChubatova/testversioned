package Tiger0165

import Tiger0165.buildTypes.*
import Tiger0165.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0165")
    name = "Tiger0165"

    vcsRoot(Tiger0165_cVCSroot)

    buildType(Tiger0165_Hi0)
    buildType(Tiger0165_Hi1)
    buildType(Tiger0165_Hi2)
    buildType(Tiger0165_Hi3)
})
