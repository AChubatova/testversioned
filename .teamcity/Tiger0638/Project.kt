package Tiger0638

import Tiger0638.buildTypes.*
import Tiger0638.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0638")
    name = "Tiger0638"

    vcsRoot(Tiger0638_cVCSroot)

    buildType(Tiger0638_Hi1)
    buildType(Tiger0638_Hi0)
    buildType(Tiger0638_Hi3)
    buildType(Tiger0638_Hi2)
})
